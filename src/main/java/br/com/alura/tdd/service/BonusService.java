package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.tdd.modelo.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			/*
			 * Lança uma exceção de argumento ilegal, caso um funcionário com salário maior
			 * que R$ 10.000,00 seja selecionado, ou seja é uma exceção da regra do negócio
			 * ou caso de uso.
			 */
			throw new IllegalArgumentException("Funcionário com salário fora da faixa de bônus.");
		}
		return valor.setScale(2, RoundingMode.HALF_UP);
	}
}
