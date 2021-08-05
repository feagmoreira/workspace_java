
public class Empregado {
	String nome;
	String cargo;
	double salario;
	
	void imprimir() {
		System.out.println("Nome : " + nome);
		System.out.println("Cargo : " + cargo);
		System.out.println("Salário : R$ " + salario + "\n");
	}
	void aumentarSalario(double percentual) {
		salario = salario + salario*percentual/100;
	}

}
