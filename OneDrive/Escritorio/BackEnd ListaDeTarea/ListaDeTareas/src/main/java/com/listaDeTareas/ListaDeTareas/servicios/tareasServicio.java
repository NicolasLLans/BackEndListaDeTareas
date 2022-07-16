package com.listaDeTareas.ListaDeTareas.servicios;

import com.listaDeTareas.ListaDeTareas.modelos.tareas;
import com.listaDeTareas.ListaDeTareas.repositorio.tareasRepositorio;
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
public class tareasServicio {
    private final tareasRepositorio tareasRepo;
    
    @Autowired
    public tareasServicio(tareasRepositorio tareasRepo){
        this.tareasRepo = tareasRepo;
    }
    
    public tareas addTareas(tareas tarea){
        return tareasRepo.save(tarea);
    }
    
    public List<tareas> buscarTareas(){
        return tareasRepo.findAll();
    }
    
    public tareas editarTareas(tareas tarea){
        return tareasRepo.save(tarea);
    }
    
    public void borrarTareas(Long id){
        tareasRepo.deleteById(id);
    }
}
