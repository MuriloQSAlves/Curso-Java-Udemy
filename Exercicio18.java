/*
Leia um valor em metros c�bicos e apresente-o convertido em litros. A f�rmula �: L = M * 1000
*/
package Modulo1;
import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um valor em metros cubicos: ");
		double vol = leitor.nextDouble();
		System.out.println("O volume convertido em liros � de: " + (vol * 1000));
		leitor.close();
	}

}
