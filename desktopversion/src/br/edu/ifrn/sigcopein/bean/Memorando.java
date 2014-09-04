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
@Table(name = "memorando")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Memorando.findAll", query = "SELECT m FROM Memorando m"),
    @NamedQuery(name = "Memorando.findByMemorandoId", query = "SELECT m FROM Memorando m WHERE m.memorandoId = :memorandoId"),
    @NamedQuery(name = "Memorando.findByAno", query = "SELECT m FROM Memorando m WHERE m.ano = :ano"),
    @NamedQuery(name = "Memorando.findByData", query = "SELECT m FROM Memorando m WHERE m.data = :data"),
    @NamedQuery(name = "Memorando.findBySequencia", query = "SELECT m FROM Memorando m WHERE m.sequencia = :sequencia"),
    @NamedQuery(name = "Memorando.findByAssunto", query = "SELECT m FROM Memorando m WHERE m.assunto = :assunto"),
    @NamedQuery(name = "Memorando.findByPagamento", query = "SELECT m FROM Memorando m WHERE m.pagamento = :pagamento"),
    @NamedQuery(name = "Memorando.findByMesPagamento", query = "SELECT m FROM Memorando m WHERE m.mesPagamento = :mesPagamento")})
public class Memorando implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "memorando_id")
    private Integer memorandoId;
    @Basic(optional = false)
    @Column(name = "ano")
    private int ano;
    @Basic(optional = false)
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Basic(optional = false)
    @Column(name = "sequencia")
    private int sequencia;
    @Basic(optional = false)
    @Column(name = "assunto")
    private String assunto;
    @Basic(optional = false)
    @Lob
    @Column(name = "texto")
    private String texto;
    @Basic(optional = false)
    @Column(name = "pagamento")
    private boolean pagamento;
    @Column(name = "mes_pagamento")
    private Integer mesPagamento;
    @JoinColumn(name = "projeto_id", referencedColumnName = "projeto_id")
    @ManyToOne(optional = false)
    private Projeto projetoId;

    @Basic(optional = false)
    @Column(name = "setor")
    private String setor;
    
    public Memorando() {
    }

    public Memorando(Integer memorandoId) {
        this.memorandoId = memorandoId;
    }

    public Memorando(Integer memorandoId, int ano, Date data, int sequencia, String assunto, String texto, boolean pagamento) {
        this.memorandoId = memorandoId;
        this.ano = ano;
        this.data = data;
        this.sequencia = sequencia;
        this.assunto = assunto;
        this.texto = texto;
        this.pagamento = pagamento;
    }

    public Integer getMemorandoId() {
        return memorandoId;
    }

    public void setMemorandoId(Integer memorandoId) {
        this.memorandoId = memorandoId;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean getPagamento() {
        return pagamento;
    }

    public void setPagamento(boolean pagamento) {
        this.pagamento = pagamento;
    }

    public Integer getMesPagamento() {
        return mesPagamento;
    }

    public void setMesPagamento(Integer mesPagamento) {
        this.mesPagamento = mesPagamento;
    }

    public Projeto getProjetoId() {
        return projetoId;
    }

    public void setProjetoId(Projeto projetoId) {
        this.projetoId = projetoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (memorandoId != null ? memorandoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Memorando)) {
            return false;
        }
        Memorando other = (Memorando) object;
        if ((this.memorandoId == null && other.memorandoId != null) || (this.memorandoId != null && !this.memorandoId.equals(other.memorandoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifrn.sigcopein.bean.Memorando[ memorandoId=" + memorandoId + " ]";
    }

    /**
     * @return the setor
     */
    public String getSetor() {
        return setor;
    }

    /**
     * @param setor the setor to set
     */
    public void setSetor(String setor) {
        this.setor = setor;
    }
    
}
