package TrigoTest;
import Trigo.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CosTest {

	Trignometry cos;
	//beforeeach is used to signal that the annotated method should be executed before each @Test method in the current test class.
	@BeforeEach
	void setUp() throws Exception {
		cos = new Cos();
	}
	//@AfterEach is used to signal that the annotated method should be executed after each @Test method in the current test class.
	@AfterEach
	void tearDown() throws Exception {
		cos = null;
	}

	@Test
	public void testCocosRadianFirstQuad() {
		double actual = cos.calculate(1.309, "RADIAN");
		assertEquals(Math.cos(1.309), actual,0.0001," Cos First Quad");
	}
		
	@Test
	public void testCocosRadianSecondQuad() {
		double actual = cos.calculate(2.93215, "RADIAN");
		assertEquals(Math.cos(2.93215), actual,0.0001," Cos Second Quad");
		
	}
	@Test
	public void testCocosRadianThirdQuad() {
		double actual = cos.calculate(3.59538, "RADIAN");
		assertEquals(Math.cos(3.59538), actual,0.0001," Cos Third Quad");
		
	}
	@Test
	public void testCocosRadianFourthQuad() {
		double actual = cos.calculate(6.10865, "RADIAN");
		assertEquals(Math.cos(6.10865), actual,0.0001," Cos Fourth Quad");
		
	}
	
	@Test
	public void testCosDegreeFirstQuad() {
		double actual = cos.calculate(25, "DEGREE");
		assertEquals(Math.cos(Math.toRadians(25)), actual,0.0001," Cos First Quad");
	}
		
	@Test
	public void testCosDegreeSecondQuad() {
		double actual = cos.calculate(100, "DEGREE");
		assertEquals(Math.cos(Math.toRadians(100)), actual,0.0001," Cos Second Quad");
		
	}
	@Test
	public void testCosDegreeThirdQuad() {
		double actual = cos.calculate(250, "DEGREE");
		assertEquals(Math.cos(Math.toRadians(250)), actual,0.0001," Cos Third Quad");
		
	}
	@Test
	public void testCosDegreeFourthQuad() {
		double actual = cos.calculate(345, "DEGREE");
		assertEquals(Math.cos(Math.toRadians(345)), actual,0.0001," Cos Fourth Quad");
		
	}

	@Test
	public void testCos() {
		double actual = cos.calculate(0, "DEGREE");
		assertEquals(Math.cos(Math.toRadians(0)), actual,0.0001);
		
		actual = cos.calculate(90, "DEGREE");
		assertEquals(Math.cos(Math.toRadians(90)), actual,0.0001);
		
		actual = cos.calculate(180, "DEGREE");
		assertEquals(Math.cos(Math.toRadians(180)), actual,0.0001);
		
		actual = cos.calculate(270, "DEGREE");
		assertEquals(Math.cos(Math.toRadians(270)), actual,0.0001);
		
		actual = cos.calculate(360, "DEGREE");
		assertEquals(Math.cos(Math.toRadians(360)), actual,0.0001);
		
		actual = cos.calculate(0, "RADIAN");
		assertEquals(Math.cos(0), actual,0.0001);
		
		actual = cos.calculate(0.26179, "RADIAN");
		assertEquals(Math.cos(0.26179), actual,0.0001);
		
		actual = cos.calculate(2.4085, "RADIAN");
		assertEquals(Math.cos(2.4085), actual,0.0001);
		
		actual = cos.calculate(3.4033, "RADIAN");
		assertEquals(Math.cos(3.4033), actual,0.0001);
		
		actual = cos.calculate(5.4454, "RADIAN");
		assertEquals(Math.cos(5.4454), actual,0.0001);
		
	}



}
