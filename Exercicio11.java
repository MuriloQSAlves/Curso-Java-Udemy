//Leia uma velocidade em m/s e apresente-a convertida em km/h. a f�rmula de convers�o �: K=M*3.6
package Modulo1;
import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a velocidade em m/s: ");
		double vel = leitor.nextDouble();
		System.out.println("A velocidade convertida em Km/h � de: " + (vel * 3.6));
		leitor.close();
	}

}
