package com.Biblioteca.BibliotecaWS.repository;

import com.Biblioteca.BibliotecaWS.model.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface TipoRepository extends JpaRepository<Tipo,Integer> {
    @Query(value="Select e from Tipo e where e.idTipo>=?1")
    List<Tipo> ListarTipo(String tipo);

}


