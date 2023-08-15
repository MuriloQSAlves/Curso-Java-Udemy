/*
Faça um programa para converter uma letra maiúscula em minúscula. Use a tabela ASCII para resolver o problema.
*/
package Modulo1;
import java.util.*;
public class Exercicio45 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva aqui sua palavra aqui: ");
		String textoMaior = leitor.next();
		String textoMenor = textoMaior.toLowerCase();
		System.out.println(textoMenor);
		leitor.close();
		
	}

}
