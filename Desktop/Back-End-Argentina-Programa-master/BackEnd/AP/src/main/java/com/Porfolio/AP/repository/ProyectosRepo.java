package com.Porfolio.AP.repository;

import com.Porfolio.AP.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepo extends JpaRepository <Proyectos, Long>{
    
}