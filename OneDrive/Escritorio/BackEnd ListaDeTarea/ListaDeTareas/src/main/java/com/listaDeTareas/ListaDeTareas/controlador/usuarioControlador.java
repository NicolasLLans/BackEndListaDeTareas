package com.listaDeTareas.ListaDeTareas.controlador;

import java.util.List;

/**
 *
 * @author nicolas lans
 */
@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = {"http://localhost:4200"})
public class usuarioControlador {
    @Autowired
    private usuarioServicio usuarioServ;
    
    
    @PostMapping ("/nuevo")
    public void agregarUsuario (@RequestBody Usuario user){
        usuarioServ.crearUsuario(user);
    }
    
    @GetMapping ("/ver")
    @ResponseBody
    public List<Persona> verPersonas (){
        return usuarioServ.verUsuario();
    }
    
    
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona (@PathVariable Long id){
        usuarioServ.borrarUsuario(id);
    }
    
    
    @PutMapping("/actualizar")
    public void actualizar (@RequestBody usuario user){
        usuarioServ.crearUsuario(pers);
    }
}
