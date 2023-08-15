/*
Leia um valor em radiano e apresente-o convertido em graus. A fórmula é: G = R * 180 / π
*/
package Modulo1;
import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um angulo em raidiano: ");
		double ang = leitor.nextDouble();
		System.out.println("O angulo convertido em graus é de: " + (ang * 180 / 3.14));
		leitor.close();
	}

}
