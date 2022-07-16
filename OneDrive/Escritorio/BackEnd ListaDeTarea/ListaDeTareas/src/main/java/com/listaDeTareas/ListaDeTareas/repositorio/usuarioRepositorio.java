package com.listaDeTareas.ListaDeTareas.repositorio;

import java.util.Optional;

@Repository
public interface usuarioRepositorio extends JpaRepository<Usuario, Integer>{
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String email);
}
