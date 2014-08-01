/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.sigcopein.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 1935921
 */
@Entity
@Table(name = "edital")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Edital.findAll", query = "SELECT e FROM Edital e"),
    @NamedQuery(name = "Edital.findByEditalId", query = "SELECT e FROM Edital e WHERE e.editalId = :editalId"),
    @NamedQuery(name = "Edital.findByDescricao", query = "SELECT e FROM Edital e WHERE e.descricao = :descricao"),
    @NamedQuery(name = "Edital.findByHabilitado", query = "SELECT e FROM Edital e WHERE e.habilitado = :habilitado")})
public class Edital implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "edital_id")
    private Integer editalId;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "habilitado")
    private boolean habilitado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "editalId")
    private List<Projeto> projetoList;

    public Edital() {
    }

    public Edital(Integer editalId) {
        this.editalId = editalId;
    }

    public Edital(Integer editalId, String descricao, boolean habilitado) {
        this.editalId = editalId;
        this.descricao = descricao;
        this.habilitado = habilitado;
    }

    public Integer getEditalId() {
        return editalId;
    }

    public void setEditalId(Integer editalId) {
        this.editalId = editalId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    @XmlTransient
    public List<Projeto> getProjetoList() {
        return projetoList;
    }

    public void setProjetoList(List<Projeto> projetoList) {
        this.projetoList = projetoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (editalId != null ? editalId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Edital)) {
            return false;
        }
        Edital other = (Edital) object;
        if ((this.editalId == null && other.editalId != null) || (this.editalId != null && !this.editalId.equals(other.editalId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return descricao;
    }
    
}
