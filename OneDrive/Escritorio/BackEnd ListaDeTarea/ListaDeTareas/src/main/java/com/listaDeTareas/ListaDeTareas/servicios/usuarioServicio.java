package com.listaDeTareas.ListaDeTareas.servicios;

import java.util.Optional;

/**
 *
 * @author nicolas lans
 */
@Service
@Transactional
public class usuarioServicio{
    
    @Autowired
    usuarioRepository usuarioRepository;
    
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
}
