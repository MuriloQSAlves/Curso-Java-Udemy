/*
Leia a altura e o raio de um cilindro circular e imprimaq o volume do cilindro. A fórmula é: V = π * raio² * altura. O valor de pi = 3.141592.
*/
package Modulo1;
import java.util.*;
public class Exercicio36 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a altura do cilindro: ");
		double alt = leitor.nextDouble();
		System.out.println("Informe o raio do cilindro: ");
		double raio = leitor.nextDouble();
		System.out.println("O volume do cilindro é de: " + (3.141592 * (raio * raio) * alt));
		leitor.close();
	}

}
