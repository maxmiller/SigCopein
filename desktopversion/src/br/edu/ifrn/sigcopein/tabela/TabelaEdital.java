/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sigcopein.tabela;

import br.edu.ifrn.sigcopein.bean.Edital;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 1935921
 */
public class TabelaEdital extends AbstractTableModel {

    private List<Edital> dados;
    private String[] colunas = {"CODIGO", "DESCRIÇÃO","HABILITADO"};

    public TabelaEdital(List<Edital> lista) {
        if (lista == null) {
            dados = new ArrayList<Edital>();
        } else {
            dados = lista;
        }
    }

    public TabelaEdital() {
        dados = new ArrayList<Edital>();

    }

    public void addRow(Edital p) {
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
                return dados.get(linha).getEditalId();
            case 1:
                return dados.get(linha).getDescricao();
          case 3:
                return dados.get(linha).getHabilitado()?"Sim":"Não";
        }
        return null;
    }

    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

    public Edital get(int linha) {
        return this.dados.get(linha);
    }

}
