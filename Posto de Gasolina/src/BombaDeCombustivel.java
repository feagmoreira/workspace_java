
public class BombaDeCombustivel {
	private String nome;
	private double precoLitro;
	private double qtdLitros;
	private double totalPagar;
	
	//Construtor
	public BombaDeCombustivel(String nome, double precoLitro) {
		this.nome = nome;
		this.precoLitro = precoLitro;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrecoLitro() {
		return precoLitro;
	}
	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}
	public double getQtdLitros() {
		return qtdLitros;
	}
	public void setQtdLitros(double qtdLitros) {
		this.qtdLitros = qtdLitros;
	}
	public double getTotalPagar() {
		return totalPagar;
	}
	public void setTotalPagar(double totalPagar) {
		this.totalPagar = totalPagar;
	}
	
	public void abastecerPorLitros(double totalLitros) {
		qtdLitros = totalLitros;
		totalPagar = totalLitros * precoLitro;
	}
	
	public void abastecerPorValor(double total) {
		totalPagar = total;
		qtdLitros = totalPagar/ precoLitro;
	}
	
	public String exibirRecibo() {
		return "Combustível: " +nome+ "\n"
				+ "Valor por Litro: R$ " +String.format("%.2f", precoLitro)+ "\n"
				+ "Total Litros: " +String.format("%.2f", qtdLitros)+ "\n"
				+ "Total a Pagar: R$ " +String.format("%.2f", totalPagar)+ "\n";
	}

}
