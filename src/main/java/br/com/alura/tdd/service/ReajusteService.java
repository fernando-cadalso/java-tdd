package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concedeReajuste(Funcionario funcionario, Desempenho tipoDesempenho) {
		/*
		 * Aplica uma lógica do caso de uso para identificar
		 * o percentual de reajuste de acordo com o tipo do desempenho.
		 */
		BigDecimal percentualReajuste = tipoDesempenho.percentualDesempenho();
		/*
		 * Consulta o valor do reajuste.
		 */
		BigDecimal valorReajuste = funcionario.getSalario().multiply(percentualReajuste);
		/*
		 * Chama o método da entidade funcionário responsável
		 * por aplicar o reajuste.
		 */
		funcionario.reajusteSalarial(valorReajuste);
	}
}
