/*

Faça um programa que leia o valor da hora trabalhada e  o número de horas trabalhadas no mês. Imprima o valor a ser pago ao funcionário, adcionando 10% sobre o valor calculado.
*/
package Modulo1;
import java.util.*;
public class Exercicio41 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o valor da hora trabalhada: ");
		double hTra = leitor.nextDouble();
		System.out.println("Informe o número de horas trabalhadas: ");
		double nTra = leitor.nextDouble();
		double sTot = hTra * nTra;
		System.out.println("O Funcionário receberá ao fim do mês acrescido de 10%: " + (sTot + (sTot * 10 / 100)));
		leitor.close();
	}

}
