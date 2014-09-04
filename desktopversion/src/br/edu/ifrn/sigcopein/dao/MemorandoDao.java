/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.sigcopein.dao;

import br.edu.ifrn.sigcopein.bean.Memorando;
import br.edu.ifrn.sigcopein.bean.Servidor;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author 1935921
 */
public class MemorandoDao extends GenericDao<Integer, Memorando>{

    public MemorandoDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public List<Memorando> findAll() {
        return getEntityManager().createNamedQuery("Memorando.findAll", Memorando.class).getResultList();
    }
    
   

  
   
    
}
