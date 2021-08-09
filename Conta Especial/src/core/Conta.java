package core;

public class Conta {
	protected String nomeTitular;
	protected String cpf;
	protected int numeroConta;
	protected float saldo;
	
	public Conta(String nomeTitular, String cpf, int numeroConta, float saldo) {
		super();
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public String exibirInfo() {
		String resposta = "Titular: "+nomeTitular+ "\n"+
						  "CPF: "+cpf+ "\n"+
						  "Conta Corrente: "+numeroConta+ "\n"+
						  "Saldo: R$ "+String.format("%.2f", saldo)+ "\n";
		return resposta;
	}
	
	public boolean debitar(float valor) {
		if (valor <= saldo) {
			saldo = saldo - valor;
			return true;
		}
		return false;
	}
	
	public void creditar(float valor) {
		saldo = saldo + valor;
	}

}
