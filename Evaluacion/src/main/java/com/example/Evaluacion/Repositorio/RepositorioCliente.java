package com.example.Evaluacion.Repositorio;

import com.example.Evaluacion.Entidad.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioCliente extends JpaRepository<Cliente,Integer> {

}
