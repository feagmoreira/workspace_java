package core;

public class Horista extends Funcionario {
	private double valorHora;
	private int numeroHoras;
	
	public Horista(int numRegistro, String nome, double valorHora, int numeroHoras) {
		super(numRegistro, nome);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}
	
	public double calcularSalario() {
		return valorHora * numeroHoras;
	}


	public double getValorHora() {
		return valorHora;
	}


	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}


	public int getNumeroHoras() {
		return numeroHoras;
	}


	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}
	
	
	

}
