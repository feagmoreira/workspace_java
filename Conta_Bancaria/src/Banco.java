
public class Banco {
	public static void main(String[] args) {
		ContaCorrente c1;
		
		c1 = new ContaCorrente();
		
		// Input de valores
		c1.numero = 11111;
		c1.digito = 2;
		c1.nome = "Joaquim Lopes";
		c1.cpf = "333.333.333-33";
		c1.saldo = 5000.00;
		
		//Exibir dados
		c1.exibirInfo();
		
		//Fazer deposito de 100 reais
		c1.depositar(100);
		
		//Sacar 200 reais
		c1.sacar(200);
		
		//Exibir dados finais
		c1.exibirInfo();
	}

}
