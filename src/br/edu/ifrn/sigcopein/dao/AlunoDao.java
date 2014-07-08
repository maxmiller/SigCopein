/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.sigcopein.dao;

import br.edu.ifrn.sigcopein.bean.Aluno;
import br.edu.ifrn.sigcopein.bean.Servidor;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author 1935921
 */
public class AlunoDao extends GenericDao<Integer, Aluno>{

    public AlunoDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public List<Aluno> findAll() {
        return getEntityManager().createNamedQuery("Aluno.findAll", Aluno.class).getResultList();
    }
    
    public Aluno findByMatricula(String matricula){
        return getEntityManager().createNamedQuery("Aluno.findByMatricula",Aluno.class).setParameter("matricula", matricula).getSingleResult();
    }


  
   
    
}
