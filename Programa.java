import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		final var ponto = new Locale("en", "us");
		
		Pessoa pessoa1, pessoa2;
		pessoa2 = new Pessoa();
		pessoa1 = new Pessoa();
		
		System.out.println("Qual o nome da pessoa ?: ");
		pessoa1.nome = leia.nextLine();
		System.out.printf("Quanto a você pesa ?: ");
		pessoa1.peso = leia.nextDouble();
		System.out.printf("Qual a sua altura ?: ");
		pessoa1.altura = leia.nextDouble();
		System.out.println("Qual a sua idade ?: ");
		pessoa1.idade = leia.nextDouble();
		
		System.out.println(pessoa1.nome + " " + pessoa1.peso + " " + pessoa1.altura + " " + pessoa1.idade);
		 
		
		leia.nextLine();
		System.out.println("Qual o nome da pessoa ?: ");
		pessoa2.nome = leia.nextLine();
		System.out.printf("Quanto a você pesa ?: ");
		pessoa2.peso = leia.nextDouble();
		System.out.printf("Qual a sua altura ?: ");
		pessoa2.altura = leia.nextDouble();
		System.out.print("Qual a sua idade ?: ");
		pessoa2.idade = leia.nextDouble();
		
		System.out.println(pessoa2.nome + " " + pessoa2.peso + " " + pessoa2.altura + " " + pessoa2.idade);
		
		if ((pessoa1.peso) > (pessoa2.peso)) {
		System.out.println("O mais pesado de vocês é " + pessoa1.nome+ pessoa1.peso);
		leia.close();
		}
	
		else if ((pessoa1.peso) < (pessoa2.peso)) {
			System.out.println("O mais pesado de vocês é "+pessoa2.nome+ pessoa2.peso);
		
		}
	}

}
