package com.Biblioteca.BibliotecaWS.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="materialbibliografico", schema = "bd_biblioteca")
public class MaterialBibliografico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idMaterialBibliografico;
    private String Titulo;
    private Date FechaLanzamiento;
    private  String edicion;
    private int idEditorial;
    private int idTipo;
    private String estado;

    public int getIdMaterialBibliografico() {
        return idMaterialBibliografico;
    }

    public void setIdMaterialBibliografico(int idMaterialBibliografico) {
        this.idMaterialBibliografico = idMaterialBibliografico;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public Date getFechaLanzamiento() {
        return FechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        FechaLanzamiento = fechaLanzamiento;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public int getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(int idEditorial) {
        this.idEditorial = idEditorial;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
