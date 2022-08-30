/**  
* @author Zach Meyer - zjmeyer  
* CIS175 - Spring 2022
* Aug 26, 2022  
*/
package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Car;

public class CarTest {
	
	Car car = new Car();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSetPrint() {
		car.setColor("White");
		car.setMake("Chevy");
		car.setModel("Trax");
		car.setYear(2017);
		assertEquals("White 2017 Chevy Trax", car.print());
	}
	
	@Test public void testOilChange() {
		car.setMiles(100000);
		assertTrue(car.needsOilChange());
	}

}
