//Leia um n�mero real e imprima o quadrado desse n�mero
package Modulo1;
import java.util.Scanner;
public class Exercicio04 {
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um n�mero real:");
		double real = leitor.nextDouble();
		System.out.println("O quadrado do valor digitado �: " + (real * real));
		leitor.close();
	}

}
