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
public class analisisGA {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAGA;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    private String pagEntrada;
    private String pagRebote;
    private Long nuUsuarios;
    private Long nuRebotes;
    private Long ventasMin;
    private Long ventasMayo;
    private String notas;

    public analisisGA() {
    }

    public analisisGA(Long idAGA, Date fecha, String pagEntrada, String pagRebote, Long nuUsuarios, Long nuRebotes, Long ventasMin, Long ventasMayo, String notas) {
        this.idAGA = idAGA;
        this.fecha = fecha;
        this.pagEntrada = pagEntrada;
        this.pagRebote = pagRebote;
        this.nuUsuarios = nuUsuarios;
        this.nuRebotes = nuRebotes;
        this.ventasMin = ventasMin;
        this.ventasMayo = ventasMayo;
        this.notas = notas;
    }

    public Long getIdAGA() {
        return idAGA;
    }

    public void setIdAGA(Long idAGA) {
        this.idAGA = idAGA;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPagEntrada() {
        return pagEntrada;
    }

    public void setPagEntrada(String pagEntrada) {
        this.pagEntrada = pagEntrada;
    }

    public String getPagRebote() {
        return pagRebote;
    }

    public void setPagRebote(String pagRebote) {
        this.pagRebote = pagRebote;
    }

    public Long getNuUsuarios() {
        return nuUsuarios;
    }

    public void setNuUsuarios(Long nuUsuarios) {
        this.nuUsuarios = nuUsuarios;
    }

    public Long getNuRebotes() {
        return nuRebotes;
    }

    public void setNuRebotes(Long nuRebotes) {
        this.nuRebotes = nuRebotes;
    }

    public Long getVentasMin() {
        return ventasMin;
    }

    public void setVentasMin(Long ventasMin) {
        this.ventasMin = ventasMin;
    }

    public Long getVentasMayo() {
        return ventasMayo;
    }

    public void setVentasMayo(Long ventasMayo) {
        this.ventasMayo = ventasMayo;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
    
    
}
