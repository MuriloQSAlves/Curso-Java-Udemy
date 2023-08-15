/*
Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Célcius. A fórmula é: c=5.0*(f-32.0)/9.0
*/
package Modulo1;
import java.util.*;

public class Exercicio07 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a temperatura em Fahrenheit: ");
		double temp = leitor.nextDouble();
		System.out.println("A temperatura convertida em Célsius é de: " + (5.0 * (temp - 32.0)/9.0));
		leitor.close();
	}

}
