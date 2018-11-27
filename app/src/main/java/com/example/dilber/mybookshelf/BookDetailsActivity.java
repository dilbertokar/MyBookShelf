package com.example.dilber.mybookshelf;

import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dilber.mybookshelf.Retrofit.ApiInterface;
import com.example.dilber.mybookshelf.Retrofit.ApiUtils;


import com.squareup.picasso.Picasso;


public class BookDetailsActivity extends Activity {
    TextView name;
    TextView authorname;
    TextView year;

    ImageView cover;

    ApiInterface mService;
    Context context;


    String id,url, syear;
    String details = "details";
    String json = "json";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);

        mService= ApiUtils.getService();

        name = findViewById(R.id.txtname);
        name.setText(getIntent().getExtras().get("bookname").toString());

        authorname = findViewById(R.id.txtauthorname);
        authorname.setText(getIntent().getExtras().get("authorname").toString());

        id = getIntent().getExtras().get("id").toString();

        year=findViewById(R.id.txtyear);

        url = getIntent().getExtras().get("imageurl").toString();
        cover = findViewById(R.id.book_cover);
         Picasso.with(this.context)
                .load(url)
                .into(cover);


         /*
        Call<bookInfo> calldetail = (Call<bookInfo>) ApiUtils.getService().callbookdetails("/b"+id);
        try {
            syear = calldetail.execute().body().getResult().getPublishDate();
            year.setText(syear);
        } catch (IOException e) {
            e.printStackTrace();
        }
        */



    }

}
