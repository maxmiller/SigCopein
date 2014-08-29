/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sigcopein.combo;

import br.edu.ifrn.sigcopein.bean.Edital;
import br.edu.ifrn.sigcopein.services.EditalService;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**H˙
 *
 * @author maxmiller
 */
public class EditalComboBox implements ComboBoxModel<Edital> {

    private List<Edital> estados = new EditalService().findAll();
    private Edital selectedEstado;

    @Override
    public void setSelectedItem(Object o) {
        selectedEstado = (Edital) o;
    }

    @Override
    public Object getSelectedItem() {
        return selectedEstado;
    }

    @Override
    public int getSize() {
        return estados.size();
    }

    @Override
    public Edital getElementAt(int index) {
        return estados.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
    }

}
