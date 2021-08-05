
public class Carro {
	String marca;
	String modelo;
	int 	ano;
	String cor;
	double preco;
	
	void exibirInfo() {
		System.out.println("Automóvel: " + marca + " " +modelo);
		System.out.println("	Ano: " + ano);
		System.out.println("	Cor: " + cor);
		System.out.println("	Preço: R$ " + preco +"\n");
	}
	
	void aplicarDesconto(double percentual) {
		preco = preco - preco * percentual/100;
	}
	//subrotina que retorna valor do IPVA como valor
	double calcularIpva() {
		double valoripva;
		if (ano < 2000) {
			valoripva = 0.0;
		}
		else {
			valoripva = preco * 0.02;
		}
		return valoripva;
	}
}
