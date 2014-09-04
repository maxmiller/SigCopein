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
@Table(name = "servidor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servidor.findAll", query = "SELECT s FROM Servidor s"),
    @NamedQuery(name = "Servidor.findBySiape", query = "SELECT s FROM Servidor s WHERE s.siape = :siape"),
    @NamedQuery(name = "Servidor.findByNome", query = "SELECT s FROM Servidor s WHERE s.nome = :nome"),
    @NamedQuery(name = "Servidor.findByEmail", query = "SELECT s FROM Servidor s WHERE s.email = :email"),
    @NamedQuery(name = "Servidor.findByHabilitado", query = "SELECT s FROM Servidor s WHERE s.habilitado = :habilitado"),
    @NamedQuery(name = "Servidor.findByServidorId", query = "SELECT s FROM Servidor s WHERE s.servidorId = :servidorId"),
    @NamedQuery(name = "Servidor.findByCpf", query = "SELECT s FROM Servidor s WHERE s.cpf = :cpf"),
    @NamedQuery(name = "Servidor.findByLattes", query = "SELECT s FROM Servidor s WHERE s.lattes = :lattes")})
public class Servidor implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "servidorId")
    private List<Despacho> despachoList;
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "siape")
    private String siape;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "habilitado")
    private boolean habilitado;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "servidor_id")
    private Integer servidorId;
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "lattes")
    private String lattes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "servidorId")
    private List<Setor> setorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "servidorId")
    private List<ServidorProjeto> servidorProjetoList;

    public Servidor() {
    }

    public Servidor(Integer servidorId) {
        this.servidorId = servidorId;
    }

    public Servidor(Integer servidorId, String siape, String nome, String email, boolean habilitado, String cpf, String lattes) {
        this.servidorId = servidorId;
        this.siape = siape;
        this.nome = nome;
        this.email = email;
        this.habilitado = habilitado;
        this.cpf = cpf;
        this.lattes = lattes;
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

    public boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public Integer getServidorId() {
        return servidorId;
    }

    public void setServidorId(Integer servidorId) {
        this.servidorId = servidorId;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLattes() {
        return lattes;
    }

    public void setLattes(String lattes) {
        this.lattes = lattes;
    }

    @XmlTransient
    public List<Setor> getSetorList() {
        return setorList;
    }

    public void setSetorList(List<Setor> setorList) {
        this.setorList = setorList;
    }

    @XmlTransient
    public List<ServidorProjeto> getServidorProjetoList() {
        return servidorProjetoList;
    }

    public void setServidorProjetoList(List<ServidorProjeto> servidorProjetoList) {
        this.servidorProjetoList = servidorProjetoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (servidorId != null ? servidorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servidor)) {
            return false;
        }
        Servidor other = (Servidor) object;
        if ((this.servidorId == null && other.servidorId != null) || (this.servidorId != null && !this.servidorId.equals(other.servidorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifrn.sigcopein.bean.Servidor[ servidorId=" + servidorId + " ]";
    }

    @XmlTransient
    public List<Despacho> getDespachoList() {
        return despachoList;
    }

    public void setDespachoList(List<Despacho> despachoList) {
        this.despachoList = despachoList;
    }
    
}
