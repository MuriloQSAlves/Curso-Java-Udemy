/*
Leia um valor em metros quadrados e apresente-o convertido em hectares. A fórmula de copnversão é: H = M * 0.0001
*/
package Modulo1;
import java.util.Scanner;
public class Exercicio26 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a área em metros quadrados: ");
		double area = leitor.nextDouble();
		System.out.println("A área convertia em hectares é de: " + (area / 1000));
		leitor.close();
	}

}
