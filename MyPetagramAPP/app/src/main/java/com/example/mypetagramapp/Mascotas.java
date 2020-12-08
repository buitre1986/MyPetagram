package com.example.mypetagramapp;

public class Mascotas {

    private int foto;
    private int iconoLike;
    private String nombre;
    private String nroLikes;
    private int iconoOk;

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getIconoLike() {
        return iconoLike;
    }

    public void setIconoLike(int iconoLike) {
        this.iconoLike = iconoLike;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroLikes() {
        return nroLikes;
    }

    public void setNroLikes(String nroLikes) {
        this.nroLikes = nroLikes;
    }

    public int getIconoOk() {
        return iconoOk;
    }

    public void setIconoOk(int iconoOk) {
        this.iconoOk = iconoOk;
    }

    public Mascotas(int foto, int iconoLike, String nombre, String nroLikes, int iconoOk) {
        this.foto = foto;
        this.iconoLike = iconoLike;
        this.nombre = nombre;
        this.nroLikes = nroLikes;
        this.iconoOk = iconoOk;
    }
}
