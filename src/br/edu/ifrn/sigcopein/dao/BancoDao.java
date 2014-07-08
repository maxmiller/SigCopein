/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.sigcopein.dao;

import br.edu.ifrn.sigcopein.bean.Banco;
import br.edu.ifrn.sigcopein.bean.Servidor;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author 1935921
 */
public class BancoDao extends GenericDao<Integer, Banco>{

    public BancoDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public List<Banco> findAll() {
        return getEntityManager().createNamedQuery("Banco.findAll", Banco.class).getResultList();
    }
    
    
}
