/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acrostic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nameless
 */
public class LibClassTest {

    public LibClassTest() {
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
     * Test of acrostic method, of class LibClass.
     */
    @Test
    public void testAcrostic() {
        System.err.println("Running testAcrostic...");
        String result = LibClass.acrostic(new String[]{"fnord", "polly", "tropism"});
        assertEquals("Correct value", "foo", result);
    }

}
