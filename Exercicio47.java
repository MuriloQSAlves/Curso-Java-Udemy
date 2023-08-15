/*
Leia um número inteiro de 4 dígitos (1000 a 9999) e imprima 1 dígito por linha
*/
package Modulo1;
import java.util.*;
public class Exercicio47 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um número de 4 dígitos (1000 a 9999");
		int num = leitor.nextInt();
		int m = num / 1000;
		System.out.println(m);
		int c = num / 100 - 10 * m;
		System.out.println(c);
		int d = num / 10 - 100 * m - 10 * c;
		System.out.println(d);
		int u = num / 1 - 1000 * m - 100 * c - 10 * d;
		System.out.println(u);		
		leitor.close();
	}

}
