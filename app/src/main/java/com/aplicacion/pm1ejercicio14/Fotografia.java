package com.aplicacion.pm1ejercicio14;

import android.graphics.Bitmap;

public class Fotografia {
    Bitmap imagen;
    String nombre;
    String descripcion;

    public Fotografia(Bitmap imagen,String nombre, String descripcion)
    {
        this.imagen = imagen;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Bitmap getImagen()
    {
        return imagen;
    }
    public String getNombre()
    {
        return nombre;
    }
    public String getDescripcion(){return descripcion;}

}