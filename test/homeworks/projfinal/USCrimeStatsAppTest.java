/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworks.projfinal;

import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author enfabre
 */
public class USCrimeStatsAppTest {
//    
//    public USCrimeStatsAppTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of displayMenu method, of class USCrimeStatsApp.
//     */
//    @Test
//    public void testDisplayMenu() {
//        System.out.println("displayMenu");
//        USCrimeStatsApp.displayMenu();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getUserInput method, of class USCrimeStatsApp.
//     */
//    @Test
//    public void testGetUserInput() {
//        System.out.println("getUserInput");
//        String expResult = "";
//        String result = USCrimeStatsApp.getUserInput();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of readFile method, of class USCrimeStatsApp.
//     */
//    @Test
//    public void testReadFile() {
//        System.out.println("readFile");
//        String filename = "";
//        Map<Integer, USCrimeClass> expResult = null;
//        Map<Integer, USCrimeClass> result = USCrimeStatsApp.readFile(filename);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of main method, of class USCrimeStatsApp.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = new String[1];
        args[0] = "Crime.csv";
        USCrimeStatsApp.main(args);
    }
    
}
