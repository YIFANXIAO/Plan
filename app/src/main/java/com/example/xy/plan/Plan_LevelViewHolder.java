package com.example.xy.plan;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class Plan_LevelViewHolder extends RecyclerView.ViewHolder {
    private final TextView mlevelView;

    Plan_LevelViewHolder(View itemView) {
        super(itemView);
        mlevelView = itemView.findViewById(R.id.level);
    }

    void update(Plan_Level planlevel) {
        mlevelView.setText(planlevel.level);
    }
}
