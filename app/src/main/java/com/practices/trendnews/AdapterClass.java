package com.practices.trendnews;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterClass extends RecyclerView.Adapter<MyViewHolder> {

    List<Items> list;
    Context context;

    public AdapterClass(List<Items> list, Context context) {

        this.list = list;
        this.context = context;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_post_layout, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(v);
        return myViewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        final Items item = list.get(position);
        holder.title_text_VH.setText(item.getTitle_item());
        Picasso.get().load(item.getImage_item()).into(holder.imageview_VH);

        holder.itemlayout_VH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(view.getContext(), PostDetails.class);
                intent.putExtra("image", item.getImage_item());
                intent.putExtra("title", item.getTitle_item());
                intent.putExtra("description", item.getDescription_item());
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
