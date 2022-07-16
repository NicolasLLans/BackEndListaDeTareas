package com.listaDeTareas.ListaDeTareas.controlador;

import com.listaDeTareas.ListaDeTareas.modelos.analisisGA;
import com.listaDeTareas.ListaDeTareas.servicios.analisisGAServicio;
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
 * @author nicolas lans
 */
@RestController
@RequestMapping("/analisisGA")
@CrossOrigin(origins = {"http://localhost:4200"})
public class analisisGAControlador {
    @Autowired
    private analisisGAServicio analisisGAServ;
    
    
    @PostMapping ("/nuevo")
    public void agregarAnalisisGA (@RequestBody analisisGA analisisGA){
        analisisGAServ.addAnalisisGA(analisisGA);
    }
    
    @GetMapping ("/ver")
    @ResponseBody
    public List<analisisGA> verAnalisisGA(){
        return analisisGAServ.buscarAnalisisGA();
    }
    
    
    @DeleteMapping ("/delete/{id}")
    public void borrarAnalisisGA (@PathVariable Long id){
        analisisGAServ.borrarAnalisisGA(id);
    }
    
    
    @PutMapping("/actualizar")
    public void actualizar (@RequestBody analisisGA analisisGA){
        analisisGAServ.addAnalisisGA(analisisGA);
    }
}
