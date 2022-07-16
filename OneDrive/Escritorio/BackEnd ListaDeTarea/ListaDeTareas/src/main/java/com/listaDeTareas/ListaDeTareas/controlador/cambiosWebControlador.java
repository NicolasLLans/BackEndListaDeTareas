package com.listaDeTareas.ListaDeTareas.controlador;

import com.listaDeTareas.ListaDeTareas.modelos.cambiosWeb;
import com.listaDeTareas.ListaDeTareas.servicios.cambiosWebServicio;
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
@RequestMapping("/cambiosWeb")
@CrossOrigin(origins = {"http://localhost:4200"})
public class cambiosWebControlador {
    @Autowired
    private cambiosWebServicio cambiosWebServ;
    
    
    @PostMapping ("/nuevo")
    public void agregarCambiosWeb (@RequestBody cambiosWeb cambiosWeb){
        cambiosWebServ.addCambiosWeb(cambiosWeb);
    }
    
    @GetMapping ("/ver")
    @ResponseBody
    public List<cambiosWeb> verCambiosWeb(){
        return cambiosWebServ.buscarCambiosWeb();
    }
    
    
    @DeleteMapping ("/delete/{id}")
    public void borrarCambiosWeb (@PathVariable Long id){
        cambiosWebServ.borrarCambiosWeb(id);
    }
    
    
    @PutMapping("/actualizar")
    public void actualizar (@RequestBody cambiosWeb cambiosWeb){
        cambiosWebServ.addCambiosWeb(cambiosWeb);
    }
}
