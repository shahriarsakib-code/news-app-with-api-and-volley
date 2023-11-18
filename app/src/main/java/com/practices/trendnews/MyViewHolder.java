package com.practices.trendnews;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    RelativeLayout itemlayout_VH;
    ImageView imageview_VH;
    TextView title_text_VH, readmore_text_VH;


    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        itemlayout_VH= itemView.findViewById(R.id.item_layout);
        imageview_VH= itemView.findViewById(R.id.image_singlepost_layout);
        title_text_VH= itemView.findViewById(R.id.titletext);
        readmore_text_VH= itemView.findViewById(R.id.readmoretext);

    }
}
