package com.example.ayabeltran.furnitureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Items> pos = new ArrayList<Items>();
        Items F1 = new Items ("Tokyo", "3000", "Inspired bedding arrangement from Tokyo. ", R.drawable.tokyo);
        pos.add(F1);
        Items F2 = new Items("Champagne","4500","Feel relaxed and luxurious from a timeless luxurious bed.",R.drawable.champagne);
        pos.add(F2);
        Items F3 = new Items ("Samuel","9000","Overlook the perfect view of the seas with the coastal themed bed.",R.drawable.samuel);
        pos.add(F3);


        recyclerView = findViewById(R.id.recyclerView);
        RecyclerAdapter adapter = new RecyclerAdapter(pos, this);
        recyclerView.setAdapter(adapter);
        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_LONG).show();

    }
}
