
public class EmpregadoTeste {
	public static void main(String[] args) {

		// Definir variveis
		Empregado e1;
		Empregado e2;

		e1 = new Empregado();
		e2 = new Empregado();

		e1.nome = "Maria";
		e1.cargo = "Auxiliar";
		e1.salario = 1000;

		e2.nome = "Joao";
		e2.cargo = "Cozinheiro";
		e2.salario = 1500;

		// Imprirmir dados
		e1.imprimir();
		e2.imprimir();

		// Aumentos
		e1.aumentarSalario(10.0);
		e2.aumentarSalario(15.0);

		// Imprimir
		System.out.println("---- Após Aumentos ----");
		e1.imprimir();
		e2.imprimir();
	}

}
