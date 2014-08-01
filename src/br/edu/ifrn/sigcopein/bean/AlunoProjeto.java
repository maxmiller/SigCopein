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
@Table(name = "aluno_projeto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AlunoProjeto.findAll", query = "SELECT a FROM AlunoProjeto a"),
    @NamedQuery(name = "AlunoProjeto.findByAlunoProjetoId", query = "SELECT a FROM AlunoProjeto a WHERE a.alunoProjetoId = :alunoProjetoId"),
    @NamedQuery(name = "AlunoProjeto.findByBolsista", query = "SELECT a FROM AlunoProjeto a WHERE a.bolsista = :bolsista"),
    @NamedQuery(name = "AlunoProjeto.findByDataInicio", query = "SELECT a FROM AlunoProjeto a WHERE a.dataInicio = :dataInicio"),
    @NamedQuery(name = "AlunoProjeto.findByDataFim", query = "SELECT a FROM AlunoProjeto a WHERE a.dataFim = :dataFim"),
    @NamedQuery(name = "AlunoProjeto.findByCargaHoraria", query = "SELECT a FROM AlunoProjeto a WHERE a.cargaHoraria = :cargaHoraria"),
    @NamedQuery(name = "AlunoProjeto.findByHabilitado", query = "SELECT a FROM AlunoProjeto a WHERE a.habilitado = :habilitado"),
    @NamedQuery(name = "AlunoProjeto.findByNomeAnexo", query = "SELECT a FROM AlunoProjeto a WHERE a.nomeAnexo = :nomeAnexo"),
    @NamedQuery(name = "AlunoProjeto.findByAgencia", query = "SELECT a FROM AlunoProjeto a WHERE a.agencia = :agencia"),
    @NamedQuery(name = "AlunoProjeto.findByConta", query = "SELECT a FROM AlunoProjeto a WHERE a.conta = :conta")})
public class AlunoProjeto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "aluno_projeto_id")
    private Integer alunoProjetoId;
    @Basic(optional = false)
    @Column(name = "bolsista")
    private boolean bolsista;
    @Basic(optional = false)
    @Column(name = "data_inicio")
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Column(name = "data_fim")
    @Temporal(TemporalType.DATE)
    private Date dataFim;
    @Basic(optional = false)
    @Column(name = "carga_horaria")
    private int cargaHoraria;
    @Column(name = "habilitado")
    private Boolean habilitado;
    @Basic(optional = false)
    @Lob
    @Column(name = "anexo")
    private byte[] anexo;
    @Basic(optional = false)
    @Column(name = "nome_anexo")
    private String nomeAnexo;
    @Column(name = "agencia")
    private String agencia;
    @Column(name = "conta")
    private String conta;
    @JoinColumn(name = "projeto_id", referencedColumnName = "projeto_id")
    @ManyToOne(optional = false)
    private Projeto projetoId;
    @JoinColumn(name = "banco_id", referencedColumnName = "banco_id")
    @ManyToOne(optional = false)
    private Banco bancoId;
    @JoinColumn(name = "aluno_id", referencedColumnName = "aluno_id")
    @ManyToOne(optional = false)
    private Aluno alunoId;

    public AlunoProjeto() {
    }

    public AlunoProjeto(Integer alunoProjetoId) {
        this.alunoProjetoId = alunoProjetoId;
    }

    public AlunoProjeto(Integer alunoProjetoId, boolean bolsista, Date dataInicio, int cargaHoraria, byte[] anexo, String nomeAnexo) {
        this.alunoProjetoId = alunoProjetoId;
        this.bolsista = bolsista;
        this.dataInicio = dataInicio;
        this.cargaHoraria = cargaHoraria;
        this.anexo = anexo;
        this.nomeAnexo = nomeAnexo;
    }

    public Integer getAlunoProjetoId() {
        return alunoProjetoId;
    }

    public void setAlunoProjetoId(Integer alunoProjetoId) {
        this.alunoProjetoId = alunoProjetoId;
    }

    public boolean getBolsista() {
        return bolsista;
    }

    public void setBolsista(boolean bolsista) {
        this.bolsista = bolsista;
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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    public byte[] getAnexo() {
        return anexo;
    }

    public void setAnexo(byte[] anexo) {
        this.anexo = anexo;
    }

    public String getNomeAnexo() {
        return nomeAnexo;
    }

    public void setNomeAnexo(String nomeAnexo) {
        this.nomeAnexo = nomeAnexo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Projeto getProjetoId() {
        return projetoId;
    }

    public void setProjetoId(Projeto projetoId) {
        this.projetoId = projetoId;
    }

    public Banco getBancoId() {
        return bancoId;
    }

    public void setBancoId(Banco bancoId) {
        this.bancoId = bancoId;
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
        hash += (alunoProjetoId != null ? alunoProjetoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlunoProjeto)) {
            return false;
        }
        AlunoProjeto other = (AlunoProjeto) object;
        if ((this.alunoProjetoId == null && other.alunoProjetoId != null) || (this.alunoProjetoId != null && !this.alunoProjetoId.equals(other.alunoProjetoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifrn.sigcopein.bean.AlunoProjeto[ alunoProjetoId=" + alunoProjetoId + " ]";
    }
    
}
