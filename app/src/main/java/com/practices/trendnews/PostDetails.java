package com.practices.trendnews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class PostDetails extends AppCompatActivity {

    TextView title_v,description_v;
    ImageView image_v,backimg_v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_details);

        title_v=findViewById(R.id.title_details);
        description_v=findViewById(R.id.descriptiontext);
        backimg_v=findViewById(R.id.back_image);
        image_v =findViewById(R.id.image);

        Intent intent= getIntent();
        String title = intent.getStringExtra("title");
        String description = intent.getStringExtra("description");
        String image = intent.getStringExtra("image");

        title_v.setText(title);
        description_v.setText(description);
        Picasso.get().load(image).into(image_v);

        backimg_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}