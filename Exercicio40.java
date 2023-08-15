/*
Uma empresa contrata um encanador a R$30,00 por dia. Faça um programa que solicite o número de dias trabalhados pelo encanador e imprima a quantia líquida que deverá ser paga, sabendo-se que são descontados 8% para imposto de renda.
*/
package Modulo1;
import java.util.*;
public class Exercicio40 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe os dias trabalhados: ");
		double dias = leitor.nextDouble();
		double sub = dias * 30.00;
		System.out.println("O encanador deverá receber: R$" + (sub - (sub * 8 / 100)));
		leitor.close();
	}

}
