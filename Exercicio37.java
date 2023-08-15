/*
Faça um programa que leia o valor de um produto e imprima o valor com desconto, tendo me vista que o valor do desconto foi de 12%
*/
package Modulo1;
import java.util.*;
public class Exercicio37 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o valor do produto: ");
		double val = leitor.nextDouble();
		System.out.println("O valor do produto com desconto de 12% é de: " + (val - (val * 12 / 100)));
		leitor.close();		
	}

}
