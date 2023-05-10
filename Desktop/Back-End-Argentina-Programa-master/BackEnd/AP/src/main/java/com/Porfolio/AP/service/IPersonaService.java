
package com.Porfolio.AP.service;

import com.Porfolio.AP.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> verPersona ();
    
    public void crearPersona (Persona per);
    
    public void borrarPersona (Long id);
    

    public Persona buscarPersona (Long id);
}
