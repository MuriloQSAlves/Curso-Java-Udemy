/*
Leia um valor em libras e apresente-o convertido em quilograma. A f�rmula de convers�o �: K = L * 0.45
*/
package Modulo1;
import java.util.*;
public class Exercicio21 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um peso em libras: ");
		double peso = leitor.nextDouble();
		System.out.println("O peso convertido em quilogramas � de: " + (peso * 0.45));
		leitor.close();
	}

}
