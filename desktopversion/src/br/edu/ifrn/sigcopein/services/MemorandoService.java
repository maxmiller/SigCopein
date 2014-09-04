/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sigcopein.services;

import br.edu.ifrn.sigcopein.bean.Memorando;
import br.edu.ifrn.sigcopein.dao.MemorandoDao;
import br.edu.ifrn.sigcopein.dao.SimpleEntityManager;
import br.edu.ifrn.sigcopein.util.SigUtils;
import java.util.List;

/**
 *
 * @author 1935921
 */
public class MemorandoService {

    private MemorandoDao dao;
    private SimpleEntityManager simpleEntityManager;

    public MemorandoService(SimpleEntityManager simpleEntityManager) {
        this.simpleEntityManager = simpleEntityManager;
        dao = new MemorandoDao(simpleEntityManager.getEntityManager());
    }

    public MemorandoService() {
        this.simpleEntityManager = new SimpleEntityManager(SigUtils.PERSISTENCE_UNIT);
        dao = new MemorandoDao(simpleEntityManager.getEntityManager());
    }

    public void save(Memorando service) {
      
        try {
            simpleEntityManager.beginTransaction();
            //costumer.validate();
            dao.save(service);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    public void update(Memorando service) {
        try {
            simpleEntityManager.beginTransaction();
            //costumer.validate();
            dao.update(service);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    public void remove(Memorando service) {
        
        try {
            simpleEntityManager.beginTransaction();
            //costumer.validate();
            dao.update(service);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    public List<Memorando> findAll() {
        return dao.findAll();
    }
    
  
}
