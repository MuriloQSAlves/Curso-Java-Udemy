/*
Leia um valor em hectares e apresente-o convertido em metros quadrados. A f�rmula de copnvers�o �: M = H * 10000
*/
package Modulo1;
import java.util.*;
public class Exercicio27 {
	public static void main(String[]args)
	{
		System.out.println("Informe um valor em hectares: ");
		Scanner leitor = new Scanner(System.in);
		double area = leitor.nextDouble();
		System.out.println("A �rea convertida em metros quadrados � de: " + (area * 1000));
		leitor.close();
	}

}
