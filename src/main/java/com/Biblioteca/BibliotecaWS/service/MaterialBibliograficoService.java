package com.Biblioteca.BibliotecaWS.service;

import com.Biblioteca.BibliotecaWS.model.Editorial;
import com.Biblioteca.BibliotecaWS.model.MaterialBibliografico;
import com.Biblioteca.BibliotecaWS.repository.EditorialRepository;
import com.Biblioteca.BibliotecaWS.repository.MaterialBibliograficoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MaterialBibliograficoService {
    @Autowired
    private MaterialBibliograficoRepository materialBibliograficoRepository;

    public MaterialBibliografico CrearMB(MaterialBibliografico materialBibliografico){return materialBibliograficoRepository.save(materialBibliografico);
    }
    public MaterialBibliografico updateMB(MaterialBibliografico materialBibliografico){
        MaterialBibliografico Auxtitulo= materialBibliograficoRepository.findById(materialBibliografico.getIdMaterialBibliografico()).orElse(null);
        if (Auxtitulo!= null)
        {
            return materialBibliograficoRepository.save(materialBibliografico);
        }
        else
        {
            return null;
        }

    }
    public boolean deleteMB(int Id)
    {
        MaterialBibliografico AuxMB= materialBibliograficoRepository.findById(Id).orElse(null);
        if (AuxMB!= null)
        {
            materialBibliograficoRepository.delete(AuxMB);
            return true;
        }
        else
        {
            return false;
        }
    }

    public List<MaterialBibliografico> ListaMB(String titulo)
    {
        return materialBibliograficoRepository.ListaMB(titulo);
    }
    public List<MaterialBibliografico> listaMB()
    {
        return materialBibliograficoRepository.findAll();
    }


}
