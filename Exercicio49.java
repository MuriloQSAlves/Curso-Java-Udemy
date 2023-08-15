/*
Faça um programa que leia o horário (hora, minuto e segundo) de inicio e a duração, em segundos de uma experiência biológica. O programa deve resultar com o novo horário (hora, minuto e segundo) do término da mesma
*/
package Modulo1;
import java.util.*;
public class Exercicio49 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe  hora de início: ");
		int horIni = leitor.nextInt();
		System.out.println("Informe o minuto de início: ");
		int minIni = leitor.nextInt();
		System.out.println("Informe os segundos de Início: ");
		int segIni = leitor.nextInt();
		System.out.println("Informe a duração da experiência em segundos: ");
		int duraSeg = leitor.nextInt();
		//converter tempo
		segIni = (horIni * 3600) + (minIni * 60) + segIni;		
		duraSeg = segIni + duraSeg;		
		int finHor = duraSeg / 3600;
		int finRest = duraSeg % 3600;
		int finMin = finRest / 60;
		int finSeg = finRest % 60;
		System.out.println("A hora do tempo de término é: " + finHor + ":" + finMin + ":" + finSeg);
		leitor.close();
	}

}
