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
@Table(name = "despacho")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Despacho.findAll", query = "SELECT d FROM Despacho d"),
    @NamedQuery(name = "Despacho.findByDespachoId", query = "SELECT d FROM Despacho d WHERE d.despachoId = :despachoId"),
    @NamedQuery(name = "Despacho.findByDataInicio", query = "SELECT d FROM Despacho d WHERE d.dataInicio = :dataInicio"),
    @NamedQuery(name = "Despacho.findByDataFim", query = "SELECT d FROM Despacho d WHERE d.dataFim = :dataFim"),
    @NamedQuery(name = "Despacho.findByEvento", query = "SELECT d FROM Despacho d WHERE d.evento = :evento"),
    @NamedQuery(name = "Despacho.findByLocal", query = "SELECT d FROM Despacho d WHERE d.local = :local"),
    @NamedQuery(name = "Despacho.findByPassagemAerea", query = "SELECT d FROM Despacho d WHERE d.passagemAerea = :passagemAerea"),
    @NamedQuery(name = "Despacho.findByProcesso", query = "SELECT d FROM Despacho d WHERE d.processo = :processo"),
    @NamedQuery(name = "Despacho.findByHoraInicio", query = "SELECT d FROM Despacho d WHERE d.horaInicio = :horaInicio"),
    @NamedQuery(name = "Despacho.findByHoraFim", query = "SELECT d FROM Despacho d WHERE d.horaFim = :horaFim"),
    @NamedQuery(name = "Despacho.findByDataDespacho", query = "SELECT d FROM Despacho d WHERE d.dataDespacho = :dataDespacho")})
public class Despacho implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "despacho_id")
    private Integer despachoId;
    @Basic(optional = false)
    @Column(name = "data_inicio")
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Basic(optional = false)
    @Column(name = "data_fim")
    @Temporal(TemporalType.DATE)
    private Date dataFim;
    @Basic(optional = false)
    @Column(name = "evento")
    private String evento;
    @Basic(optional = false)
    @Column(name = "Local")
    private String local;
    @Basic(optional = false)
    @Column(name = "passagem_aerea")
    private boolean passagemAerea;
    @Basic(optional = false)
    @Column(name = "processo")
    private String processo;
    @Column(name = "hora_inicio")
    private String horaInicio;
    @Column(name = "hora_fim")
    private String horaFim;
    @Column(name = "data_despacho")
    @Temporal(TemporalType.DATE)
    private Date dataDespacho;
    @JoinColumn(name = "servidor_id", referencedColumnName = "servidor_id")
    @ManyToOne(optional = false)
    private Servidor servidorId;

    public Despacho() {
    }

    public Despacho(Integer despachoId) {
        this.despachoId = despachoId;
    }

    public Despacho(Integer despachoId, Date dataInicio, Date dataFim, String evento, String local, boolean passagemAerea, String processo) {
        this.despachoId = despachoId;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.evento = evento;
        this.local = local;
        this.passagemAerea = passagemAerea;
        this.processo = processo;
    }

    public Integer getDespachoId() {
        return despachoId;
    }

    public void setDespachoId(Integer despachoId) {
        this.despachoId = despachoId;
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

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public boolean getPassagemAerea() {
        return passagemAerea;
    }

    public void setPassagemAerea(boolean passagemAerea) {
        this.passagemAerea = passagemAerea;
    }

    public String getProcesso() {
        return processo;
    }

    public void setProcesso(String processo) {
        this.processo = processo;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    public Date getDataDespacho() {
        return dataDespacho;
    }

    public void setDataDespacho(Date dataDespacho) {
        this.dataDespacho = dataDespacho;
    }

    public Servidor getServidorId() {
        return servidorId;
    }

    public void setServidorId(Servidor servidorId) {
        this.servidorId = servidorId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (despachoId != null ? despachoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Despacho)) {
            return false;
        }
        Despacho other = (Despacho) object;
        if ((this.despachoId == null && other.despachoId != null) || (this.despachoId != null && !this.despachoId.equals(other.despachoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifrn.sigcopein.bean.Despacho[ despachoId=" + despachoId + " ]";
    }
    
}
