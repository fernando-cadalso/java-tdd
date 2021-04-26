package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {
	/*
	 * Teste do caso em que 10% do salário é maior que 1000,
	 * devendo retornar zero para o bônus.
	 */
	@Test
	void calcularBonusDeveRetornarUmaExcecao() {
		BonusService service = new BonusService();
		/*
		 * Testa se o método calcularBonus vai retornar uma exceção do tipo IllegalArgumentException.
		 * O lambda foi utilizado para trata-se de uma implementação funcional envolvendo
		 * uma nova instância da classe passada no primeiro argumento.
		 */
		assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(new Funcionario("Fernando", LocalDate.now(), new BigDecimal("25000"))));
	}
	/*
	 * Teste do caso em que 10% do salário é menor que 1000,
	 * devendo retornar um valor entre 0 e 1000 para o bônus.
	 */
	@Test
	void calcularBonusDeveRetornarAbaixoDe10PorcentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal calcularBonus = service.calcularBonus(new Funcionario("Fernando", LocalDate.now(), new BigDecimal("2500")));
		
		assertEquals(new BigDecimal("250.00"), calcularBonus);
	}
	/*
	 * Teste do caso em que 10% do salário é exatamente 1000,
	 * devendo retornar o valor de 1000 para o bônus.
	 */
	@Test
	void calcularBonusDeveRetornarExatamente10PorcentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal calcularBonus = service.calcularBonus(new Funcionario("Fernando", LocalDate.now(), new BigDecimal("10000")));
		
		assertEquals(new BigDecimal("1000.00"), calcularBonus);
	}
}
