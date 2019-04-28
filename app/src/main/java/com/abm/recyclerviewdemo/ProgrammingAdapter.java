package com.abm.recyclerviewdemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder> {

    // Create a constructor
    // Array to hold the data
    private String[] data;
    public ProgrammingAdapter(String[] data)
    {
        // Assign the data
        this.data = data;
    }

    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        // View create karne ke liye yeh wali class use karein ge
        // Yeh class jitne bhi hamaray Views define hotay hein layout mein, uss ke corresponding humein View object return karti hai
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());

        // View create karein ge iss object ki help se
        View view = inflater.inflate(R.layout.list_item_layout, viewGroup, false);

        // View holder create karein ge
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder holder, int position) {
        String title = data[position];
        holder.txtTitle.setText(title);
    }

    @Override
    public int getItemCount() {

        // Data jo show karna hai uss ka item count kitna hai
        return data.length;
    }

    // View Holder Class

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder{

        // 2 References banein ge
        ImageView imgIcon;
        TextView txtTitle;

        public ProgrammingViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon = (ImageView) itemView.findViewById(R.id.imgIcon);
            txtTitle = (TextView) itemView.findViewById(R.id.txtTitle);
        }
    }
}
