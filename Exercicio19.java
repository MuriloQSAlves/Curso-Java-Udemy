/*
Leia um valor em litros e apresente-o convertido em metros c�bicos. A f�rmula �: M = 1000 / L
*/
package Modulo1;
import java.util.*;
public class Exercicio19 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o valor em litros: ");
		double vol = leitor.nextDouble();
		System.out.println("O valor convertido em metros c�bicos � de: " + (vol / 1000));
		leitor.close();
	}

}
