/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sigcopein.services;

import br.edu.ifrn.sigcopein.bean.Servidor;
import br.edu.ifrn.sigcopein.bean.ServidorProjeto;
import br.edu.ifrn.sigcopein.dao.ServidorDao;
import br.edu.ifrn.sigcopein.dao.ServidorProjetoDao;
import br.edu.ifrn.sigcopein.dao.SimpleEntityManager;
import java.util.List;

/**
 *
 * @author 1935921
 */
public class ServidorProjetoService {

    private ServidorProjetoDao dao;
    private final String PERSISTENCE_UNIT = "SigCOPEINPU";
    private SimpleEntityManager simpleEntityManager;

    public ServidorProjetoService(SimpleEntityManager simpleEntityManager) {
        this.simpleEntityManager = simpleEntityManager;
        dao = new ServidorProjetoDao(simpleEntityManager.getEntityManager());
    }

    public ServidorProjetoService() {
        this.simpleEntityManager = new SimpleEntityManager(PERSISTENCE_UNIT);
        dao = new ServidorProjetoDao(simpleEntityManager.getEntityManager());
    }

    public void save(ServidorProjeto service) {
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

    public void update(ServidorProjeto service) {
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

    public void remove(ServidorProjeto service) {
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

    public List<ServidorProjeto> findAll() {
        return dao.findAll();
    }
}
