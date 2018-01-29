package com.example.ayabeltran.furnitureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MaximizedView extends AppCompatActivity {

    ImageView displayimg;
    TextView disptitle;
    TextView dispcost;
    TextView dispdesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maximized_view);

        displayimg = findViewById(R.id.displayimage);
        disptitle = findViewById(R.id.displaytitle);
        dispcost = findViewById(R.id.displaycost);
        dispdesc = findViewById(R.id.displaydecription);


        Bundle extra = getIntent().getExtras();
        String  Key = extra.getString("Key");
        String  Key2 = extra.getString("Key2");
        String  Key3 = extra.getString("Key3");
        int Key4 = extra.getInt("Key4");


        disptitle.setText(Key);
        dispcost.setText(Key2);
        dispdesc.setText(Key3);
        displayimg.setImageResource(Key4);

    }
}
