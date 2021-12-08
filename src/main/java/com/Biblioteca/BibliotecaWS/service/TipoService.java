package com.Biblioteca.BibliotecaWS.service;


import com.Biblioteca.BibliotecaWS.model.MaterialBibliografico;
import com.Biblioteca.BibliotecaWS.model.Tipo;
import com.Biblioteca.BibliotecaWS.repository.MaterialBibliograficoRepository;
import com.Biblioteca.BibliotecaWS.repository.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TipoService {
    @Autowired
    private TipoRepository tipoRepository;

    public Tipo CrearTipo(Tipo tipo){return tipoRepository.save(tipo);
    }
    public Tipo updateTipo(Tipo tipo){
        Tipo Aux= tipoRepository.findById(tipo.getIdTipo()).orElse(null);
        if (Aux!= null)
        {
            return tipoRepository.save(tipo);
        }
        else
        {
            return null;
        }

    }
    public boolean deleteTipo(int Id)
    {
        Tipo AuxTipo= tipoRepository.findById(Id).orElse(null);
        if (AuxTipo!= null)
        {
            tipoRepository.delete(AuxTipo);
            return true;
        }
        else
        {
            return false;
        }
    }

    public List<Tipo> ListarTipo(String tipo)
    {
        return tipoRepository.ListarTipo(tipo);
    }
    public List<Tipo> listarTipo()
    {
        return tipoRepository.findAll();
    }


}
