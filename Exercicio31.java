/*
Leia um n�mero inteiro e imprima seu antecessor e seu sucessor
*/
package Modulo1;
import java.util.Scanner;
public class Exercicio31 {
	public static void main(String[]args)
	{
		System.out.println("Informe um n�mero: ");
		Scanner leitor = new Scanner(System.in);
		int num = leitor.nextInt();
		System.out.println("O antecessor de " + num + " �: " + (num - 1) + " e seu sucessor �: " + (num + 1));
		leitor.close();
	}

}
