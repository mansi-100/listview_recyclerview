package com.example.listview_recyclerview;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myViewholder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView textview1, textview2;
    Context context;

    public myViewholder(@NonNull View itemView) {
        super(itemView);
        context=itemView.getContext();
        imageView = itemView.findViewById(R.id.imageView);
        textview1 = itemView.findViewById(R.id.textview1);
        textview2 = itemView.findViewById(R.id.textview2);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int pos = getAdapterPosition();
                if(pos==0){
                    Toast.makeText(context, "Clicked on item 1", Toast.LENGTH_SHORT).show();

                }
                else if(pos==1){
                    Toast.makeText(context, "second", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
