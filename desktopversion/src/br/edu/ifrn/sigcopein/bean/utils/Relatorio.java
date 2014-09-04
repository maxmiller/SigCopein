/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.sigcopein.bean.utils;

import br.edu.ifrn.sigcopein.bean.Projeto;
import br.edu.ifrn.sigcopein.bean.report.ListaProjeto;
import br.edu.ifrn.sigcopein.services.ProjetoService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1935921
 */
public class Relatorio {
    
    
    public static List<ListaProjeto> listaProjeto(int ano){
        ProjetoService service =  new ProjetoService();
        List<ListaProjeto> listaProjeto  =  new ArrayList<>();
        List<Projeto> lista = service.findByAno(ano);
        for(Projeto a : lista){
            ListaProjeto x = new ListaProjeto(ano, a.getNome(), a.getDataInicio(), a.getDataFim(),a.getEditalId().getDescricao());
            listaProjeto.add(x);
        }
        
        return listaProjeto;
    }
}
