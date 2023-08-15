/*
Leia um valor em centímetros e apresente-o convertido em polegadas. A fórmula é: P = C / 2.54
*/
package Modulo1;
import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o valor em centímetros: ");
		double comp = leitor.nextDouble();
		System.out.println("O valor convertido em polegadas é de: " + (comp / 2.54));
		leitor.close();
	}

}
