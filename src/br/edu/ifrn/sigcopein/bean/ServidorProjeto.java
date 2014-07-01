/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.sigcopein.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 1935921
 */
@Entity
@Table(name = "servidor_projeto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServidorProjeto.findAll", query = "SELECT s FROM ServidorProjeto s"),
    @NamedQuery(name = "ServidorProjeto.findByServidorProjetoId", query = "SELECT s FROM ServidorProjeto s WHERE s.servidorProjetoId = :servidorProjetoId"),
    @NamedQuery(name = "ServidorProjeto.findByBolsista", query = "SELECT s FROM ServidorProjeto s WHERE s.bolsista = :bolsista"),
    @NamedQuery(name = "ServidorProjeto.findByDataInicio", query = "SELECT s FROM ServidorProjeto s WHERE s.dataInicio = :dataInicio"),
    @NamedQuery(name = "ServidorProjeto.findByDataFim", query = "SELECT s FROM ServidorProjeto s WHERE s.dataFim = :dataFim"),
    @NamedQuery(name = "ServidorProjeto.findByCargaHoraria", query = "SELECT s FROM ServidorProjeto s WHERE s.cargaHoraria = :cargaHoraria"),
    @NamedQuery(name = "ServidorProjeto.findByHabilitado", query = "SELECT s FROM ServidorProjeto s WHERE s.habilitado = :habilitado")})
public class ServidorProjeto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "servidor_projeto_id")
    private Integer servidorProjetoId;
    @Basic(optional = false)
    @Column(name = "bolsista")
    private boolean bolsista;
    @Basic(optional = false)
    @Column(name = "data_inicio")
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Column(name = "data_fim")
    @Temporal(TemporalType.DATE)
    private Date dataFim;
    @Basic(optional = false)
    @Column(name = "carga_horaria")
    private int cargaHoraria;
    @Column(name = "habilitado")
    private Boolean habilitado;
    @JoinColumn(name = "servidor_id", referencedColumnName = "servidor_id")
    @ManyToOne(optional = false)
    private Servidor servidorId;
    @JoinColumn(name = "projeto_id", referencedColumnName = "projeto_id")
    @ManyToOne(optional = false)
    private Projeto projetoId;

    public ServidorProjeto() {
    }

    public ServidorProjeto(Integer servidorProjetoId) {
        this.servidorProjetoId = servidorProjetoId;
    }

    public ServidorProjeto(Integer servidorProjetoId, boolean bolsista, Date dataInicio, int cargaHoraria) {
        this.servidorProjetoId = servidorProjetoId;
        this.bolsista = bolsista;
        this.dataInicio = dataInicio;
        this.cargaHoraria = cargaHoraria;
    }

    public Integer getServidorProjetoId() {
        return servidorProjetoId;
    }

    public void setServidorProjetoId(Integer servidorProjetoId) {
        this.servidorProjetoId = servidorProjetoId;
    }

    public boolean getBolsista() {
        return bolsista;
    }

    public void setBolsista(boolean bolsista) {
        this.bolsista = bolsista;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    public Servidor getServidorId() {
        return servidorId;
    }

    public void setServidorId(Servidor servidorId) {
        this.servidorId = servidorId;
    }

    public Projeto getProjetoId() {
        return projetoId;
    }

    public void setProjetoId(Projeto projetoId) {
        this.projetoId = projetoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (servidorProjetoId != null ? servidorProjetoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServidorProjeto)) {
            return false;
        }
        ServidorProjeto other = (ServidorProjeto) object;
        if ((this.servidorProjetoId == null && other.servidorProjetoId != null) || (this.servidorProjetoId != null && !this.servidorProjetoId.equals(other.servidorProjetoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifrn.sigcopein.bean.ServidorProjeto[ servidorProjetoId=" + servidorProjetoId + " ]";
    }
    
}
