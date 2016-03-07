package base;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestTriangle {

	@Test
	public void TestgetArea() {
		
		TestTriangle TriArea = new Triange(1.0,1.0,1.0);
		double expectedresult = 0.433;
		double actualresult = TriArea.getArea();
		assertEquals(toString,expectedresult, actualresult);
	
	}

	@Test
	public void TestgetPerimeter() {
		fail("Not yet implemented");

	}
}