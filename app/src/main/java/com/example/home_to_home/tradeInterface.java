package com.example.home_to_home;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class tradeInterface extends AppCompatActivity {

    ListView listView;
    List list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trade_interface);

        listView = (ListView)findViewById(R.id.tradeListView);
        list.add("test");
        list.add("test");
        list.add("test");
        list.add("test");
        list.add("test");
        list.add("test");
        list.add("test");
        list.add("test");
        list.add("test");
        list.add("test");
        list.add("pizza");
        list.add("test");
        list.add("test");
        list.add("test");
        list.add("test");

        adapter = new ArrayAdapter(tradeInterface.this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);

    }
}