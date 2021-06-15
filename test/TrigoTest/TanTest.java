package TrigoTest;
import Trigo.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TanTest {

	Trignometry tan;
	@BeforeEach
	void setUp() throws Exception {
		tan = new Tan();
	}

	@AfterEach
	void tearDown() throws Exception {
		tan = null;
	}

	@Test
	public void testTanInRadianFirstQuad() {
		double actual = tan.calculate(1.309,"RADIAN");
		assertEquals(Math.tan(1.309), actual,0.0001," Tan First Quad");
	}
		
	@Test
	public void testTanInRadianSecondQuad() {
		double actual = tan.calculate(2.93215, "RADIAN");
		assertEquals(Math.tan(2.93215), actual,0.0001," Tan Second Quad");
		
	}
	@Test
	public void testTanInRadianThirdQuad() {
		double actual = tan.calculate(3.59538, "RADIAN");
		assertEquals(Math.tan(3.59538), actual,0.0001," Tan Third Quad");
		
	}
	@Test
	public void testTanInRadianFourthQuad() {
		double actual = tan.calculate(6.10865, "RADIAN");
		assertEquals(Math.tan(6.10865), actual,0.0001," Tan Fourth Quad");
		
	}
	
	@Test
	public void testtanDegreeFirstQuad() {
		double actual = tan.calculate(25, "DEGREE");
		assertEquals(Math.tan(Math.toRadians(25)), actual,0.0001," tan First Quad");
	}
		
	@Test
	public void testtanDegreeSecondQuad() {
		double actual = tan.calculate(100, "DEGREE");
		assertEquals(Math.tan(Math.toRadians(100)), actual,0.0001," tan Second Quad");
		
	}
	@Test
	public void testtanDegreeThirdQuad() {
		double actual = tan.calculate(250, "DEGREE");
		assertEquals(Math.tan(Math.toRadians(250)), actual,0.0001," tan Third Quad");
		
	}
	@Test
	public void testtanDegreeFourthQuad() {
		double actual = tan.calculate(345, "DEGREE");
		assertEquals(Math.tan(Math.toRadians(345)), actual,0.0001," tan Fourth Quad");
		
	}

	@Test
	public void testtan() {
		double actual = tan.calculate(0, "DEGREE");
		assertEquals(Math.tan(Math.toRadians(0)), actual,0.0001);
		
		actual = tan.calculate(80, "DEGREE");
		assertEquals(Math.tan(Math.toRadians(80)), actual,0.0001);
		
		actual = tan.calculate(170, "DEGREE");
		assertEquals(Math.tan(Math.toRadians(170)), actual,0.0001);
		
		actual = tan.calculate(260, "DEGREE");
		assertEquals(Math.tan(Math.toRadians(260)), actual,0.0001);
		
		actual = tan.calculate(350, "DEGREE");
		assertEquals(Math.tan(Math.toRadians(350)), actual,0.0001);
		
		actual = tan.calculate(0, "RADIAN");
		assertEquals(Math.tan(0), actual,0.0001);
		
		actual = tan.calculate(0.7853, "RADIAN");
		assertEquals(Math.tan(0.7853), actual,0.0001);
		
		actual = tan.calculate(2.4085, "RADIAN");
		assertEquals(Math.tan(2.4085), actual,0.0001);
		
		actual = tan.calculate(3.4033, "RADIAN");
		assertEquals(Math.tan(3.4033), actual,0.0001);
		
		actual = tan.calculate(5.4454, "RADIAN");
		assertEquals(Math.tan(5.4454), actual,0.0001);

	}



}
