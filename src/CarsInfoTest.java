

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CarsInfoTest {

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
	public void testGetCarsName() {
		assertEquals(new CarsInfo().getCarsName(),("¿­µÏÀ­¿Ë"));
	}

	@Test
	public void testGetCarsId() {
		assertEquals(new CarsInfo().getCarsId(),("1"));
	}

	@Test
	public void testGetCarsUsingYears() {
		assertEquals(new CarsInfo().getCarsUsingYears(),("60"));
	}

	@Test
	public void testGetCarsSpeed() {
		assertEquals(new CarsInfo().getCarsSpeed(),("300"));
	}

}
