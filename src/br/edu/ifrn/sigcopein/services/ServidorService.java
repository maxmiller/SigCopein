/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sigcopein.services;

import br.edu.ifrn.sigcopein.bean.Servidor;
import br.edu.ifrn.sigcopein.dao.ServidorDao;
import br.edu.ifrn.sigcopein.dao.SimpleEntityManager;
import java.util.List;

/**
 *
 * @author 1935921
 */
public class ServidorService {

    private ServidorDao dao;
    private final String PERSISTENCE_UNIT = "SigCOPEINPU";
    private SimpleEntityManager simpleEntityManager;

    public ServidorService(SimpleEntityManager simpleEntityManager) {
        this.simpleEntityManager = simpleEntityManager;
        dao = new ServidorDao(simpleEntityManager.getEntityManager());
    }

    public ServidorService() {
        this.simpleEntityManager = new SimpleEntityManager(PERSISTENCE_UNIT);
        dao = new ServidorDao(simpleEntityManager.getEntityManager());
    }

    public void save(Servidor service) {
        service.setHabilitado(true);
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

    public void update(Servidor service) {
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

    public void remove(Servidor service) {
        service.setHabilitado(false);
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

    public List<Servidor> findAll() {
        return dao.findAll();
    }
    
    public Servidor findBySiape(String siape){
        return dao.finBySiape(siape);
    }
}
