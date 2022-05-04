import java.util.Scanner;

public class Programa3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		

		Animal animal1;
		animal1 = new Animal();
		
		System.out.println("Qual o nome do seu pet?: ");
		animal1.nome = leia.nextLine();
		System.out.println("Quantas patas ele tem ?: ");
		animal1.patas = leia.nextInt();
		System.out.println("Qual a espécie do seu pet ?: ");
		animal1.especie = leia.next();
		
		System.out.println(animal1.nome + " tem " + animal1.patas + " patas " + " e é da espécie "+ animal1.especie);
		
		leia.close();
	}

}
