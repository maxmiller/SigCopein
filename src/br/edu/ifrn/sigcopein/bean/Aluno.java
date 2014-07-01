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
@Table(name = "aluno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aluno.findAll", query = "SELECT a FROM Aluno a"),
    @NamedQuery(name = "Aluno.findByAlunoId", query = "SELECT a FROM Aluno a WHERE a.alunoId = :alunoId"),
    @NamedQuery(name = "Aluno.findByHabilitado", query = "SELECT a FROM Aluno a WHERE a.habilitado = :habilitado"),
    @NamedQuery(name = "Aluno.findByMatricula", query = "SELECT a FROM Aluno a WHERE a.matricula = :matricula"),
    @NamedQuery(name = "Aluno.findByNome", query = "SELECT a FROM Aluno a WHERE a.nome = :nome"),
    @NamedQuery(name = "Aluno.findByEmail", query = "SELECT a FROM Aluno a WHERE a.email = :email")})
public class Aluno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "aluno_id")
    private Integer alunoId;
    @Basic(optional = false)
    @Column(name = "habilitado")
    private boolean habilitado;
    @Basic(optional = false)
    @Column(name = "matricula")
    private String matricula;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alunoId")
    private List<AlunoAnexo> alunoAnexoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alunoId")
    private List<AlunoProjeto> alunoProjetoList;

    public Aluno() {
    }

    public Aluno(Integer alunoId) {
        this.alunoId = alunoId;
    }

    public Aluno(Integer alunoId, boolean habilitado, String matricula, String nome, String email) {
        this.alunoId = alunoId;
        this.habilitado = habilitado;
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
    }

    public Integer getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Integer alunoId) {
        this.alunoId = alunoId;
    }

    public boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    @XmlTransient
    public List<AlunoAnexo> getAlunoAnexoList() {
        return alunoAnexoList;
    }

    public void setAlunoAnexoList(List<AlunoAnexo> alunoAnexoList) {
        this.alunoAnexoList = alunoAnexoList;
    }

    @XmlTransient
    public List<AlunoProjeto> getAlunoProjetoList() {
        return alunoProjetoList;
    }

    public void setAlunoProjetoList(List<AlunoProjeto> alunoProjetoList) {
        this.alunoProjetoList = alunoProjetoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (alunoId != null ? alunoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aluno)) {
            return false;
        }
        Aluno other = (Aluno) object;
        if ((this.alunoId == null && other.alunoId != null) || (this.alunoId != null && !this.alunoId.equals(other.alunoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifrn.sigcopein.bean.Aluno[ alunoId=" + alunoId + " ]";
    }
    
}
