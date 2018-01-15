package pl.lodz.uni.math.TestProject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pl.lodz.uni.math.project.Calculator;



public class CalculatorTest {
	
	private static Calculator test;
	private static Calculator testCalc;
	private int result;

    @BeforeClass
    public static void setUpClass()    {
    	test = new Calculator(1,2);
    }
    
    @AfterClass
    public static void tearDownClass()    {
        
    }
    
    @Before
    public void setUp()  {
    	testCalc = new Calculator(7,8);
    }
    
    @After
    public void tearDown()   {
    	testCalc = null;
    }

    
    @Test
	public void testAdd() 
	{
    	test.add();
    	result=test.getResult();
		assertEquals(3,result);
	}
		
	@Test
	public void testSumAssertNotNull()
	{
		result = test.sum(4,5);
		Assert.assertNotNull(result);
	}
	
	
	@Test
	public void testProductEquals() 
	{
		assertEquals(12,test.product(6,2));
	}
	

	@Test
	public void testDiffAssertNotNull()
	{
		Assert.assertNotNull(test.difference(6,2));
	}

	@Test
    public void testNull()
    {
        assertNull(test.Null());
    }
	
    @Test
    public void testNotNull()
    {
        assertNotNull(test.modulo(5,3));
    }
    
    @Test
    public void testAssertTrue()
    {
    	assertTrue(testCalc.isModulo(4,2));  	
    }
    
    @Test
    public void testAssertFalse()
    {
    	assertFalse(test.isModulo(9,4));  	
    }
	

}

