/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.sigcopein.bean.report;

import java.util.Date;

/**
 *
 * @author 1935921
 */
public class ListaProjeto {
    private int codigo;
    private String nome;
    private Date inicio;
    private Date fim;
    private String descricao;

    public ListaProjeto(int codigo, String nome, Date inicio, Date fim, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.inicio = inicio;
        this.fim = fim;
        this.descricao = descricao;
    }

    
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the inicio
     */
    public Date getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the fim
     */
    public Date getFim() {
        return fim;
    }

    /**
     * @param fim the fim to set
     */
    public void setFim(Date fim) {
        this.fim = fim;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
