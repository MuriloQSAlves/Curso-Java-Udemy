//Leia uma velocidade em km/h e apresente-a convertida em m/s. a fórmula de conversão é: M=K/3.6
package Modulo1;
import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a velocidade em Km/h: ");
		double vel = leitor.nextDouble();
		System.out.println("A velocidade convertida em m/s é de: " + (vel/3.6));
		leitor.close();
		
	}

}
