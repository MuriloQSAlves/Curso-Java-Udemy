/*
Receba a altura do degrau de uma escada e a altura que o usuário deseja alcançar. Calcule e mostre quantos degraus o usuário deverá subir para alcançar seu objetivo.
*/
package Modulo1;
import java.util.*;
public class Exercicio44 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a altura do degrau: ");
		double degrau = leitor.nextDouble();
		System.out.println("Informe a altura da escada: ");
		double escada = leitor.nextDouble();
		System.out.println("A escada levará " + (escada / degrau) + " degraus.");
		leitor.close();
	}

}
