package com.listaDeTareas.ListaDeTareas.modelos;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    private Date fechaInc;
    private Date fechaLim;
    private String desc;
    private String img;

    public tareas() {
    }

    public tareas(Long idTar, String titulo, Date fechaInc, String desc, String img) {
        this.idTar = idTar;
        this.titulo = titulo;
        this.fechaInc = fechaInc;
        this.fechaLim = fechaLim;
        this.desc = desc;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
}
