package TrigoTest;
import Trigo.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SinTest {

	Trignometry sin;
	@BeforeEach
	void setUp() throws Exception {
		sin = new Sin();
	}

	@AfterEach
	void tearDown() throws Exception {
		sin = null;
	}

	@Test
	public void testSinInRadianFirstQuad() {
		double actual = sin.calculate(1.309, "RADIAN");
		assertEquals(Math.sin(1.309), actual,0.0001," Sin First Quad");
	}
		
	@Test
	public void testSinInRadianSecondQuad() {
		double actual = sin.calculate(2.93215, "RADIAN");
		assertEquals(Math.sin(2.93215), actual,0.0001," Sin Second Quad");
		
	}
	@Test
	public void testSinInRadianThirdQuad() {
		double actual = sin.calculate(3.59538, "RADIAN");
		assertEquals(Math.sin(3.59538), actual,0.0001," Sin Third Quad");
		
	}
	@Test
	public void testSinInRadianFourthQuad() {
		double actual = sin.calculate(6.10865, "RADIAN");
		assertEquals(Math.sin(6.10865), actual,0.0001," Sin Fourth Quad");
		
	}
	
	@Test
	public void testSInDegreeFirstQuad() {
		double actual = sin.calculate(25, "DEGREE");
		assertEquals(Math.sin(Math.toRadians(25)), actual,0.0001," Sin First Quad");
	}
		
	@Test
	public void testSInDegreeSecondQuad() {
		double actual = sin.calculate(100, "DEGREE");
		assertEquals(Math.sin(Math.toRadians(100)), actual,0.0001," Sin Second Quad");
		
	}
	@Test
	public void testSInDegreeThirdQuad() {
		double actual = sin.calculate(250, "DEGREE");
		assertEquals(Math.sin(Math.toRadians(250)), actual,0.0001," Sin Third Quad");
		
	}
	@Test
	public void testSInDegreeFourthQuad() {
		double actual = sin.calculate(345, "DEGREE");
		assertEquals(Math.sin(Math.toRadians(345)), actual,0.0001," Sin Fourth Quad");
		
	}

	@Test
	public void testSin() {
		double actual = sin.calculate(0, "DEGREE");
		assertEquals(Math.sin(Math.toRadians(0)), actual,0.0001);
		
		actual = sin.calculate(90, "DEGREE");
		assertEquals(Math.sin(Math.toRadians(90)), actual,0.0001);
		
		actual = sin.calculate(180, "DEGREE");
		assertEquals(Math.sin(Math.toRadians(180)), actual,0.0001);
		
		actual = sin.calculate(270, "DEGREE");
		assertEquals(Math.sin(Math.toRadians(270)), actual,0.0001);
		
		actual = sin.calculate(360, "DEGREE");
		assertEquals(Math.sin(Math.toRadians(360)), actual,0.0001);
		
		actual = sin.calculate(0, "RADIAN");
		assertEquals(Math.sin(0), actual,0.0001);
		
		actual = sin.calculate(0.26179, "RADIAN");
		assertEquals(Math.sin(0.26179), actual,0.0001);
		
		actual = sin.calculate(2.4085, "RADIAN");
		assertEquals(Math.sin(2.4085), actual,0.0001);
		
		actual = sin.calculate(3.4033, "RADIAN");
		assertEquals(Math.sin(3.4033), actual,0.0001);
		
		actual = sin.calculate(5.4454, "RADIAN");
		assertEquals(Math.sin(5.4454), actual,0.0001);

	}



}
