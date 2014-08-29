/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.sigcopein.dao;

import br.edu.ifrn.sigcopein.bean.ServidorProjeto;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author 1935921
 */
public class ServidorProjetoDao extends GenericDao<Integer, ServidorProjeto>{

    public ServidorProjetoDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public List<ServidorProjeto> findAll() {
        return getEntityManager().createNamedQuery("ServidorProjeto.findAll", ServidorProjeto.class).getResultList();
    }

  
   
    
}
