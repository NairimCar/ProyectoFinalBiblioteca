package com.Biblioteca.BibliotecaWS.repository;

import com.Biblioteca.BibliotecaWS.model.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface EditorialRepository extends JpaRepository<Editorial,Integer>{
    @Query(value="Select e from Editorial e where e.idEditorial>=?1")
    List<Editorial> ListaEditorial(String editorial);

}
