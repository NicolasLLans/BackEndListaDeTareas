package com.listaDeTareas.ListaDeTareas.repositorio;

import com.listaDeTareas.ListaDeTareas.modelos.usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usuarioRepositorio extends JpaRepository<usuario, Integer>{
    Optional<usuario> findByNombreUsuario(String nombreUsuario);
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String email);

    public Optional<usuario> findById(Long id);

    public void deleteById(Long id);

}
