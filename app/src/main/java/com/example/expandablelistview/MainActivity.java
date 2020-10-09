package com.example.expandablelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String,List<String>> expandableListDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expandableListView = findViewById(R.id.expandableListView);

        expandableListDetail = ExpandableListDataPump.getData();

        expandableListTitle = new ArrayList<>(expandableListDetail.keySet());

        expandableListAdapter = new CustomExpandableListAdapter
                (this,expandableListTitle,expandableListDetail);

        expandableListView.setAdapter(expandableListAdapter);
    }
}