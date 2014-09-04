/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sigcopein.tabela;

import br.edu.ifrn.sigcopein.bean.Memorando;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 1935921
 */
public class TabelaMemorando extends AbstractTableModel {

    private List<Memorando> dados;
    private String[] colunas = {"MEMO", "ASSUNTO", "DATA"};

    public TabelaMemorando(List<Memorando> lista) {
        if (lista == null) {
            dados = new ArrayList<Memorando>();
        } else {
            dados = lista;
        }
    }

    public TabelaMemorando() {
        dados = new ArrayList<Memorando>();

    }

    public void addRow(Memorando p) {
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
                return dados.get(linha).getSequencia();
            case 1:
                return dados.get(linha).getAssunto();
            case 2:
                return dados.get(linha).getData();
          
        }
        return null;
    }

    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

    public Memorando get(int linha) {
        return this.dados.get(linha);
    }

}
