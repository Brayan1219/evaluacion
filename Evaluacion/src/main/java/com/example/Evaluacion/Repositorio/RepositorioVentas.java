package com.example.Evaluacion.Repositorio;

import com.example.Evaluacion.Entidad.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioVentas extends JpaRepository<Ventas,Integer> {

}
