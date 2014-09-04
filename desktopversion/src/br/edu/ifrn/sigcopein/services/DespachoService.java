/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sigcopein.services;

import br.edu.ifrn.sigcopein.bean.Aluno;
import br.edu.ifrn.sigcopein.bean.Despacho;
import br.edu.ifrn.sigcopein.dao.AlunoDao;
import br.edu.ifrn.sigcopein.dao.DespachoDao;
import br.edu.ifrn.sigcopein.dao.SimpleEntityManager;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author 1935921
 */
public class DespachoService {

    private DespachoDao dao;
    private final String PERSISTENCE_UNIT = "SigCOPEINPU";
    private SimpleEntityManager simpleEntityManager;

    public DespachoService(SimpleEntityManager simpleEntityManager) {
        this.simpleEntityManager = simpleEntityManager;
        dao = new DespachoDao(simpleEntityManager.getEntityManager());
    }

    public DespachoService() {
        this.simpleEntityManager = new SimpleEntityManager(PERSISTENCE_UNIT);
        dao = new DespachoDao(simpleEntityManager.getEntityManager());
    }

    public void save(Despacho service) {
        service.setDataDespacho(GregorianCalendar.getInstance().getTime());
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

    public void update(Despacho service) {
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
    
    public void remove(Despacho service) {
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

   

    public List<Despacho> findAll() {
        return dao.findAll();
    }
}
