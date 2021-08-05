
public class Loja {
	public static void main(String[] args) {
		// Carro é meu novo tipo de dado
		// c1 e c2 são variáveis deste novo tipo - chamamos de Objetos
		
		Carro c1;
		Carro c2;
		
		//Reserva de memoria para os objetos/classes. É preciso quando não usamos variáveis comuns
		c1 = new Carro();
		c2 = new Carro();
		
		// vamos atribuir valores (forçando mesmo)
		c1.marca = "Pórxy";
		c1.modelo = "Kaineni";
		c1.ano = 2021;
		c1.cor = "Preto";
		c1.preco = 780000;
		
		c2.marca = "Xevrolé";
		c2.modelo = "Corça";
		c2.ano = 1997;
		c2.cor = "Prata meio gasto";
		c2.preco = 7500;
		
		// Exibir atraves de criação de subrotinas
		c1.exibirInfo();
		c2.exibirInfo();
		
		// Aplicar desconto
		c1.aplicarDesconto(10.0);
		c2.aplicarDesconto(5.0);
		
		// Exibir após desconto
		System.out.println("----- Aplicando Desconto -----");
		c1.exibirInfo();
		c2.exibirInfo();
		
		//Calcular ipva
		double ipvaC1 = c1.calcularIpva();
		double ipvaC2 = c2.calcularIpva();
		System.out.println("----- IPVA -----");
		System.out.println("Valor do IVPA " +c1.modelo+ " : " +ipvaC1);
		System.out.println("Valor do IVPA " +c2.modelo+ " : " +ipvaC2);
	}

}
