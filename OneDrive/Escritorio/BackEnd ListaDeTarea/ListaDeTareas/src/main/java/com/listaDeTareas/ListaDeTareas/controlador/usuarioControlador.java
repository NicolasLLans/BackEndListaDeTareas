package com.listaDeTareas.ListaDeTareas.controlador;

import com.listaDeTareas.ListaDeTareas.modelos.usuario;
import com.listaDeTareas.ListaDeTareas.servicios.usuarioServicio;
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
@RequestMapping("/usuario")

public class usuarioControlador {
    @Autowired
    private usuarioServicio usuarioServ;
    
    
    @PostMapping ("/nuevo")
    public void agregarUsuario (@RequestBody usuario user){
        usuarioServ.crearUsuario(user);
    }
    
    @GetMapping ("/ver")
    @ResponseBody
    public List<usuario> verPersonas (){
        return usuarioServ.verUsuario();
    }
    
    
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona (@PathVariable Long id){
        usuarioServ.borrarUsuario(id);
    }
    
    
    @PutMapping("/actualizar")
    public void actualizar (@RequestBody usuario user){
        usuarioServ.crearUsuario(user);
    }
}
