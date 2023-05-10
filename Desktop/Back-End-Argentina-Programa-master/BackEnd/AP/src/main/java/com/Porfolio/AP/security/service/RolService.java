package com.Porfolio.AP.security.service;

import com.Porfolio.AP.security.entity.Rol;
import com.Porfolio.AP.security.enums.RolNombre;
import com.Porfolio.AP.security.repository.RolRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RolService {
    
    @Autowired
    RolRepository rolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }

     public void save(Rol rol){
        rolRepository.save(rol);
    }
    
}
