/*
Fa�a um programa que leia um n�mero inteiro positivo com 3 d�gitos (100 a 999). Gere outro n�mero formado pelos d�gitos invertidos do n�mero lido
*/
package Modulo1;
import java.util.*;
public class Exercicio46 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		 int num, i=0;    
		    System.out.println("Informe um n�mero de 100 a 999:");
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
