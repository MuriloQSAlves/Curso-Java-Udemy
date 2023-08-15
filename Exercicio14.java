/*
Leia um ângulo em graus e apresente-o convertido em radiano. A fórmula de conversão é: R = G * π / 180.
*/
package Modulo1;
import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o ângulo em graus: ");
		double ang = leitor.nextDouble();
		System.out.println("O ângulo convertido em radiano é de: " + (ang * 3.14 / 180));
		leitor.close();
	}

}
