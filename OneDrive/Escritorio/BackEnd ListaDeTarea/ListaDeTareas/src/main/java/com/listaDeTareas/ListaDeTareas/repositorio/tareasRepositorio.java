package com.listaDeTareas.ListaDeTareas.repositorio;

import com.listaDeTareas.ListaDeTareas.modelos.tareas;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author nicolas lans
 */
public interface tareasRepositorio extends JpaRepository<tareas, Long>{
    
}
