
public class Posto {
	public static void main(String[] args) {
		BombaDeCombustivel b1;
		BombaDeCombustivel b2;
		BombaDeCombustivel b3;
		
		//Inicializando Bombas
		b1 = new BombaDeCombustivel("Gasolina", 5.00);
		b2 = new BombaDeCombustivel("Etanol", 4.50);
		b3 = new BombaDeCombustivel("Diesel", 4.25);
		
		//Abastecimentos Gasolina
		b1.abastecerPorLitros(100.00);
		System.out.println(b1.exibirRecibo());
		b1.abastecerPorValor(100.00);
		System.out.println(b1.exibirRecibo());
		
		//Abastecimentos Etanol
		b2.abastecerPorLitros(100.00);
		System.out.println(b2.exibirRecibo());
		b2.abastecerPorValor(100.00);
		System.out.println(b2.exibirRecibo());
		
		//Abastecimentos Diesel
		b3.abastecerPorLitros(100.00);
		System.out.println(b3.exibirRecibo());
		b3.abastecerPorValor(100.00);
		System.out.println(b3.exibirRecibo());
		
	}

}
