/*
Leia um valor em metros e apresente-o convertido em jardas. A fórmula de conversão é: J = M / 0.9144
*/
package Modulo1;
import java.util.*;
public class Exercicio23 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digitem um valor em metros: ");
		double dist = leitor.nextDouble();
		System.out.println("A distancia convertida em jardas é de: " + (dist / 0.9144));
		leitor.close();
	}

}
