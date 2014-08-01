/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sigcopein.tabela;

import br.edu.ifrn.sigcopein.bean.Projeto;
import br.edu.ifrn.sigcopein.util.DateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 1935921
 */
public class TabelaProjeto extends AbstractTableModel {

    private List<Projeto> dados;
    private String[] colunas = {"CÓDIGO", "NOME", "EDITAL", "DATA DE INÍCIO", "DATA DE FIM","HABILITADO"};

    public TabelaProjeto(List<Projeto> lista) {
        if (lista == null) {
            dados = new ArrayList<Projeto>();
        } else {
            dados = lista;
        }
    }

    public TabelaProjeto() {
        dados = new ArrayList<Projeto>();

    }

    public void addRow(Projeto p) {
        this.dados.add(p);
        this.fireTableDataChanged();
    }

    public String getColumnName(int num) {
        return this.colunas[num];
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return dados.get(linha).getProjetoId();
            case 1:
                return dados.get(linha).getNome();
            case 2:
                return dados.get(linha).getEditalId() != null ? dados.get(linha).getEditalId().getDescricao() : "N/A";
            case 3:

                return DateUtil.dateConverter(dados.get(linha).getDataInicio());
            case 4:
                return DateUtil.dateConverter(dados.get(linha).getDataFim());
            case 5:
                return dados.get(linha).getHabilitado() ? "Sim" : "Não";
        }
        return null;
    }

    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

    public Projeto get(int linha) {
        return this.dados.get(linha);
    }

}
