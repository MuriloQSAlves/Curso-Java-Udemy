/*
Escreva um programa de ajuda para vendedor. A partir de um valor lido, mostre:
O total a pagar com desconto de 10%
O valor de cada parcela, no parcelamento de 3X sem juros
A comiss�o do vendedor, no caso da venda ser � vista (5% sobre o valor com desconto)
A comiss�o do vendedor, no caso da venda ser parcelada (5% sobre o valor total)
*/
package Modulo1;
import java.util.*;
public class Exercicio43 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o valor da compra: ");
		double valor = leitor.nextDouble();
		double descAvista = valor - (valor * 10 / 100);
		double parc = valor / 3;
		double comAvista = descAvista * 5 / 100;
		double comParc = valor * 5 / 100;
		System.out.println("O valor � vista � de: R$" + descAvista);
	    System.out.println("A comiss�o � vista � de: R$" + comAvista);
	    System.out.println("O valor da parcela � de: R$" + parc);
	    System.out.println("A comiss�o para o parcelamento � de R$" + comParc);	
		leitor.close();
	}	
}
