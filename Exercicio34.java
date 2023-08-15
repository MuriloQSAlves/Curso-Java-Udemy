/*
Leia o valor do raio de um círculo e imprima a área do círculo. A área do cículo é π * raio², considere o valor de π = 3.141592
*/
package Modulo1;
import java.util.*;
public class Exercicio34 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o valor do raio: ");
		double area = leitor.nextDouble();
		System.out.println("A área do círculo é de: " + (3.141592 * (area * area)));
		leitor.close();
	}

}
