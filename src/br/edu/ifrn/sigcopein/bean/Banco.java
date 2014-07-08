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
@Table(name = "banco")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Banco.findAll", query = "SELECT b FROM Banco b"),
    @NamedQuery(name = "Banco.findByBancoId", query = "SELECT b FROM Banco b WHERE b.bancoId = :bancoId"),
    @NamedQuery(name = "Banco.findByCodigo", query = "SELECT b FROM Banco b WHERE b.codigo = :codigo"),
    @NamedQuery(name = "Banco.findByNome", query = "SELECT b FROM Banco b WHERE b.nome = :nome")})
public class Banco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "banco_id")
    private Integer bancoId;
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bancoId")
    private List<AlunoProjeto> alunoProjetoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bancoId")
    private List<ServidorProjeto> servidorProjetoList;

    public Banco() {
    }

    public Banco(Integer bancoId) {
        this.bancoId = bancoId;
    }

    public Banco(Integer bancoId, String codigo, String nome) {
        this.bancoId = bancoId;
        this.codigo = codigo;
        this.nome = nome;
    }

    public Integer getBancoId() {
        return bancoId;
    }

    public void setBancoId(Integer bancoId) {
        this.bancoId = bancoId;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @XmlTransient
    public List<AlunoProjeto> getAlunoProjetoList() {
        return alunoProjetoList;
    }

    public void setAlunoProjetoList(List<AlunoProjeto> alunoProjetoList) {
        this.alunoProjetoList = alunoProjetoList;
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
        hash += (bancoId != null ? bancoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Banco)) {
            return false;
        }
        Banco other = (Banco) object;
        if ((this.bancoId == null && other.bancoId != null) || (this.bancoId != null && !this.bancoId.equals(other.bancoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifrn.sigcopein.bean.Banco[ bancoId=" + bancoId + " ]";
    }
    
}
