/*
Leia um valor em quilograma e apresente-o convertido em libras. A fórmula de conversão é: L = K / 0.454
*/
package Modulo1;
import java.util.*;
public class Exercicio20 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o valor em quilogramas: ");
		double peso = leitor.nextDouble();
		System.out.println("O valor convertido em libras é de: " + (peso / 0.454));
		leitor.close();
	}

}
