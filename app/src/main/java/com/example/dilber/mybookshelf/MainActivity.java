package com.example.dilber.mybookshelf;

import android.os.StrictMode;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.SearchView;

import com.example.dilber.mybookshelf.Retrofit.ApiInterface;
import com.example.dilber.mybookshelf.Retrofit.ApiUtils;

import com.example.dilber.mybookshelf.Model.Response;
import com.example.dilber.mybookshelf.Model.Work;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import retrofit2.Call;



public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    ApiInterface mService ;

    RecyclerView list;
    LinearLayoutManager lm;
    BookAdapter adapter;
    int id;

    Book book;

    ArrayList<Work> worklist;
    ArrayList<Book> allBooks=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }


        mService=ApiUtils.getService();

        Call<Response> call = mService.callResponse();
        try {
            worklist = call.execute().body().getWorks();
            for (int i = 0 ; i<worklist.size(); i++){
                book = new Book();
                book.bookname = worklist.get(i).getTitle();
                allBooks.add(book);
            }
            generatelist(worklist);
        } catch (IOException e) {
            e.printStackTrace();
        }
        getMenuInflater();

    }



    private void generatelist(ArrayList<Work> booklist ) {

        list = findViewById(R.id.rw_book_list);
        adapter = new BookAdapter(this,booklist);
        list.setAdapter(adapter);

        lm=new LinearLayoutManager(this);
        lm.setOrientation(LinearLayoutManager.VERTICAL);
        list.setLayoutManager(lm);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_menu,menu);
        MenuItem menuItem = menu.findItem(R.id.search_menu_id);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(menuItem);
        searchView.setOnQueryTextListener(this);

        MenuItem menuItem1 =menu.findItem(R.id.order);
        menuItem1.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
               sortBookList();
               return true;
            }

        });
        return true;
    }

    private void sortBookList() {
        Collections.sort(worklist, new Comparator<Work>() {
            @Override
            public int compare(Work lhs, Work rhs) {
                return lhs.getTitle().compareTo(rhs.getTitle());
            }
        });

        adapter.notifyDataSetChanged();

    }


    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        newText = newText.toLowerCase();
        ArrayList<Work> newlist = new ArrayList<>();
        for(Work work : worklist ){
            String name = work.getTitle().toLowerCase();
            if(name.contains(newText))
                newlist.add(work);

        }

        adapter.setFilter(newlist);

        return true;
    }
    
    
}
