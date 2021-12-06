package com.Biblioteca.BibliotecaWS.model;

import javax.persistence.*;

@Entity
@Table(name="tipo", schema = "bd_biblioteca")

public class Tipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idTipo;
    private String Tipo;

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }
}
