/*
Leia um valor de �rea em metros quadrados e apresente-o convertido em acres. A f�rmula de convers�o �:  A = M * 4046.86;
*/
package Modulo1;
import java.util.*;
public class Exercicio24 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite uma �rea em metro quadrados: ");
		double area = leitor.nextDouble();
		System.out.println("A �rea convertida em acres � de: " + (area / 4046.86));
		leitor.close();
	}

}
