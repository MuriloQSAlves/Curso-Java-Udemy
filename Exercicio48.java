/*
Leia um valor em segundos e o imprima em horas, minutos e segundos
*/
package Modulo1;
import java.util.Scanner;
public class Exercicio48 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um valor em segundos: ");
		int seg = leitor.nextInt();
	    int hor = seg / 3600;
	    int resto = seg % 3600;
	    int min = resto / 60;
	    seg = resto % 60;
	    System.out.println("O tempo é de: " + hor + ":" + min + ":" + seg );
	    leitor.close();
	}
}
