/*
Leia um valor de área em metros quadrados e apresente-o convertido em acres. A fórmula de conversão é:  A = M * 4046.86;
*/
package Modulo1;
import java.util.*;
public class Exercicio24 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite uma área em metro quadrados: ");
		double area = leitor.nextDouble();
		System.out.println("A área convertida em acres é de: " + (area / 4046.86));
		leitor.close();
	}

}
