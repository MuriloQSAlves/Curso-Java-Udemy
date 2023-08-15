//Leia uma distancia em quilometros e apresente-a convertida em milhas. A fórmula de conversão é: K = M / 1.609
package Modulo1;
import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a distancia em quilometros: ");
		double dist = leitor.nextDouble();
		System.out.println("A distancia convertida em milhas é de: " + (dist / 1.609));
		leitor.close();
	}

}
