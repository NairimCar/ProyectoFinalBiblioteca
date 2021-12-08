package com.Biblioteca.BibliotecaWS.controller;

import com.Biblioteca.BibliotecaWS.model.MaterialBibliografico;
import com.Biblioteca.BibliotecaWS.service.MaterialBibliograficoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class MaterialBibliograficoController {

    @Autowired
    private MaterialBibliograficoController materialBibliograficoService;

    @PutMapping("/add")
    public MaterialBibliograficoService crearMB(@RequestBody MaterialBibliografico materialBibliografico)
    {
        return materialBibliograficoService.crearMB(materialBibliografico);
    }

    @PutMapping("/update")
    public MaterialBibliografico updateMB(@RequestBody MaterialBibliografico materialBibliografico)
    {
        return materialBibliograficoService.updateMB(materialBibliografico);
    }

    @DeleteMapping("/{id}")
    public boolean deleteMB(@PathVariable int id)
    {
        return materialBibliograficoService.deleteMB(id);
    }

}
