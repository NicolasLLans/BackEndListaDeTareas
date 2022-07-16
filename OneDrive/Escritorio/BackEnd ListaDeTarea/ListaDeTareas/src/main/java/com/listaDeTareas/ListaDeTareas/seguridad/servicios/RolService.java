package com.listaDeTareas.ListaDeTareas.seguridad.servicios;

import com.listaDeTareas.ListaDeTareas.seguridad.modelos.Rol;
import com.listaDeTareas.ListaDeTareas.seguridad.enums.RolNombre;
import com.listaDeTareas.ListaDeTareas.seguridad.repository.rolRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author nicolas lans
 */
@Service
@Transactional
public class RolService {
    
    @Autowired
    rolRepository rolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }

     public void save(Rol rol){
        rolRepository.save(rol);
    }
    
}
