/*
Escreva um programa de ajuda para vendedor. A partir de um valor lido, mostre:
O total a pagar com desconto de 10%
O valor de cada parcela, no parcelamento de 3X sem juros
A comissão do vendedor, no caso da venda ser à vista (5% sobre o valor com desconto)
A comissão do vendedor, no caso da venda ser parcelada (5% sobre o valor total)
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
		System.out.println("O valor à vista é de: R$" + descAvista);
	    System.out.println("A comissão à vista é de: R$" + comAvista);
	    System.out.println("O valor da parcela é de: R$" + parc);
	    System.out.println("A comissão para o parcelamento é de R$" + comParc);	
		leitor.close();
	}	
}
