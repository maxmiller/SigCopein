/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sigcopein.combo;

import br.edu.ifrn.sigcopein.bean.Banco;
import br.edu.ifrn.sigcopein.services.BancoService;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author maxmiller
 */
public class BancoComboBox implements ComboBoxModel<Banco> {

    private List<Banco> estados = new BancoService().findAll();
    private Banco selectedEstado;

    @Override
    public void setSelectedItem(Object o) {
        selectedEstado = (Banco) o;
    }

    @Override
    public Banco getSelectedItem() {
        return selectedEstado;
    }

    @Override
    public int getSize() {
        return estados.size();
    }

    @Override
    public Banco getElementAt(int index) {
        return estados.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
    }

}
