
public class ContaCorrente {
	int numero;
	int digito;
	String nome;
	String cpf;
	double saldo;

	void depositar(double valor) {
		saldo = saldo + valor;
		System.out.println("Operação efetuada com sucesso! Seu saldo atual é de: " + saldo);
	}

	void exibirInfo() {
		System.out.println("Numero da Conta: " + numero + " - " + digito);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Saldo: R$ " + saldo);
	}

	void sacar(double valor) {
		if (valor <= saldo) {
			saldo = saldo - valor;
			System.out.println("Operação efetuada com sucesso! Seu saldo atual é de: "+saldo +"\n");
		}
		else {
			System.out.println("Saldo insuficiente! Seu saldo atual é de: "+saldo+ "\n");
		}
	}
}
