//Leia um número real e imprima o quadrado desse número
package Modulo1;
import java.util.Scanner;
public class Exercicio04 {
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número real:");
		double real = leitor.nextDouble();
		System.out.println("O quadrado do valor digitado é: " + (real * real));
		leitor.close();
	}

}
