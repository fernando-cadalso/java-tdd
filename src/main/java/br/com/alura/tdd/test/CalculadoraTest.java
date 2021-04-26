package br.com.alura.tdd.test;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class CalculadoraTest {

	@Test //Anotação para transferir o controle da execução para o JUnit
	public void somaDoisNumerosPositivos() {
		/*
		 * Instancio a classe de interesse, que será testada.
		 */
		Calculadora calc = new Calculadora();
		int somar = calc.somar(7, 3);
		/*
		 * Classe do JUnit que verifica se dois valores são equivalentes ou iguais. 
		 */
		Assert.assertEquals(11, somar);
	}
}
