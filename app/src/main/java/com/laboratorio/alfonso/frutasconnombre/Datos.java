package com.laboratorio.alfonso.frutasconnombre;

import java.io.Serializable;

public class Datos implements Serializable {

    private int id;
    private String Titulo;
    private int Imagen;

    public Datos(int id, String titulo, int imagen) {
        this.id = id;
        Titulo = titulo;
        Imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }
}
