
public class Principal {
	public static void main(String[] args) {
		Funcionario f1;
		Funcionario f2;
		Funcionario f3;
		
		f1 = new Funcionario();
		f2 = new Funcionario();
		f3 = new Funcionario();
		
		f1.setNumeroFuncional(1111111);
		f1.setNome("Joao J");
		f1.setEmail("joao@joao.com.br");
		f1.setSalario(1000.00);
		
		f2.setNumeroFuncional(2222222);
		f2.setNome("Jose S");
		f2.setEmail("jose@jose.com.br");
		f2.setSalario(3000.00);
		
		f3.setNumeroFuncional(3333333);
		f3.setNome("Maria M");
		f3.setEmail("maria@maria.com.br");
		f3.setSalario(5000.00);
		
		//Efetuar aumentos Dissidio
		f1.reajustarSalario(8.0);
		f2.reajustarSalario(8.0);
		f3.reajustarSalario(8.0);
		
		//Exibir Valores
		System.out.println(f1.exibirInfo());
		System.out.println("Imposto: R$ "+ f1.calcularImposto() + "\n");
		System.out.println(f2.exibirInfo());
		System.out.println("Imposto: R$ "+ f2.calcularImposto() + "\n");
		System.out.println(f3.exibirInfo());
		System.out.println("Imposto: R$ "+ f3.calcularImposto() + "\n");
	}

}
