/*
Seja a e b os catetos de um triangulo, onde a hipotenusa é obtida pela equação: hipotenusa = √a² + b². Faça um programa que receba os valores de a e b e calcule o valor da hipotenusa através da equação. Imprima o resultado dessa equação.
*/
package Modulo1;
import java.util.*;
public class Exercicio35 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o valor do cateto a: ");
		double catA = leitor.nextDouble();
		System.out.println("Informe o valor do cateto b: ");
		double catB = leitor.nextDouble();
		double hipo = Math.sqrt(((catA * catA) + (catB * catB)));
		System.out.println("O valor da hipotenusa é de: " + hipo);
		leitor.close();
	}

}
