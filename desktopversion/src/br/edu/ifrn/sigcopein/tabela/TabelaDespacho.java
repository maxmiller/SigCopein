/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sigcopein.tabela;

import br.edu.ifrn.sigcopein.bean.Despacho;
import br.edu.ifrn.sigcopein.util.DateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 1935921
 */
public class TabelaDespacho extends AbstractTableModel {

    private List<Despacho> dados;
    private String[] colunas = {"DATA", "SERVIDOR", "EVENTO","LOCAL", "INÍCIO", "FIM", "PASSAGEM ÁREA"};

    public TabelaDespacho(List<Despacho> lista) {
        if (lista == null) {
            dados = new ArrayList<Despacho>();
        } else {
            dados = lista;
        }
    }

    public TabelaDespacho() {
        dados = new ArrayList<Despacho>();

    }

    public void addRow(Despacho p) {
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
                return DateUtil.dateConverter(dados.get(linha).getDataDespacho());
            case 1:
                return dados.get(linha).getServidorId().getNome();
            case 2:
                return dados.get(linha).getEvento();
            case 3:
                return dados.get(linha).getLocal();
                
            case 4:
                return DateUtil.dateConverter(dados.get(linha).getDataInicio());
            case 5:
                return DateUtil.dateConverter(dados.get(linha).getDataFim());
            case 6:
                return dados.get(linha).getPassagemAerea()?"SIM":"NÃO";
        }
        return null;
    }

    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

    public Despacho get(int linha) {
        return this.dados.get(linha);
    }

}
