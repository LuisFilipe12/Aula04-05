import java.util.Scanner;

public class Programa2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
        Produto produto1;
		produto1 = new Produto();

		System.out.println("Entre com o nome do produto: ");
		produto1.nome = leia.nextLine();
		System.out.println("Entre com o preço de custo: ");
		produto1.precoc = leia.nextDouble();
		System.out.println("Entre com o valor do produto: ");
		produto1.precov = leia.nextDouble();
		
		System.out.println(produto1.nome + " custa " + produto1.precoc + " preço " + produto1.precov);
		
		
		
		leia.close();
	}

}
