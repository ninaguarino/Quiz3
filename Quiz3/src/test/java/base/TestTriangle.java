package base;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestTriangle {
	Triangle myTriangle;
	
	@Before
	public void setUp() throws Exception{
	 myTriangle = new Triangle(1.0,1.0,1.0);
	}
	
	@After
	public void tearDown() throws Exception{
		myTriangle = null;
	}
	
	
	@Test
	public void getAreaTest() {
		assertTrue(myTriangle.getArea() == 0.5);
		assertFalse(myTriangle.getArea() == 3.5);
	}


	@Test
	public void getPerimeterTest1() {
		assertTrue(myTriangle.getPerimeter() == 3.0);
		assertFalse(myTriangle.getPerimeter() == 3.0);

	}
	

}