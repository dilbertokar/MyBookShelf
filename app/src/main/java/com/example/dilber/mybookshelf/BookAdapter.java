package com.example.dilber.mybookshelf;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dilber.mybookshelf.Retrofit.Author;
import com.example.dilber.mybookshelf.Retrofit.Work;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.MyViewHolder> {

    LayoutInflater inf;

    ArrayList<Work> mBooklist;
    Integer coverid;
    ArrayList<Author> authorname;
    String imageurl;
    Context context;



    public BookAdapter(Context context,ArrayList<Work> data){
        inf =LayoutInflater.from(context);
        this.mBooklist=data;
        this.context = context;

    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inf.inflate(R.layout.book_resource_layout,parent,false);
        MyViewHolder holder = new MyViewHolder(v);
        return holder;
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Work mBook = mBooklist.get(position);
        holder.names.setText(mBook.getTitle());

        coverid = mBook.getCoverId();
        imageurl = "http://covers.openlibrary.org/b/ID/"+coverid+"-S.jpg";
        Picasso.with(context)
                .load(imageurl)
                .into(holder.cover);

        authorname = mBook.getAuthors();
        holder.author.setText(authorname.get(0).getName());

    }


    @Override
    public int getItemCount() {
        return mBooklist.size();
    }



    class MyViewHolder extends RecyclerView.ViewHolder
            implements CompoundButton.OnCheckedChangeListener{

        ImageView cover;
        ImageView like;
        TextView names;
        TextView author;

        public MyViewHolder(final View itemView) {
            super(itemView);

            cover = itemView.findViewById(R.id.img_book_cover);
            like=itemView.findViewById(R.id.img_like);
            names=itemView.findViewById(R.id.txt_book_name);
            author=itemView.findViewById(R.id.txt_book_author);




            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent i = new Intent(context,BookDetailsActivity.class);
                    i.putExtra("bookname",mBooklist.get(getAdapterPosition()).getTitle());
                    i.putExtra("authorname",mBooklist.get(getAdapterPosition()).getAuthors().get(0).getName());
                    i.putExtra("id",mBooklist.get(getAdapterPosition()).getLendingEdition());
                    i.putExtra("imageurl","http://covers.openlibrary.org/b/ID/"+mBooklist.get(getAdapterPosition()).getCoverId()+"-S.jpg");
                    context.startActivity(i);
                }
            });
        }




        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            DatabaseReference dbref = FirebaseDatabase.getInstance().getReference("user")
                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                    .child("Favorites");

            int pos = getAdapterPosition();
            Work b = mBooklist.get(pos);

            if(isChecked){

                dbref.child(b.getTitle()).setValue(b);

            }
            else{

                dbref.child(b.getTitle()).setValue(null);

            }

        }
    }

    public void setFilter(ArrayList<Work> newlist){
        mBooklist = new ArrayList<>();
        mBooklist.addAll(newlist);
        notifyDataSetChanged();
    }

}
