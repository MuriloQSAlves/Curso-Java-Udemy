/*
Faça um programa que leia um número inteiro positivo com 3 dígitos (100 a 999). Gere outro número formado pelos dígitos invertidos do número lido
*/
package Modulo1;
import java.util.*;
public class Exercicio46 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		 int num, i=0;    
		    System.out.println("Informe um número de 100 a 999:");
		    num = leitor.nextInt();
		    while (num > 0) {
		      i *= 10;
		      i += (num % 10);
		      num /= 10; 
		    }
		    System.out.println(i);
		    leitor.close();
	}

}
