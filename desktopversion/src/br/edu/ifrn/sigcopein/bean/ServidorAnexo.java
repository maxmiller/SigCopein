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
import javax.persistence.Lob;
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
@Table(name = "servidor_anexo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServidorAnexo.findAll", query = "SELECT s FROM ServidorAnexo s"),
    @NamedQuery(name = "ServidorAnexo.findByServidorAnexoId", query = "SELECT s FROM ServidorAnexo s WHERE s.servidorAnexoId = :servidorAnexoId"),
    @NamedQuery(name = "ServidorAnexo.findByDate", query = "SELECT s FROM ServidorAnexo s WHERE s.date = :date"),
    @NamedQuery(name = "ServidorAnexo.findByHabilitado", query = "SELECT s FROM ServidorAnexo s WHERE s.habilitado = :habilitado"),
    @NamedQuery(name = "ServidorAnexo.findByNomeAnexo", query = "SELECT s FROM ServidorAnexo s WHERE s.nomeAnexo = :nomeAnexo")})
public class ServidorAnexo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "servidor_anexo_id")
    private Integer servidorAnexoId;
    @Basic(optional = false)
    @Lob
    @Column(name = "anexo")
    private byte[] anexo;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "habilitado")
    private Boolean habilitado;
    @Column(name = "nome_anexo")
    private String nomeAnexo;
    @JoinColumn(name = "servidor_id", referencedColumnName = "servidor_id")
    @ManyToOne(optional = false)
    private Servidor servidorId;

    public ServidorAnexo() {
    }

    public ServidorAnexo(Integer servidorAnexoId) {
        this.servidorAnexoId = servidorAnexoId;
    }

    public ServidorAnexo(Integer servidorAnexoId, byte[] anexo, Date date) {
        this.servidorAnexoId = servidorAnexoId;
        this.anexo = anexo;
        this.date = date;
    }

    public Integer getServidorAnexoId() {
        return servidorAnexoId;
    }

    public void setServidorAnexoId(Integer servidorAnexoId) {
        this.servidorAnexoId = servidorAnexoId;
    }

    public byte[] getAnexo() {
        return anexo;
    }

    public void setAnexo(byte[] anexo) {
        this.anexo = anexo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    public String getNomeAnexo() {
        return nomeAnexo;
    }

    public void setNomeAnexo(String nomeAnexo) {
        this.nomeAnexo = nomeAnexo;
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
        hash += (servidorAnexoId != null ? servidorAnexoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServidorAnexo)) {
            return false;
        }
        ServidorAnexo other = (ServidorAnexo) object;
        if ((this.servidorAnexoId == null && other.servidorAnexoId != null) || (this.servidorAnexoId != null && !this.servidorAnexoId.equals(other.servidorAnexoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifrn.sigcopein.bean.ServidorAnexo[ servidorAnexoId=" + servidorAnexoId + " ]";
    }
    
}
