//Leia a temperatura em graus C�lcius e apresente-a convertida em graus Kelvin. A f�rmula de convers�o �: K = C + 273.15
package Modulo1;
import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a temperatura em C�lcius: ");
		double temp = leitor.nextDouble();
		System.out.println("A temperatura convertida em Kelvin � de: " + (temp + 273.15));
		leitor.close();
	}

}
