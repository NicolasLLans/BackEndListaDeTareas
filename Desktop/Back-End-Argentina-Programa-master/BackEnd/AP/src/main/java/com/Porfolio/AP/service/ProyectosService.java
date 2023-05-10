package com.Porfolio.AP.service;

import com.Porfolio.AP.model.Proyectos;
import com.Porfolio.AP.repository.ProyectosRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProyectosService {

    private final ProyectosRepo proyectosRepo;

    @Autowired
    public ProyectosService(ProyectosRepo proyectosRepo) {
        this.proyectosRepo = proyectosRepo;
    }

    public Proyectos addProyectos(Proyectos proyectos) {
        return proyectosRepo.save(proyectos);
    }

    public List<Proyectos> buscarProyectos() {
        return proyectosRepo.findAll();
    }

    public Proyectos editarProyectos(Proyectos proyectos) {
        return proyectosRepo.save(proyectos);
    }

    public void borrarProyectos(Long id) {
        proyectosRepo.deleteById(id);
    }
}
