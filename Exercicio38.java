/*
Leia o salário de um funcionário. Calcule e imprima o novo valor do salário, sabendo que ele recebeu um aumentode 25%
*/
package Modulo1;
import java.util.*;
public class Exercicio38 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o valor do salário: ");
		double sal = leitor.nextDouble();
		System.out.println("O salário acrescido de 25% é de: " + (sal + (sal * 25 / 100)));
		leitor.close();
	}

}
