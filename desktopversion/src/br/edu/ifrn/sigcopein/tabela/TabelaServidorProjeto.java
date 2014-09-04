/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sigcopein.tabela;

import br.edu.ifrn.sigcopein.bean.ServidorProjeto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 1935921
 */
public class TabelaServidorProjeto extends AbstractTableModel {

    private List<ServidorProjeto> dados;
    private String[] colunas = {"SIAPE", "NOME", "PROJETO", "BOLSISTA", "CARGA-HORARIA"};

    public TabelaServidorProjeto(List<ServidorProjeto> lista) {
        if (lista == null) {
            dados = new ArrayList<ServidorProjeto>();
        } else {
            dados = lista;
        }
    }

    public TabelaServidorProjeto() {
        dados = new ArrayList<ServidorProjeto>();

    }

    public void addRow(ServidorProjeto p) {
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
                return dados.get(linha).getServidorId().getSiape();
            case 1:
                return dados.get(linha).getServidorId().getNome();
            case 2:
                return dados.get(linha).getProjetoId().getNome();
            case 3:
                return dados.get(linha).getBolsista() ? "SIM": "NÃO";
            case 4:
                return dados.get(linha).getCargaHoraria();
        }
        return null;
    }

    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

    public ServidorProjeto get(int linha) {
        return this.dados.get(linha);
    }

}
