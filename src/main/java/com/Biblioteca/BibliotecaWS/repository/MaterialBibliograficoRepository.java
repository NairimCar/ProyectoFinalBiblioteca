package com.Biblioteca.BibliotecaWS.repository;


import com.Biblioteca.BibliotecaWS.model.MaterialBibliografico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MaterialBibliograficoRepository extends JpaRepository<MaterialBibliografico,Integer> {
    @Query(value = "Select e from MaterialBibliografico e where e.idMaterialBibliografico>=?1")
    List<MaterialBibliografico> ListaMB(String materialbibliografico);
}