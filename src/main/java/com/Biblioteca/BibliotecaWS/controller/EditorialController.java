package com.Biblioteca.BibliotecaWS.controller;

import com.Biblioteca.BibliotecaWS.model.Editorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class EditorialController {
    @Autowired
    private EditorialController editorialService;

    @PutMapping("/add")
    public Editorial crearEditorial(@RequestBody Editorial editorial)
    {
        return editorialService.crearEditorial(editorial);
    }
    @PutMapping("/update")
    public Editorial updateEditorial(@RequestBody Editorial editorial)
    {
        return editorialService.updateEditorial(editorial);
    }

    @DeleteMapping("/{id}")
    public boolean deleteEditorial(@PathVariable int id)
    {
        return editorialService.deleteEditorial(id);
    }


}
