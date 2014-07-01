/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sigcopein.tabela;

import br.edu.ifrn.sigcopein.bean.AlunoProjeto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 1935921
 */
public class TabelaAlunoProjeto extends AbstractTableModel {

    private List<AlunoProjeto> dados;
    private String[] colunas = {"MATRICULA", "NOME", "PROJETO", "BOLSISTA", "CARGA-HORARIA"};

    public TabelaAlunoProjeto(List<AlunoProjeto> lista) {
        if (lista == null) {
            dados = new ArrayList<AlunoProjeto>();
        } else {
            dados = lista;
        }
    }

    public TabelaAlunoProjeto() {
        dados = new ArrayList<AlunoProjeto>();

    }

    public void addRow(AlunoProjeto p) {
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
                return dados.get(linha).getAlunoId().getMatricula();
            case 1:
                return dados.get(linha).getAlunoId().getNome();
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

    public AlunoProjeto get(int linha) {
        return this.dados.get(linha);
    }

}
