/*
Leia o tamanho de um lado de um quadrado e imprima como resultado sua área
*/
package Modulo1;
import java.util.*;
public class Exercicio33 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o tamanho de um lado do quadrado: ");
		double quad = leitor.nextDouble();
		System.out.println("A área do quadrado é de: " + (quad * quad));
		leitor.close();
	}

}
