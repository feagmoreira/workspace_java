package userinterface;

import core.Chefe;
import core.Comissionado;
import core.Empreiteiro;
import core.Funcionario;
import core.Horista;

public class FolhaPagamento {
	public static void main(String[] args) {
		Funcionario f1, f2, f3, f4;
		
		f1 = new Chefe(223344, "Chefe", 5000, 85, 400);
		f2 = new Comissionado(112233, "Comissionado", 2000, 200);
		f3 = new Empreiteiro(445566, "Empreiteiro", 2000);
		f4 = new Horista(667788, "Horista", 15, 160);
		
		//Exibir Relatorio de Funcionarios
		System.out.println("** Folha de Pagamento ACME **");
		System.out.println("Nome: "+f1.getNome()+" Registro: "+f1.getNumRegistro()+" Salario: R$ "+String.format("%.2f", f1.calcularSalario())+ "\n");
		System.out.println("Nome: "+f2.getNome()+" Registro: "+f2.getNumRegistro()+" Salario: R$ "+String.format("%.2f", f2.calcularSalario())+ "\n");
		System.out.println("Nome: "+f3.getNome()+" Registro: "+f3.getNumRegistro()+" Salario: R$ "+String.format("%.2f", f3.calcularSalario())+ "\n");
		System.out.println("Nome: "+f4.getNome()+" Registro: "+f4.getNumRegistro()+" Salario: R$ "+String.format("%.2f", f4.calcularSalario())+ "\n");
	
	}

}
