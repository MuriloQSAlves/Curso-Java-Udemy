/*
Leia um valor em Reais e a cotação do Dolar e imprima o valor correspondente em Dolar.
*/
package Modulo1;
import java.util.*;
public class Exercicio30 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um valor em Reais: ");
		double moeda = leitor.nextDouble();
		System.out.println("O valor convertido em Dolar é de: " + (moeda * 0.20));
		leitor.close();
	}
}
