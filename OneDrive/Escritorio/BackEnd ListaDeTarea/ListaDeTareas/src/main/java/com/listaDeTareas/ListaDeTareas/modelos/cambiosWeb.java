package com.listaDeTareas.ListaDeTareas.modelos;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author nicolas lans
 */
@Entity
public class cambiosWeb {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCWeb;
    private String nombre;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInc;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaRev;
    private String descripcion;
    private String objetivo;

    public cambiosWeb() {
    }

    public cambiosWeb(Long idCWeb, String nombre, Date fechaInc, Date fechaRev, String descripcion, String objetivo) {
        this.idCWeb = idCWeb;
        this.nombre = nombre;
        this.fechaInc = fechaInc;
        this.fechaRev = fechaRev;
        this.descripcion = descripcion;
        this.objetivo = objetivo;
    }

    public Long getIdCWeb() {
        return idCWeb;
    }

    public void setIdCWeb(Long idCWeb) {
        this.idCWeb = idCWeb;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInc() {
        return fechaInc;
    }

    public void setFechaInc(Date fechaInc) {
        this.fechaInc = fechaInc;
    }

    public Date getFechaRev() {
        return fechaRev;
    }

    public void setFechaRev(Date fechaRev) {
        this.fechaRev = fechaRev;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    
}
