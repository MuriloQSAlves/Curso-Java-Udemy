//Leia uma distancia em milhas e apresente-a convertida em quilometros. A fórmula de conversão é: K = 1.609 * M
package Modulo1;
import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a distancia em milhas: ");
		double dist = leitor.nextDouble();
		System.out.println("A distancia convertida em quilometros é de: " + (1.609 * dist));
		leitor.close();
	}

}
