
public class Funcionario {
	private int numeroFuncional;
	private String nome;
	private String email;
	private double salario;
	
	
	
	public int getNumeroFuncional() {
		return numeroFuncional;
	}



	public void setNumeroFuncional(int numeroFuncional) {
		this.numeroFuncional = numeroFuncional;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public double getSalario() {
		return salario;
	}

	
	public void setSalario(double salario) {
		this.salario = salario;
	}



	public void reajustarSalario(double percentual) {
		salario = salario + salario*percentual/100;
	}
	
	public String exibirInfo() {
		return "Nome: "+nome+ "\n"+
				"Funcional: "+numeroFuncional+ "\n"+
				"E-mail: "+email+ "\n" +
				"Salario: R$ "+salario;		
	}
	
	public double calcularImposto() {
		if (salario <= 2000) {
			return 0;
		}
		else if (salario > 2000 && salario <= 3000) {
			return salario*0.15;
		}
		else if (salario > 3000 && salario <= 4500) {
			return salario*0.25;
		}
		else {
			return 2250;
		}
	}


}
