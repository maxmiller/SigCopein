/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.sigcopein.dao;

import br.edu.ifrn.sigcopein.bean.Edital;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author 1935921
 */
public class EditalDao extends GenericDao<Integer, Edital>{

    public EditalDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public List<Edital> findAll() {
        return getEntityManager().createNamedQuery("Edital.findAll", Edital.class).getResultList();
    }
    
    
    
}
