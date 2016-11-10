/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author rnexer
 */
public class StringCalculatorTest {
    
    public StringCalculatorTest() {
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
    
    @Test
    public void testAdd2Numbers() throws NegativeNotAllowedException{
        int result = StringCalculator.add("1,2");
        assertTrue(result == 3);
    }
    
    @Test
    public void testAdd1Numbers() throws NegativeNotAllowedException{
        int result = StringCalculator.add("1");
        assertTrue(result == 1);
    }
    
    @Test
    public void testAdd0Number() throws NegativeNotAllowedException{
        int result = StringCalculator.add("");
        assertTrue(result == 0);
    }
    
    @Test
    public void testMultipleNumbers() throws NegativeNotAllowedException{
        int result = StringCalculator.add("1,2,3");
        assertTrue(result == 6);
    }
    
    @Test
    public void testMultipleDelimeters() throws NegativeNotAllowedException{
        int result = StringCalculator.add("1,2\n3");
        assertTrue(result == 6);
    }
    
    @Test
    public void testChangeDelimeters() throws NegativeNotAllowedException{
        int result = StringCalculator.add("//::\n1::2::3");
        assertTrue(result == 6);
    }
    
    @Test(expected = NegativeNotAllowedException.class )
    public void testNegativesNumbers() throws NegativeNotAllowedException{
        int result = StringCalculator.add("1,-2\n-3");
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
