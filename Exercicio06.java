/*
Leia uma temperatura em graus C�lsius e a apresente convertida em Fahrenheit. A formula da convers�o �: F=C*(9.0/5.0)+32.0
*/
package Modulo1;
import java.util.*;
public class Exercicio06 {
	public static void main (String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a temperatura em graus C�lsius:");
		double temp = leitor.nextDouble();
		System.out.println("A temperatura convertida em Fahrenheit � de: " + (temp * (9.0/5.0)+32.0));
		leitor.close();
	}

}
