/*
Leia um valor em polegadas e apresente-o convertido em cent�metros. A f�rmula �: C = P * 2.54
*/
package Modulo1;
import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um valor em polegadas: ");
		double comp = leitor.nextDouble();
		System.out.println("O comprimento convertido em cent�metros � de: " + (comp * 2.54));
		leitor.close();
	}
}
