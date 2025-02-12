package com.example.epssensorsapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<SensorData> data = new ArrayList<>();
        data.add(new SensorData("Température", 25.5, "C", R.drawable.ic_default_sensor));
        data.add(new SensorData("Pression", 1013.25, "hPa", R.drawable.ic_default_sensor));
        data.add(new SensorData("Humidité", 60.7, "%", R.drawable.ic_default_sensor));
        data.add(new SensorData("Tension", 3.3, "V", R.drawable.ic_default_sensor));
        data.add(new SensorData("Courant", 1.2, "A", R.drawable.ic_default_sensor));

        SensorAdapter adapter = new SensorAdapter(data);
        recyclerView.setAdapter(adapter);
    }
}