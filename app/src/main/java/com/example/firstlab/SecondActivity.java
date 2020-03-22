package com.example.firstlab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        RecyclerView recyclerView=findViewById(R.id.recycler_view);
        Adapter adapter = new Adapter(this);
        recyclerView.setAdapter(adapter);
    }
}
