package com.example.mypetagramapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascotas> ListMascot;
    private RecyclerView listsMacon;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        toolbar = findViewById(R.id.MiActionBar);
        setSupportActionBar(toolbar);

        setContentView(R.layout.activity_main);

        /*
        Button btnSegundo = (Button) findViewById(R.id.btnTest);
        btnSegundo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RankingMascota.class);
                startActivity(intent);
            }
        });
         */

        ImageButton favoritos = (ImageButton) findViewById(R.id.btnFavorito);
        favoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RankingMascota.class);
                startActivity(intent);
            }
        });



        listsMacon = (RecyclerView) findViewById(R.id.rvMascota);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        /* GridLayoutManager glm = new GridLayoutManager(this, 2);
        listsMacon.setLayoutManager(glm); */
        listsMacon.setLayoutManager(llm);
        InitializesListMascot();
        initializeAdapter();


    }

    public void InitializesListMascot(){
        ListMascot = new ArrayList<Mascotas>();

        ListMascot.add(new Mascotas(R.drawable.perro11, R.drawable.hueso_bla, "Cuchu","5", R.drawable.hueso_ama ));
        ListMascot.add(new Mascotas(R.drawable.perro12, R.drawable.hueso_bla, "Pucho","4", R.drawable.hueso_ama ));
        ListMascot.add(new Mascotas(R.drawable.perro13, R.drawable.hueso_bla, "Terry","3", R.drawable.hueso_ama ));
        ListMascot.add(new Mascotas(R.drawable.perro14, R.drawable.hueso_bla, "Manchi","5", R.drawable.hueso_ama ));
        ListMascot.add(new Mascotas(R.drawable.perro15, R.drawable.hueso_bla, "Pichichu","3", R.drawable.hueso_ama ));

    }

    public void initializeAdapter(){
        MascotaAdapter mascotaAdapter = new MascotaAdapter(ListMascot);
        listsMacon.setAdapter(mascotaAdapter);
    }
}