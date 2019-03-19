package com.example.prince.hsamp6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String str[] = {"Prince Raj","LearnByExample","Physics","Maths","Chemistry"};
    int[] img = {R.drawable.p4,R.drawable.learn,R.drawable.physics,R.drawable.math,R.drawable.chemistry};
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(this,str,img);
        listView.setAdapter(customAdapter);
       // Toast.makeText(this,Integer.toString(R.drawable.learn),Toast.LENGTH_LONG).show();
      //  Toast.makeText(this,Integer.toString(R.drawable.p4),Toast.LENGTH_LONG).show();
      //  Toast.makeText(this,Integer.toString(R.drawable.picf),Toast.LENGTH_LONG).show();
    }
}
