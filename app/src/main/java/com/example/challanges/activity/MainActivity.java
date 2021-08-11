package com.example.challanges.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.challanges.R;
import com.example.challanges.adapter.Adapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private String names[] = {"Badru Ademola", "Zain Jakande", "Zain Okiro", "Taji Awolowo", "Neema Ojukwu",
    "Zain Jakande", "Badru Ademola", "Zain Jakande", "Zain Okiro", "Taji Awolowo", "Neema Ojukwu",
            "Zain Jakande", "Badru Ademola", "Zain Jakande", "Zain Okiro", "Taji Awolowo", "Neema Ojukwu",
            "Zain Jakande", "Badru Ademola", "Zain Jakande", "Zain Okiro", "Taji Awolowo", "Neema Ojukwu",
            "Zain Jakande"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.myrecyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        adapter = new Adapter(names, this);
        recyclerView.setAdapter(adapter);
    }
}