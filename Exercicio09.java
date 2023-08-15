//Leia a temperatura em graus Célcius e apresente-a convertida em graus Kelvin. A fórmula de conversão é: K = C + 273.15
package Modulo1;
import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a temperatura em Célcius: ");
		double temp = leitor.nextDouble();
		System.out.println("A temperatura convertida em Kelvin é de: " + (temp + 273.15));
		leitor.close();
	}

}
