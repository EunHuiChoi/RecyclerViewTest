package com.example.asimplebooklist;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ItemViewHolder>{

    private ArrayList<BookData> bookListData = new ArrayList<>();

    class ItemViewHolder extends RecyclerView.ViewHolder {
        private ImageView bookIcon;
        private TextView bookTitle;
        private TextView bookRate;

        ItemViewHolder(View itemView) {
            super(itemView);

            bookIcon = itemView.findViewById(R.id.bookIcon);
            bookTitle = itemView.findViewById(R.id.bookTitle);
            bookRate = itemView.findViewById(R.id.bookRate);
        }

        void onBind(BookData data) {
            bookIcon.setImageResource(data.getResId());
            bookTitle.setText(data.getTitle());
            bookRate.setText(data.getRate());
        }
    }


    @Override
    public RecyclerAdapter.ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ItemViewHolder(view);
    }

    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.onBind(bookListData.get(position));
    }

    public int getItemCount() {
        return bookListData.size();
    }

    void addItem(BookData data) {
        bookListData.add(data);
    }
}
