package exercdejaques.questao04;

import java.util.ArrayDeque;

public class ContaBancaria {
	
	private int id_conta;
	private double saldo = 0;
	private String nome;
	private String cpf;
	private ArrayDeque<Double> transacoes;
	private int posCalculo = 0;
	
	public ContaBancaria(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public void depositar(double valor) {
		transacoes.add(valor);
		saldo += valor;
	}
	
	public void sacar(double valor) throws Exception {
		if (valor > saldo) {
			throw new Exception();
		}
		transacoes.add(valor *(-1));
		saldo -= valor;
		
	}
	public int getId_conta() {
		return id_conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public String getNome() {
		return nome;
	}
	public String getCPF() {
		return cpf;
	}
	
}
