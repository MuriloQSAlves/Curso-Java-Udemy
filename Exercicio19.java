/*
Leia um valor em litros e apresente-o convertido em metros cúbicos. A fórmula é: M = 1000 / L
*/
package Modulo1;
import java.util.*;
public class Exercicio19 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o valor em litros: ");
		double vol = leitor.nextDouble();
		System.out.println("O valor convertido em metros cúbicos é de: " + (vol / 1000));
		leitor.close();
	}

}
