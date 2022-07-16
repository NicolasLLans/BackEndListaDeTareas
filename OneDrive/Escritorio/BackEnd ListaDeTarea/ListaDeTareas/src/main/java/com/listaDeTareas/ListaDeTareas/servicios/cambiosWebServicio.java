package com.listaDeTareas.ListaDeTareas.servicios;

import com.listaDeTareas.ListaDeTareas.modelos.cambiosWeb;
import com.listaDeTareas.ListaDeTareas.repositorio.cambiosWebRepositorio;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nicolas lans
 */
@Service
@Transactional
public class cambiosWebServicio {
    private final cambiosWebRepositorio cambiosWebRepo;
    
    @Autowired
    public cambiosWebServicio(cambiosWebRepositorio cambiosWebRepo){
        this.cambiosWebRepo = cambiosWebRepo;
    }
    
    public cambiosWeb addCambiosWeb(cambiosWeb cambiosWeb){
        return cambiosWebRepo.save(cambiosWeb);
    }
    
    public List<cambiosWeb> buscarCambiosWeb(){
        return cambiosWebRepo.findAll();
    }
    
    public cambiosWeb editarCambiosWeb(cambiosWeb cambiosWeb){
        return cambiosWebRepo.save(cambiosWeb);
    }
    
    public void borrarCambiosWeb(Long id){
        cambiosWebRepo.deleteById(id);
    }
}
