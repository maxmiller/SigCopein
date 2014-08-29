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
@Table(name = "aluno_anexo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AlunoAnexo.findAll", query = "SELECT a FROM AlunoAnexo a"),
    @NamedQuery(name = "AlunoAnexo.findByAlunoAnexoId", query = "SELECT a FROM AlunoAnexo a WHERE a.alunoAnexoId = :alunoAnexoId"),
    @NamedQuery(name = "AlunoAnexo.findByDate", query = "SELECT a FROM AlunoAnexo a WHERE a.date = :date"),
    @NamedQuery(name = "AlunoAnexo.findByHabilitado", query = "SELECT a FROM AlunoAnexo a WHERE a.habilitado = :habilitado"),
    @NamedQuery(name = "AlunoAnexo.findByNomeAnexo", query = "SELECT a FROM AlunoAnexo a WHERE a.nomeAnexo = :nomeAnexo")})
public class AlunoAnexo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "aluno_anexo_id")
    private Integer alunoAnexoId;
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
    @JoinColumn(name = "aluno_id", referencedColumnName = "aluno_id")
    @ManyToOne(optional = false)
    private Aluno alunoId;

    public AlunoAnexo() {
    }

    public AlunoAnexo(Integer alunoAnexoId) {
        this.alunoAnexoId = alunoAnexoId;
    }

    public AlunoAnexo(Integer alunoAnexoId, byte[] anexo, Date date) {
        this.alunoAnexoId = alunoAnexoId;
        this.anexo = anexo;
        this.date = date;
    }

    public Integer getAlunoAnexoId() {
        return alunoAnexoId;
    }

    public void setAlunoAnexoId(Integer alunoAnexoId) {
        this.alunoAnexoId = alunoAnexoId;
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

    public Aluno getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Aluno alunoId) {
        this.alunoId = alunoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (alunoAnexoId != null ? alunoAnexoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlunoAnexo)) {
            return false;
        }
        AlunoAnexo other = (AlunoAnexo) object;
        if ((this.alunoAnexoId == null && other.alunoAnexoId != null) || (this.alunoAnexoId != null && !this.alunoAnexoId.equals(other.alunoAnexoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifrn.sigcopein.bean.AlunoAnexo[ alunoAnexoId=" + alunoAnexoId + " ]";
    }
    
}
