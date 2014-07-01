/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sigcopein.tabela;

import br.edu.ifrn.sigcopein.bean.Aluno;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 1935921
 */
public class TabelaAluno extends AbstractTableModel {

    private List<Aluno> dados;
    private String[] colunas = {"MATRICULA", "NOME", "EMAIL"};

    public TabelaAluno(List<Aluno> lista) {
        if (lista == null) {
            dados = new ArrayList<Aluno>();
        } else {
            dados = lista;
        }
    }

    public TabelaAluno() {
        dados = new ArrayList<Aluno>();

    }

    public void addRow(Aluno p) {
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
                return dados.get(linha).getMatricula();
            case 1:
                return dados.get(linha).getNome();
            case 2:
                return dados.get(linha).getEmail();

        }
        return null;
    }

    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

    public Aluno get(int linha) {
        return this.dados.get(linha);
    }

}
