/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adriel
 */
public class FormMusicaTest {
    
    public FormMusicaTest() {
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
     * Test of popularComboArtistas method, of class FormMusica.
     */
    @Test
    public void testPopularComboArtistas() throws Exception {
        System.out.println("popularComboArtistas");
        FormMusica instance = new FormMusica();
        instance.popularComboArtistas();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of popularComboAlbuns method, of class FormMusica.
     */
    @Test
    public void testPopularComboAlbuns() throws Exception {
        System.out.println("popularComboAlbuns");
        FormMusica instance = new FormMusica();
        instance.popularComboAlbuns();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of obterDadosMusica method, of class FormMusica.
     */
    @Test
    public void testObterDadosMusica() throws Exception {
        System.out.println("obterDadosMusica");
        String mus = "";
        FormMusica instance = new FormMusica();
        instance.obterDadosMusica(mus);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
