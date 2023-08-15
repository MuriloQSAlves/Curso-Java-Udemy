//Leia um número real e imprima a quinta parte
package Modulo1;
import java.util.Scanner;
public class Exercicio05 {
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um número real: ");
		float real = leitor.nextFloat();		
		System.out.println("A quinta parte do valor digitado é: " + (real / 5));
		leitor.close();
	}

}
