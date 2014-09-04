/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.sigcopein.dao;

import br.edu.ifrn.sigcopein.bean.Projeto;
import java.sql.Connection;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author 1935921
 */
public class ProjetoDao extends GenericDao<Integer, Projeto>{

    public ProjetoDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public List<Projeto> findAll() {
        return getEntityManager().createNamedQuery("Projeto.findAll", Projeto.class).getResultList();
    }

    public Connection getConnectionProjeto(){
        Connection con = null;
        getEntityManager().getTransaction().begin();
        con = getEntityManager().unwrap(java.sql.Connection.class);
        getEntityManager().getTransaction().commit();
        return con;
    } 
    
   public List<Projeto> findByAno(int ano) {
        return getEntityManager().createNamedQuery("Projeto.findByAno", Projeto.class).setParameter("ano", ano).getResultList();
    }

   
    
}
