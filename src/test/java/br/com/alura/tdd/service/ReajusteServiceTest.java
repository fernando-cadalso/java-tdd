package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;
import junit.framework.Assert;

/*
 * Representa um serviço da regra de negócio
 */
public class ReajusteServiceTest {

	private ReajusteService service;
	private Funcionario funcionario;
	/**
	 * Método criado para instanciar os objetos que se 
	 * repetem em cada caso de teste.
	 */
	@BeforeEach
	private void iniciarTeste() {
		/*
		 * Instancio uma classe que representa o caso de uso
		 * ou um conjunto de casos de usos semelhantes.
		 */
		service = new ReajusteService();
		/*
		 * Esse caso é aplicado sobre o salário de um funcionário,
		 * então preciso de uma instância de funcionário.
		 */
		funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));
	}
	/*
	 * Pego um caso de uso do cenário descrito pelo
	 * usuário ou cliente.
	 */
	@Test
	public void reajusteParaDesempenhoADesejarTresPorCento() {
		/*
		 * Realiza o caso de uso chamando o método que o implementa.
		 */
		service.concedeReajuste(funcionario,Desempenho.A_DESEJAR);
		/*
		 * Aqui realizo o teste de fato, como já visto usando o JUnit.
		 * O teste verifica se dois valores são iguais, comparando o valor esperado
		 * com o valor produzido pelo método concedeReajuste().
		 */
		Assert.assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}

	/*
	 * Pego um caso de uso do cenário descrito pelo
	 * usuário ou cliente.
	 */
	@Test
	public void reajusteParaDesempenhoBomQuinzePorCento() {
		/*
		 * Realiza o caso de uso chamando o método que o implementa.
		 */
		service.concedeReajuste(funcionario,Desempenho.BOM);
		/*
		 * Aqui realizo o teste de fato, como já visto usando o JUnit.
		 * O teste verifica se dois valores são iguais, comparando o valor esperado
		 * com o valor produzido pelo método concedeReajuste().
		 */
		Assert.assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}
	/*
	 * Pego um caso de uso do cenário descrito pelo
	 * usuário ou cliente.
	 */
	@Test
	public void reajusteParaDesempenhoOtimoVintePorCento() {
		/*
		 * Realiza o caso de uso chamando o método que o implementa.
		 */
		service.concedeReajuste(funcionario,Desempenho.OTIMO);
		/*
		 * Aqui realizo o teste de fato, como já visto usando o JUnit.
		 * O teste verifica se dois valores são iguais, comparando o valor esperado
		 * com o valor produzido pelo método concedeReajuste().
		 */
		Assert.assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}
}
