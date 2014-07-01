/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.sigcopein.dao;

import br.edu.ifrn.sigcopein.bean.AlunoProjeto;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author 1935921
 */
public class AlunoProjetoDao extends GenericDao<Long, AlunoProjeto>{

    public AlunoProjetoDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public List<AlunoProjeto> findAll() {
        return getEntityManager().createNamedQuery("AlunoProjeto.findAll", AlunoProjeto.class).getResultList();
    }

  
   
    
}
