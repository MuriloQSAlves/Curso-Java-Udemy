/*
Leia o sal�rio de um funcion�rio. Calcule e imprima o novo valor do sal�rio, sabendo que ele recebeu um aumentode 25%
*/
package Modulo1;
import java.util.*;
public class Exercicio38 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o valor do sal�rio: ");
		double sal = leitor.nextDouble();
		System.out.println("O sal�rio acrescido de 25% � de: " + (sal + (sal * 25 / 100)));
		leitor.close();
	}

}
