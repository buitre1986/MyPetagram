package com.example.mypetagramapp;

import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MascotaAdapter extends RecyclerView.Adapter<MascotaAdapter.MascotaViewHolder> {

    ArrayList<Mascotas> Listamascotas;

    public MascotaAdapter(ArrayList<Mascotas> listamascotas) {
        this.Listamascotas = listamascotas;
    }

    //Inflará el Layout y lo pasará al ViewHolder para que obtenga los Views
    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas,parent,false);
        return new MascotaViewHolder(v);
    }


    // Asocia cada elemento de la lista con cada View
    @Override
    public void onBindViewHolder(@NonNull MascotaViewHolder holder, int position) {
        Mascotas mascotas = Listamascotas.get(position);
        holder.imgMascota.setImageResource(mascotas.getFoto());
        holder.tvNombre.setText(mascotas.getNombre());
        holder.tvLikeTotales.setText(mascotas.getNroLikes());
        holder.btnLike.setImageResource(mascotas.getIconoLike());
        holder.imgLike.setImageResource(mascotas.getIconoOk());

        holder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,"Le diste LIKE a la mascota " + mascotas.getNombre(),Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() { // Cantidad de Elementos que tiene mi lista de mascotas
        return Listamascotas.size();
    }

    public static class  MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgMascota;
        private TextView tvNombre;
        private TextView tvLikeTotales;
        private ImageButton btnLike;
        private  ImageButton imgLike;

        public MascotaViewHolder(@NonNull View itemView) {
            super(itemView);
            imgMascota = (ImageView) itemView.findViewById(R.id.imgMascota);
            tvNombre = (TextView) itemView.findViewById(R.id.tvNombre);
            tvLikeTotales = (TextView) itemView.findViewById(R.id.cantLike);
            btnLike = (ImageButton) itemView.findViewById(R.id.btnlike);
            imgLike = (ImageButton) itemView.findViewById(R.id.Likes);
        }
    }


}
