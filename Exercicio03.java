//Peça ao usuário para digitar 3 valores inteiros e os imprima
package Modulo1;
import java.util.Scanner;
public class Exercicio03 {
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o primeiro valor:");
		int val1 = leitor.nextInt();
		System.out.println("Digite o segundo valor:");
		int val2 = leitor.nextInt();
		System.out.println("Digite o segundo valor:");
		int val3 = leitor.nextInt();		
		System.out.println("Os valores digitados são: " + val1 + " " + val2 + " " + val3);
		leitor.close();
		
	}
}
