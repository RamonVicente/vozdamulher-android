package com.thougthworks.vozdamulher.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.thougthworks.vozdamulher.R;
import com.thougthworks.vozdamulher.component.BusListAdapter;
import com.thougthworks.vozdamulher.model.Bus;

import java.util.ArrayList;

public class RankingActivity extends AppCompatActivity {

    private ListView listViewBus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newDelation();
            }
        });

        listViewBus = (ListView) findViewById(R.id.listview);

        ArrayList<Bus> buses = new ArrayList<>();
        buses.add(new Bus ("Circular (Conde da Boa Vista) - Rua do Sol", 101, 47));
        buses.add(new Bus ("Circular (Conde da Boa Vista)", 100, 30));
        buses.add(new Bus ("Ibura/Santa Luzia", 102, 11));

        BusListAdapter rewardsListAdapter = new BusListAdapter (this, R.layout.layout_bus_item, buses);
        listViewBus.setAdapter(rewardsListAdapter);

    }

    private void newDelation() {
        Toast.makeText(this, "Adicionar nova denúncia", Toast.LENGTH_SHORT).show();
    }

}