package com.Biblioteca.BibliotecaWS.model;

import javax.persistence.*;

@Entity
@Table(name="editorial", schema = "bd_biblioteca")

public class Editorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idEditorial;
    private String editorial;

    public int getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(int idEditorial) {
        this.idEditorial = idEditorial;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
