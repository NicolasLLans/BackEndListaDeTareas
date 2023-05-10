package com.Porfolio.AP.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String apellido;
    private String titulo;
    private String descripcion;
    private String fotoPerfil;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    public List<AcercaDe> acercaDeList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    public List<Educacion> educacionList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkill")
    public List<Skills> skillList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    public List<Experiencia> experienciaList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    public List<Proyectos> proyectosList;
    
    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String titulo, String descripción, String fotoPerfil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.descripcion = descripción;
        this.fotoPerfil = fotoPerfil;
    }
    
    
}