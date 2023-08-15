/*
Implemente um programa que calcule o ano de nascimento de uma pessoa a partir de sua idade e do ano atual
*/ 
package Modulo1;
import java.util.Scanner;
public class Exercicio50 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe sua idade: ");
		int idade = leitor.nextInt();
		System.out.println("Informe o ano atual: ");
		int anoAtual = leitor.nextInt();
		int anoNasc = anoAtual - idade;
		System.out.println("O ano de nascimento é: " + anoNasc);
		leitor.close();
	}

}
