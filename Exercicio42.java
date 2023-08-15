/*
Receba o salário base de um funcionário. Calcule e imprima o salário a receber, sabendo-se que esse funcionário tem uma gratificação de 5% sobre o salário base. Além disso ele paga 7% de imposto sobre o salário base.
*/
package Modulo1;
import java.util.*;
public class Exercicio42 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o salario do funcionário> ");
		double sal = leitor.nextDouble();
		System.out.println("O funcionário receberá acrescido de 5% de gratificação e 7% de imposto o  valor de: " + (sal + (sal * 5 / 100) - (sal * 7 / 100)));
		leitor.close();
	}

}
