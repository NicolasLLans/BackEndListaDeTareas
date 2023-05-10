
package com.Porfolio.AP.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    private String tituloExp;
    private int fechaExp;
    private String descExp;
    private String imgExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String tituloExp, int fechaExp, String descExp, String imgExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.fechaExp = fechaExp;
        this.descExp = descExp;
        this.imgExp = imgExp;
    }

    public Long getIdExp() {
        return idExp;
    }

    public String getTituloExp() {
        return tituloExp;
    }

    public int getFechaExp() {
        return fechaExp;
    }

    public String getDescExp() {
        return descExp;
    }

    public String getImgExp() {
        return imgExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public void setTituloExp(String tituloExp) {
        this.tituloExp = tituloExp;
    }

    public void setFechaExp(int fechaExp) {
        this.fechaExp = fechaExp;
    }

    public void setDescExp(String descExp) {
        this.descExp = descExp;
    }

    public void setImgExp(String imgExp) {
        this.imgExp = imgExp;
    }
    
    
}
