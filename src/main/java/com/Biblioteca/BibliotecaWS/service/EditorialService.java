package com.Biblioteca.BibliotecaWS.service;

import com.Biblioteca.BibliotecaWS.model.Editorial;
import com.Biblioteca.BibliotecaWS.repository.EditorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditorialService {
    @Autowired
    private EditorialRepository editorialRepository;

    public Editorial CrearEditorial(Editorial editorial){return editorialRepository.save(editorial);
    }
    public Editorial updateEditorial(Editorial editorial){
        Editorial AuxCategoria= editorialRepository.findById(editorial.getIdEditorial()).orElse(null);
        if (AuxCategoria!= null)
        {
            return editorialRepository.save(editorial);
        }
        else
        {
            return null;
        }

    }
    public boolean deleteEditorial(int Id)
    {
        Editorial AuxEditorial= editorialRepository.findById(Id).orElse(null);
        if (AuxEditorial!= null)
        {
            editorialRepository.delete(AuxEditorial);
            return true;
        }
        else
        {
            return false;
        }
    }

    public List<Editorial> ListaEditorial(String editorial)
    {
        return editorialRepository.ListaEditorial(editorial);
    }
    public List<Editorial> listaEditorial()
    {
        return editorialRepository.findAll();
    }


}
