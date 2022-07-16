package com.listaDeTareas.ListaDeTareas.controlador;

import com.listaDeTareas.ListaDeTareas.modelos.tareas;
import com.listaDeTareas.ListaDeTareas.servicios.tareasServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nicolas Lans
 */
@RestController
@RequestMapping("/tareas")
@CrossOrigin(origins = {"http://localhost:4200"})
public class tareasControlador {
    @Autowired
    private tareasServicio tareasServ;
    
    
    @PostMapping ("/nuevo")
    public void agregarTarea (@RequestBody tareas tarea){
        tareasServ.addTareas(tarea);
    }
    
    @GetMapping ("/ver")
    @ResponseBody
    public List<tareas> verTareas(){
        return tareasServ.buscarTareas();
    }
    
    
    @DeleteMapping ("/delete/{id}")
    public void borrarTarea (@PathVariable Long id){
        tareasServ.borrarTareas(id);
    }
    
    
    @PutMapping("/actualizar")
    public void actualizar (@RequestBody tareas tarea){
        tareasServ.addTareas(tarea);
    }
}
