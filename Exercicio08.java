//Leia uma temperatura em graus kelvin e apresente-a convertida em graus Célcius. A fórmula de conversão é: C=K - 273.15
package Modulo1;
import java.util.Scanner;
public class Exercicio08 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a temperatura em Kelvin: ");
		double temp = leitor.nextDouble();
		System.out.println("A temperatura convertida em Célsius é de: " + (temp - 273.15));
		leitor.close();
	}

}
