package ui;

import core.Conta;
import core.ContaEspecial;

public class Banco {
	public static void main(String[] args) {
		//Inicializar Contas
		
		Conta c1,c2;
		
		c1 = new Conta("Prof Isidro", "123.456.798-0", 123456, 1000);
		
		//Exibir
		System.out.println(c1.exibirInfo());
		
		//Fazer um Debito
		if (c1.debitar(1000)){
			System.out.println("Operação Autorizada!\n");
			System.out.println("Novo Saldo: R$"+String.format("%.2f", c1.getSaldo())+ "\n");
		}
		else {
			System.out.println("Saldo Insuficiente!\n");
		}
		//Fazer um Credito
		c1.creditar(2000);
		System.out.println("Operação Autorizada!\n");
		System.out.println("Novo Saldo: R$"+String.format("%.2f", c1.getSaldo())+ "\n");
		
		//Operações com Conta Especial
		c2 = new ContaEspecial("Felipe", "789.456.798-0", 95765, 1000, 3000);
		
		//Exibir
		System.out.println(c2.exibirInfo());
				
		//Fazer um Debito
		if (c2.debitar(2000)){
			System.out.println("Operação Autorizada!\n");
			System.out.println("Novo Saldo: R$"+String.format("%.2f", c2.getSaldo())+ "\n");
		}
		else {
			System.out.println("Saldo Insuficiente!\n");
		}
		//Fazer um Credito
		c2.creditar(2000);
		System.out.println("Operação Autorizada!\n");
		System.out.println("Novo Saldo: R$"+String.format("%.2f", c2.getSaldo())+ "\n");
		
	}

}
