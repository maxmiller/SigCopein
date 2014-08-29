/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sigcopein.tabela;

import br.edu.ifrn.sigcopein.bean.Banco;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 1935921
 */
public class TabelaBanco extends AbstractTableModel {

    private List<Banco> dados;
    private String[] colunas = {"CODIGO", "NOME"};

    public TabelaBanco(List<Banco> lista) {
        if (lista == null) {
            dados = new ArrayList<Banco>();
        } else {
            dados = lista;
        }
    }

    public TabelaBanco() {
        dados = new ArrayList<Banco>();

    }

    public void addRow(Banco p) {
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
                return dados.get(linha).getCodigo();
            case 1:
                return dados.get(linha).getNome();
          
        }
        return null;
    }

    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

    public Banco get(int linha) {
        return this.dados.get(linha);
    }

}
