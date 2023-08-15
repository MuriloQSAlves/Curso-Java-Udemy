/*
Fa�a um programa que leia o hor�rio (hora, minuto e segundo) de inicio e a dura��o, em segundos de uma experi�ncia biol�gica. O programa deve resultar com o novo hor�rio (hora, minuto e segundo) do t�rmino da mesma
*/
package Modulo1;
import java.util.*;
public class Exercicio49 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe  hora de in�cio: ");
		int horIni = leitor.nextInt();
		System.out.println("Informe o minuto de in�cio: ");
		int minIni = leitor.nextInt();
		System.out.println("Informe os segundos de In�cio: ");
		int segIni = leitor.nextInt();
		System.out.println("Informe a dura��o da experi�ncia em segundos: ");
		int duraSeg = leitor.nextInt();
		//converter tempo
		segIni = (horIni * 3600) + (minIni * 60) + segIni;		
		duraSeg = segIni + duraSeg;		
		int finHor = duraSeg / 3600;
		int finRest = duraSeg % 3600;
		int finMin = finRest / 60;
		int finSeg = finRest % 60;
		System.out.println("A hora do tempo de t�rmino �: " + finHor + ":" + finMin + ":" + finSeg);
		leitor.close();
	}

}
