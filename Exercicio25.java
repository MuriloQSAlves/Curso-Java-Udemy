/*
Leia um valor em acres e apresente-o convertido em metros quadrados. A f�rmula �: M = A * 4046.86
*/
package Modulo1;
import java.util.*;
public class Exercicio25 {
	public static void main(String[]args)
	{
		System.out.println("Informe a �rea em acres: ");
		Scanner leitor = new Scanner(System.in);
		double area = leitor.nextDouble();
		System.out.println("A �rea convertida em metros quadrados � de: " + (area * 4046.86));
		leitor.close();
	}

}
