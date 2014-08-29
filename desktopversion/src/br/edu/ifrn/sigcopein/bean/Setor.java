/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.sigcopein.bean;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 1935921
 */
@Entity
@Table(name = "setor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Setor.findAll", query = "SELECT s FROM Setor s"),
    @NamedQuery(name = "Setor.findBySetorId", query = "SELECT s FROM Setor s WHERE s.setorId = :setorId"),
    @NamedQuery(name = "Setor.findByNome", query = "SELECT s FROM Setor s WHERE s.nome = :nome")})
public class Setor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "setor_id")
    private Integer setorId;
    @Column(name = "nome")
    private String nome;
    @JoinColumn(name = "servidor_id", referencedColumnName = "servidor_id")
    @ManyToOne(optional = false)
    private Servidor servidorId;

    public Setor() {
    }

    public Setor(Integer setorId) {
        this.setorId = setorId;
    }

    public Integer getSetorId() {
        return setorId;
    }

    public void setSetorId(Integer setorId) {
        this.setorId = setorId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        hash += (setorId != null ? setorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Setor)) {
            return false;
        }
        Setor other = (Setor) object;
        if ((this.setorId == null && other.setorId != null) || (this.setorId != null && !this.setorId.equals(other.setorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifrn.sigcopein.bean.Setor[ setorId=" + setorId + " ]";
    }
    
}
