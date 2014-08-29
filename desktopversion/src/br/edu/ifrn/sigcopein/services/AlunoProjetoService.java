/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sigcopein.services;

import br.edu.ifrn.sigcopein.bean.Aluno;
import br.edu.ifrn.sigcopein.bean.AlunoProjeto;
import br.edu.ifrn.sigcopein.dao.AlunoDao;
import br.edu.ifrn.sigcopein.dao.AlunoProjetoDao;
import br.edu.ifrn.sigcopein.dao.SimpleEntityManager;
import java.util.List;

/**
 *
 * @author 1935921
 */
public class AlunoProjetoService {

    private AlunoProjetoDao dao;
    private final String PERSISTENCE_UNIT = "SigCOPEINPU";
    private SimpleEntityManager simpleEntityManager;

    public AlunoProjetoService(SimpleEntityManager simpleEntityManager) {
        this.simpleEntityManager = simpleEntityManager;
        dao = new AlunoProjetoDao(simpleEntityManager.getEntityManager());
    }

    public AlunoProjetoService() {
        this.simpleEntityManager = new SimpleEntityManager(PERSISTENCE_UNIT);
        dao = new AlunoProjetoDao(simpleEntityManager.getEntityManager());
    }

    public void save(AlunoProjeto service) {
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

    public void update(AlunoProjeto service) {
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

    public void remove(AlunoProjeto service) {
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

    public List<AlunoProjeto> findAll() {
        return dao.findAll();
    }
}
