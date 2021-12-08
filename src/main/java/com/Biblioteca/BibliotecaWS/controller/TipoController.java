package com.Biblioteca.BibliotecaWS.controller;

import com.Biblioteca.BibliotecaWS.model.Tipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class TipoController {
    @Autowired
    private TipoController tipoService;

    @PutMapping("/add")
    public Tipo crearTipo(@RequestBody Tipo tipo)
    {
        return tipoService.crearTipo(tipo);
    }

    @PutMapping("/update")
    public Tipo updateTipo(@RequestBody Tipo tipo)
    {
        return tipoService.updateTipo(tipo);
    }

    @DeleteMapping("/{id}")
    public boolean deleteTipo(@PathVariable int id)
    {
        return tipoService.deleteTipo(id);
    }

}
