/*
Receba o sal�rio base de um funcion�rio. Calcule e imprima o sal�rio a receber, sabendo-se que esse funcion�rio tem uma gratifica��o de 5% sobre o sal�rio base. Al�m disso ele paga 7% de imposto sobre o sal�rio base.
*/
package Modulo1;
import java.util.*;
public class Exercicio42 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o salario do funcion�rio> ");
		double sal = leitor.nextDouble();
		System.out.println("O funcion�rio receber� acrescido de 5% de gratifica��o e 7% de imposto o  valor de: " + (sal + (sal * 5 / 100) - (sal * 7 / 100)));
		leitor.close();
	}

}
