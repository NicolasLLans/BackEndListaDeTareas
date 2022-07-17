package com.listaDeTareas.ListaDeTareas.servicios;

import com.listaDeTareas.ListaDeTareas.modelos.usuario;
import com.listaDeTareas.ListaDeTareas.repositorio.usuarioRepositorio;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nicolas lans
 */
@Service
@Transactional
public class usuarioServicio{
    
    
    @Autowired
    usuarioRepositorio usuarioRepository;
    
    
    public Optional<usuario> getByNombreUsuario(String nombreUsuario){
        return usuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return usuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByEmail(String email){
        return usuarioRepository.existsByEmail(email);
    }
    
    public void save(usuario usuario){
        usuarioRepository.save(usuario);
    }
    public List<usuario> verUsuario() {
        return usuarioRepository.findAll();
    }

    public void crearUsuario(usuario user) {
        usuarioRepository.save(user);
    }

    public void borrarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    public Optional<usuario> buscarUsuario(Long id) {
        return usuarioRepository.findById(id);
    }
}
