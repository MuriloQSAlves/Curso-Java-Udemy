/*

Fa�a um programa que leia o valor da hora trabalhada e  o n�mero de horas trabalhadas no m�s. Imprima o valor a ser pago ao funcion�rio, adcionando 10% sobre o valor calculado.
*/
package Modulo1;
import java.util.*;
public class Exercicio41 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o valor da hora trabalhada: ");
		double hTra = leitor.nextDouble();
		System.out.println("Informe o n�mero de horas trabalhadas: ");
		double nTra = leitor.nextDouble();
		double sTot = hTra * nTra;
		System.out.println("O Funcion�rio receber� ao fim do m�s acrescido de 10%: " + (sTot + (sTot * 10 / 100)));
		leitor.close();
	}

}
