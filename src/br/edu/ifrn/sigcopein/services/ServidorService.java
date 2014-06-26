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
     
    private SimpleEntityManager simpleEntityManager;
     
    public ServidorService(SimpleEntityManager simpleEntityManager){
        this.simpleEntityManager = simpleEntityManager;
        dao = new ServidorDao(simpleEntityManager.getEntityManager());
    }
     
    public void save(Servidor costumer){
        try{
            simpleEntityManager.beginTransaction();
            //costumer.validate();
            dao.save(costumer);
            simpleEntityManager.commit();
        }catch(Exception e){
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
     
    public List<Servidor> findAll(){
        return dao.findAll();
    }
}
