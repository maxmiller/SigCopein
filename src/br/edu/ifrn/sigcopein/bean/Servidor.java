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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 1935921
 */
@Entity
@Table(name = "servidor", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"siape"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servidor.findAll", query = "SELECT s FROM Servidor s"),
    @NamedQuery(name = "Servidor.findById", query = "SELECT s FROM Servidor s WHERE s.id = :id"),
    @NamedQuery(name = "Servidor.findBySiape", query = "SELECT s FROM Servidor s WHERE s.siape = :siape"),
    @NamedQuery(name = "Servidor.findByNome", query = "SELECT s FROM Servidor s WHERE s.nome = :nome"),
    @NamedQuery(name = "Servidor.findByEmail", query = "SELECT s FROM Servidor s WHERE s.email = :email")})
public class Servidor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "siape", nullable = false, length = 7)
    private String siape;
    @Basic(optional = false)
    @Column(name = "nome", nullable = false, length = 100)
    private String nome;
    @Column(name = "email", length = 45)
    private String email;

    public Servidor() {
    }

    public Servidor(Integer id) {
        this.id = id;
    }

    public Servidor(Integer id, String siape, String nome) {
        this.id = id;
        this.siape = siape;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servidor)) {
            return false;
        }
        Servidor other = (Servidor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifrn.sigcopein.bean.Servidor[ id=" + id + " ]";
    }
    
}
