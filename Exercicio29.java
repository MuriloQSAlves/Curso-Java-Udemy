/*
Leia 4 notas, calcule a média aritimética e imprima o resultado
*/
package Modulo1;
import java.util.*;
public class Exercicio29 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a primeira nota: ");
		double nota1 = leitor.nextDouble();
		System.out.println("Informe a segunda nota: ");
		double nota2 = leitor.nextDouble();
		System.out.println("Informe a terceira nota: ");
		double nota3 = leitor.nextDouble();
		System.out.println("Informe a quarta nota: ");
		double nota4 = leitor.nextDouble();
		System.out.println("A média aritimética das notas é: " + ((nota1 + nota2 + nota3 + nota4) / 4));
		leitor.close();
	}

}
