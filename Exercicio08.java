//Leia uma temperatura em graus kelvin e apresente-a convertida em graus C�lcius. A f�rmula de convers�o �: C=K - 273.15
package Modulo1;
import java.util.Scanner;
public class Exercicio08 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a temperatura em Kelvin: ");
		double temp = leitor.nextDouble();
		System.out.println("A temperatura convertida em C�lsius � de: " + (temp - 273.15));
		leitor.close();
	}

}
