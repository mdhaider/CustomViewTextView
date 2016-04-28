package com.ennjapps.customviewtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> items=new ArrayList<String>();
        items.add("nehal");
        items.add("haider");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.my_text_view,items);

        listView=(ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}
