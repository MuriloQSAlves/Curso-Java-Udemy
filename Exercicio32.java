/*
Leia um n�mero inteiro e imprima a soma do sucessor de seu triplo com o antecessor de seu dobro
*/
package Modulo1;
import java.util.*;
public class Exercicio32 {
	public static void main(String[]args)
	{
		System.out.println("Informe um n�mero: ");
		Scanner leitor = new Scanner(System.in);
		double num = leitor.nextDouble();
		System.out.println("o resultado �: " + (((num * 3) + 1) + ((num * 2) - 1)));
		leitor.close();
	}

}
