package com.lio.calculos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName("Teste 5 + 5.2 = 10")
	void testSum() {
		//Arrange
		Calculadora calc = new Calculadora();
		double v1 = 5D;
		double v2 = 5.2D;
		double esperado = 10.2D;
		
		//Act
		double resultado = calc.sum(v1, v2);
		
		//Assert
		assertEquals(esperado, resultado, "5 + 5.2 não gerou o valor 10.2");
	}
	
	@Test
	@DisplayName("Teste 5 - 3.5 = 1.5")
	void testSub() {
		//Arrange
		Calculadora calc = new Calculadora();
		double v1 = 5D;
		double v2 = 3.5D;
		double esperado = 1.5D;
		
		//Act
		double resultado = calc.sub(v1, v2);
		
		//Assert
		assertEquals(esperado, resultado, "5 - 3.5 não gerou o valor 1.5");
	}
	
	@Test
	@DisplayName("Teste 5 / 2 = 2.5")
	void testDiv() {
		//Arrange
		Calculadora calc = new Calculadora();
		double v1 = 5D;
		double v2 = 2D;
		double esperado = 2.5D;
		
		//Act
		double resultado = calc.div(v1, v2);
		
		//Assert
		assertEquals(esperado, resultado, "5 / 2 não gerou o valor 2.5");
	}
	
	@Test
	@DisplayName("Teste 5 * 2.5 = 12.5")
	void testMult() {
		//Arrange
		Calculadora calc = new Calculadora();
		double v1 = 5D;
		double v2 = 2.5D;
		double esperado = 12.5D;
		
		//Act
		double resultado = calc.mult(v1, v2);
		
		//Assert
		assertEquals(esperado, resultado, "5 * 2.5 não gerou o valor 12.5");
	}
}
