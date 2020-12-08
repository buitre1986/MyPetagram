package com.example.mypetagramapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class RankingMascota extends AppCompatActivity {

    ArrayList ListMascot;
    private RecyclerView listsMacon;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.ranking_mascota);

        toolbar = findViewById(R.id.MiActionBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton btn=(ImageButton) findViewById(R.id.btnFavorito);
        btn.setVisibility(View.INVISIBLE);

        listsMacon = (RecyclerView) findViewById(R.id.rvMascota2);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        /* GridLayoutManager glm = new GridLayoutManager(this, 2);
        listaMascota.setLayoutManager(glm); */

        listsMacon.setLayoutManager(llm);

        InitializesListMascot();
        initializeAdapter();
    }

    public void InitializesListMascot(){
        ListMascot = new ArrayList<Mascotas>();
        ListMascot.add(new Mascotas(R.drawable.perro12, R.drawable.hueso_bla, "Pucho","12", R.drawable.hueso_ama ));
        ListMascot.add(new Mascotas(R.drawable.perro15, R.drawable.hueso_bla, "Pichichu","6", R.drawable.hueso_ama ));
        ListMascot.add(new Mascotas(R.drawable.perro13, R.drawable.hueso_bla, "Terry","10", R.drawable.hueso_ama ));
        ListMascot.add(new Mascotas(R.drawable.perro11, R.drawable.hueso_bla, "Cuchu","8", R.drawable.hueso_ama ));
        ListMascot.add(new Mascotas(R.drawable.perro14, R.drawable.hueso_bla, "Manchi","9", R.drawable.hueso_ama ));
    }

    public void initializeAdapter(){
        MascotaAdapter mascotaAdapter = new MascotaAdapter(ListMascot);
        listsMacon.setAdapter(mascotaAdapter);
    }
}