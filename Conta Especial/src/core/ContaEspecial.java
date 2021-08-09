package core;

public class ContaEspecial extends Conta {
	private double limite;
	
	public ContaEspecial(String nomeTitular, String cpf, int numero, float saldo, float limite) {
		super(nomeTitular, cpf, numero, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	//Super é para fazer referencia ao valor do pai. This fazer referente ao valor da classe atual
	public boolean debitar(float valor) {
		if (super.saldo + this.limite >= valor) {
			super.saldo = super.saldo - valor;
			return true;
		}
		return false;
	}
	
	public String exibirInfo() {
		String resposta = "Titular: "+super.nomeTitular+ "\n"+
						  "CPF: "+super.cpf+ "\n"+
						  "Conta Corrente: "+super.numeroConta+ "\n"+
						  "Saldo: R$ "+String.format("%.2f", super.saldo)+ "\n"+
						  "Limite: R$ "+String.format("%.2f", this.limite);
		return resposta;
	}
	

}
