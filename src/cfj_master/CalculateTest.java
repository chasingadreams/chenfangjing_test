package cfj_master;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CalculateTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		System.out.println("this is testAdd()...");
		int result = Calculate.add(1, 2);
		assertEquals("加法有问题", 3, result);
	}
	
	@Test
    public void testSubstract()
    {
        System.out.println("this is testSubstract()...");  
        int result = Calculate.substract(19, 9);
        assertEquals("减法有问题", 10, result); 
    }

    @Test
    public void testMultiply() 
    {
        int result = Calculate.multiply(1, 3);  
        assertEquals("乘法有问题", 3, result);  
    }

    @Test
    public void testDivide() 
    {
        int result = Calculate.divide(10,2);  
        assertEquals("除法有问题", 5, result);  
    }

}
