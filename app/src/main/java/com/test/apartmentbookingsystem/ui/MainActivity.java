package com.test.apartmentbookingsystem.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.test.apartmentbookingsystem.R;
import com.test.apartmentbookingsystem.models.Apartments;
import com.test.apartmentbookingsystem.ui.ApartmentLists.ApartmentListAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvApartmentsListView;
    List<Apartments> apartmentsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvApartmentsListView = findViewById(R.id.rv_apartment_list);

        initData();
        initRecyclerView();
    }

    private void initRecyclerView() {

        ApartmentListAdapter apartmentListAdapter = new ApartmentListAdapter(apartmentsList);
        rvApartmentsListView.setLayoutManager(new LinearLayoutManager(this));
        rvApartmentsListView.setAdapter(apartmentListAdapter);

    }

    private void initData() {
        apartmentsList = new ArrayList<>();
        apartmentsList.add(new Apartments("1A","null" ,1, false, "null"));
        apartmentsList.add(new Apartments("1B","null" ,1, false, "null"));
        apartmentsList.add(new Apartments("1C","null" ,1, true, "null"));
        apartmentsList.add(new Apartments("1D","null" ,1, false, "null"));
        apartmentsList.add(new Apartments("2A","null" ,2, false, "null"));
        apartmentsList.add(new Apartments("2B","null" ,2, true, "null"));
        apartmentsList.add(new Apartments("2C","null" ,2, false, "null"));
        apartmentsList.add(new Apartments("3A","null" ,3, false, "null"));
        apartmentsList.add(new Apartments("3B","null" ,3, false, "null"));
        apartmentsList.add(new Apartments("3C","null" ,3, false, "null"));
    }
}