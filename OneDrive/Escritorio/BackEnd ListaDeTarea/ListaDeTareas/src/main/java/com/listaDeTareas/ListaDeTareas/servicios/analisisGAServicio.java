package com.listaDeTareas.ListaDeTareas.servicios;

import com.listaDeTareas.ListaDeTareas.modelos.analisisGA;
import com.listaDeTareas.ListaDeTareas.repositorio.analisisGARepositorio;
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
public class analisisGAServicio {
    private final analisisGARepositorio analisisGARepo;
    
    @Autowired
    public analisisGAServicio(analisisGARepositorio analisisGARepo){
        this.analisisGARepo = analisisGARepo;
    }
    
    public analisisGA addAnalisisGA(analisisGA analisisGA){
        return analisisGARepo.save(analisisGA);
    }
    
    public List<analisisGA> buscarAnalisisGA(){
        return analisisGARepo.findAll();
    }
    
    public analisisGA editarAnalisisGA(analisisGA analisisGA){
        return analisisGARepo.save(analisisGA);
    }
    
    public void borrarAnalisisGA(Long id){
        analisisGARepo.deleteById(id);
    }
}
