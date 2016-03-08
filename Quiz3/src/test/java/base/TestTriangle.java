package base;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestTriangle {



	@Before
	public void setUp() throws Exception{
	//Triangle myTriangle = new Triangle(1.0,1.0,1.0);
	}
	
	@After
	public void tearDown() throws Exception{
		Object myTriangle = null;
	}
	
	
	@Test
	public void getAreaTest() {
		Triangle myTriangle = new Triangle(1.0,1.0,1.0);
		assertEquals(myTriangle.getArea(), 0.433, 4.0);
	}


	@Test
	public void getPerimeterTest() {
		Triangle myTriangle = new Triangle(1.0,1.0,1.0);
		assertEquals(myTriangle.getPerimiter(), 3.0, 2.0);

	}
	

}