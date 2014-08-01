/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sigcopein.tabela;

import br.edu.ifrn.sigcopein.bean.Servidor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 1935921
 */
public class TabelaServidor extends AbstractTableModel {

    private List<Servidor> dados;
    private String[] colunas = {"SIAPE", "NOME", "EMAIL","HABILITADO"};

    public TabelaServidor(List<Servidor> lista) {
        if (lista == null) {
            dados = new ArrayList<Servidor>();
        } else {
            dados = lista;
        }
    }

    public TabelaServidor() {
        dados = new ArrayList<Servidor>();

    }

    public void addRow(Servidor p) {
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
                return dados.get(linha).getSiape();
            case 1:
                return dados.get(linha).getNome();
            case 2:
                return dados.get(linha).getEmail();
            case 3:
                return dados.get(linha).getHabilitado() ? "Sim" : "Não";
        }
        return null;
    }

    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

    public Servidor get(int linha) {
        return this.dados.get(linha);
    }

}
