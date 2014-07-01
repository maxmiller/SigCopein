/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.sigcopein.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 1935921
 */
@Entity
@Table(name = "projeto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Projeto.findAll", query = "SELECT p FROM Projeto p"),
    @NamedQuery(name = "Projeto.findByProjetoId", query = "SELECT p FROM Projeto p WHERE p.projetoId = :projetoId"),
    @NamedQuery(name = "Projeto.findByNome", query = "SELECT p FROM Projeto p WHERE p.nome = :nome"),
    @NamedQuery(name = "Projeto.findByEdital", query = "SELECT p FROM Projeto p WHERE p.edital = :edital"),
    @NamedQuery(name = "Projeto.findByDataInicio", query = "SELECT p FROM Projeto p WHERE p.dataInicio = :dataInicio"),
    @NamedQuery(name = "Projeto.findByDataFim", query = "SELECT p FROM Projeto p WHERE p.dataFim = :dataFim"),
    @NamedQuery(name = "Projeto.findByHabilitado", query = "SELECT p FROM Projeto p WHERE p.habilitado = :habilitado"),
    @NamedQuery(name = "Projeto.findByNomeAnexo", query = "SELECT p FROM Projeto p WHERE p.nomeAnexo = :nomeAnexo")})
public class Projeto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "projeto_id")
    private Integer projetoId;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "edital")
    private String edital;
    @Basic(optional = false)
    @Column(name = "data_inicio")
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Basic(optional = false)
    @Column(name = "data_fim")
    @Temporal(TemporalType.DATE)
    private Date dataFim;
    @Basic(optional = false)
    @Lob
    @Column(name = "projeto")
    private byte[] projeto;
    @Basic(optional = false)
    @Column(name = "habilitado")
    private boolean habilitado;
    @Basic(optional = false)
    @Column(name = "nome_anexo")
    private String nomeAnexo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "projetoId")
    private List<AlunoProjeto> alunoProjetoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "projetoId")
    private List<ServidorProjeto> servidorProjetoList;

    public Projeto() {
    }

    public Projeto(Integer projetoId) {
        this.projetoId = projetoId;
    }

    public Projeto(Integer projetoId, String nome, String edital, Date dataInicio, Date dataFim, byte[] projeto, boolean habilitado, String nomeAnexo) {
        this.projetoId = projetoId;
        this.nome = nome;
        this.edital = edital;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.projeto = projeto;
        this.habilitado = habilitado;
        this.nomeAnexo = nomeAnexo;
    }

    public Integer getProjetoId() {
        return projetoId;
    }

    public void setProjetoId(Integer projetoId) {
        this.projetoId = projetoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEdital() {
        return edital;
    }

    public void setEdital(String edital) {
        this.edital = edital;
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

    public byte[] getProjeto() {
        return projeto;
    }

    public void setProjeto(byte[] projeto) {
        this.projeto = projeto;
    }

    public boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public String getNomeAnexo() {
        return nomeAnexo;
    }

    public void setNomeAnexo(String nomeAnexo) {
        this.nomeAnexo = nomeAnexo;
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
        hash += (projetoId != null ? projetoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Projeto)) {
            return false;
        }
        Projeto other = (Projeto) object;
        if ((this.projetoId == null && other.projetoId != null) || (this.projetoId != null && !this.projetoId.equals(other.projetoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifrn.sigcopein.bean.Projeto[ projetoId=" + projetoId + " ]";
    }
    
}