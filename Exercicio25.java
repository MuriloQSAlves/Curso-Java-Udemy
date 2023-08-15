/*
Leia um valor em acres e apresente-o convertido em metros quadrados. A fórmula é: M = A * 4046.86
*/
package Modulo1;
import java.util.*;
public class Exercicio25 {
	public static void main(String[]args)
	{
		System.out.println("Informe a área em acres: ");
		Scanner leitor = new Scanner(System.in);
		double area = leitor.nextDouble();
		System.out.println("A área convertida em metros quadrados é de: " + (area * 4046.86));
		leitor.close();
	}

}
