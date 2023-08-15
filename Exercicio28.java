/*
Faça a leitura de três valores e apresente a soma dos quadrados dos  três valores lidos
*/
package Modulo1;
import java.util.*;
public class Exercicio28 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o primeiro valor: ");
		double val1 = leitor.nextDouble();
		System.out.println("Informe o segundo valor: ");
		double val2 = leitor.nextDouble();
		System.out.println("Informe o terceiro valor: ");
		double val3 = leitor.nextDouble();
		System.out.println("A soma dos quadrados dos três valores é de: " + ((val1 * val1)+(val2 * val2)+(val3 * val3)));
		leitor.close();
	}
}
