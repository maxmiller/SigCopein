/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.sigcopein.bean.utils;

import br.edu.ifrn.sigcopein.bean.report.ListaProjeto;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1935921
 */
public class RelatorioTest {
    
    public RelatorioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of listaProjeto method, of class Relatorio.
     */
    @Test
    public void testListaProjeto() {
        System.out.println("listaProjeto");
        int ano = 2012;
        List<ListaProjeto> expResult = null;
        List<ListaProjeto> result = Relatorio.listaProjeto(ano);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
