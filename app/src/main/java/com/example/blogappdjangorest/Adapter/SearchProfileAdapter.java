package com.example.blogappdjangorest.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.blogappdjangorest.R;
import com.example.blogappdjangorest.activities.ProfileView;

public class SearchProfileAdapter extends RecyclerView.Adapter<SearchProfileAdapter.blogviewhloder> {

    private Context context;

    public SearchProfileAdapter(Context context)
    {
        this.context=context;
    }


    @NonNull
    @Override
    public SearchProfileAdapter.blogviewhloder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.search_profile_item, parent, false);
        return new blogviewhloder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchProfileAdapter.blogviewhloder holder, int position) {

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, ProfileView.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class blogviewhloder extends RecyclerView.ViewHolder {
        public blogviewhloder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
