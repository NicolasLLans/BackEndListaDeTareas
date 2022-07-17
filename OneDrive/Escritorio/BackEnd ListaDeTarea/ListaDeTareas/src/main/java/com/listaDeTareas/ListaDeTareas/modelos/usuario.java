package com.listaDeTareas.ListaDeTareas.modelos;

import com.listaDeTareas.ListaDeTareas.seguridad.modelos.Rol;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author nicolas lans
 */
@Getter @Setter
@Entity
public class usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nombre;
    private String fotoDePerfil;
    private String banner;
    @NotNull
    @Column(unique = true)
    private String nombreUsuario;
    @NotNull
    private String email;
    @NotNull
    private String password;
    @NotNull
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "usuario_rol", joinColumns = @JoinColumn(name = "usuario_id"),
    inverseJoinColumns = @JoinColumn(name = "rol_id"))
    private Set<Rol> roles = new HashSet<>();
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idTar")
    public List<tareas> tareasList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idCWeb")
    public List<cambiosWeb> cambiosWebList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idAGA")
    public List<analisisGA> analisisGAList;
    
    

    public usuario() {
    }


    public usuario(@NotNull String nombre, String fotoDePerfil,String banner,@NotNull String nombreUsuario,@NotNull String email,@NotNull String password) {
        
        this.nombre = nombre;
        this.fotoDePerfil = fotoDePerfil;
        this.banner = banner;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getFotoDePerfil() {
        return fotoDePerfil;
    }

    public void setFotoDePerfil(String fotoDePerfil) {
        this.fotoDePerfil = fotoDePerfil;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }
}