/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.sigcopein.dao;

import br.edu.ifrn.sigcopein.bean.Servidor;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author 1935921
 */
public class ServidorDao extends GenericDao<Long, Servidor>{

    public ServidorDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public List<Servidor> findAll() {
        return getEntityManager().createNamedQuery("Servidor.findAll", Servidor.class).getResultList();
    }
    
   
    
}
