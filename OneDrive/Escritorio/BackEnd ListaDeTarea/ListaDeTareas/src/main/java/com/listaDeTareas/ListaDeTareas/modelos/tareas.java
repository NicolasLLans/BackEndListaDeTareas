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
public class tareas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTar;
    private String titulo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInc;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaLim;
    private String descripcion;
    private String img;

    public tareas() {
    }

    public tareas(Long idTar, String titulo, Date fechaInc, Date fechaLim, String descripcion, String img) {
        this.idTar = idTar;
        this.titulo = titulo;
        this.fechaInc = fechaInc;
        this.fechaLim = fechaLim;
        this.descripcion = descripcion;
        this.img = img;
    }

    public Long getIdTar() {
        return idTar;
    }

    public void setIdTar(Long idTar) {
        this.idTar = idTar;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaInc() {
        return fechaInc;
    }

    public void setFechaInc(Date fechaInc) {
        this.fechaInc = fechaInc;
    }

    public Date getFechaLim() {
        return fechaLim;
    }

    public void setFechaLim(Date fechaLim) {
        this.fechaLim = fechaLim;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}   
