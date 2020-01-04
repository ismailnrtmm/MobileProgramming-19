package com.ismailnrtmm.myrecyclevieww;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvFak;
    private ArrayList<Fak> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Fakultas di UI");
        }

        rvFak = findViewById(R.id.rv_fak);
        rvFak.setHasFixedSize(true);

        list.addAll(getListFak());
        showRecycleList();
    }

    public ArrayList<Fak> getListFak() {
        String[] dataName = getResources().getStringArray(R.array.data_name);
        String[] dataDescription = getResources().getStringArray(R.array.data_description);
        String[] dataPhoto = getResources().getStringArray(R.array.photo);

        ArrayList<Fak> listFak = new ArrayList<>();
        for (int i = 0; i < dataName.length; i++){
            Fak fak = new Fak();
            fak.setName(dataName[i]);
            fak.setDescription(dataDescription[i]);
            fak.setPhoto(dataPhoto[i]);

            listFak.add(fak);
        }
        return listFak;
    }

    private void showRecycleList(){
        rvFak.setLayoutManager(new LinearLayoutManager(this));
        ListFak listFak = new ListFak(list);
        rvFak.setAdapter(listFak);
    }
}