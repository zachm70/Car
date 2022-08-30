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

public class CarTest2 {

	Car car = new Car();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test 
	public void testNeedsOilChange() {
		car.setMiles(100000);
		assertTrue(car.needsOilChange());
	}
	
	@Test
	public void testDoNotNeedOilChange() {
		car.setMiles(10000);
		assertFalse(car.needsOilChange());
	}

}
