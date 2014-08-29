/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sigcopein.services;

import br.edu.ifrn.sigcopein.bean.Banco;
import br.edu.ifrn.sigcopein.dao.BancoDao;
import br.edu.ifrn.sigcopein.dao.SimpleEntityManager;
import java.util.List;

/**
 *
 * @author 1935921
 */
public class BancoService {

    private BancoDao dao;
    private final String PERSISTENCE_UNIT = "SigCOPEINPU";
    private SimpleEntityManager simpleEntityManager;

    public BancoService(SimpleEntityManager simpleEntityManager) {
        this.simpleEntityManager = simpleEntityManager;
        dao = new BancoDao(simpleEntityManager.getEntityManager());
    }

    public BancoService() {
        this.simpleEntityManager = new SimpleEntityManager(PERSISTENCE_UNIT);
        dao = new BancoDao(simpleEntityManager.getEntityManager());
    }

    public void save(Banco service) {
//        service.setHabilitado(true);
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

    public void update(Banco service) {
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

    public void remove(Banco service) {
//        service.setHabilitado(false);
        try {
            simpleEntityManager.beginTransaction();
            //costumer.validate();
            dao.delete(service);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    public List<Banco> findAll() {
        return dao.findAll();
    }
    
    
}
