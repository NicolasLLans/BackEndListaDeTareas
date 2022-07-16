package com.listaDeTareas.ListaDeTareas.seguridad.repository;

import com.listaDeTareas.ListaDeTareas.seguridad.modelos.Rol;
import com.listaDeTareas.ListaDeTareas.seguridad.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nicolas lans
 */
@Repository
public interface rolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
