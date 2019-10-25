package com.example.asimplebooklist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        getData();
    }

    private void init() {
        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        adapter = new RecyclerAdapter();
        recyclerView.setAdapter(adapter);
    }

    private void getData() {
        List<String> listTitle = Arrays.asList("Book1", "Book2", "Book3", "Book4", "Book5", "Book6", "Book7", "Book8", "Book9", "Book10");
        List<String> listRate = Arrays.asList("Rate1", "Rate2", "Rate3" ,"Rate4", "Rate5", "Rate6", "Rate7", "Rate8", "Rate9", "Rate10");
        List<Integer> listResId = Arrays.asList(R.drawable.booksample, R.drawable.booksample2, R.drawable.booksample3, R.drawable.booksample4, R.drawable.booksample5, R.drawable.booksample6, R.drawable.booksample, R.drawable.booksample2, R.drawable.booksample3, R.drawable.booksample4);

        for (int i = 0; i < listTitle.size(); i++) {
            BookData data = new BookData();
            data.setTitle(listTitle.get(i));
            data.setRate(listRate.get(i));
            data.setResId(listResId.get(i));

            adapter.addItem(data);
        }
        adapter.notifyDataSetChanged();
    }
}
