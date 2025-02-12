package com.example.epssensorsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SensorAdapter extends RecyclerView.Adapter<SensorAdapter.ViewHolder>{
    private List<SensorData> data;

    public SensorAdapter(List<SensorData> data){
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sensor, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position){
        SensorData item = data.get(position);
        holder.sensorImageView.setImageResource(item.getImageResId());
        holder.sensorNameTextView.setText(item.getName());
        holder.sensorValueTextView.setText(String.valueOf(item.getValue())) ;
        holder.sensorUnitTextView.setText(item.getUnit()) ;
        holder.progressBar.setProgress((int)item.getValue());

    }

    @Override
    public int getItemCount () {
        return data.size() ;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView sensorImageView ;
        TextView sensorNameTextView ;
        TextView sensorValueTextView ;
        TextView sensorUnitTextView ;
        ProgressBar progressBar;

        public ViewHolder ( @NonNull View itemView ) {
            super ( itemView ) ;
            sensorImageView = itemView.findViewById(R.id.sensorImageView ) ;
            sensorNameTextView = itemView.findViewById(R.id.sensorNameTextView ) ;
            sensorValueTextView = itemView.findViewById(R.id.sensorValueTextView ) ;
            sensorUnitTextView = itemView.findViewById(R.id.sensorUnitTextView ) ;
            progressBar = itemView.findViewById(R.id.progressBar);
        }
    }
}
