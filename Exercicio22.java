/*
Leia um valor em jardas e apresente-o convertido em metros. A f�rmula de convers�o �: M = 0.9144 * J
*/
package Modulo1;
import java.util.*;
public class Exercicio22 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite uma distancia em jardas: ");
		double dist = leitor.nextDouble();
		System.out.println("A distancia convertida em metros � de: " + (0.9144 * dist));
		leitor.close();
	}

}
