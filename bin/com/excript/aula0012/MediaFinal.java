package com.excript.aula0012;

import java.util.Scanner;

public class MediaFinal {

	public static void main (String[]args) {
		
		Scanner in = new Scanner(System.in);		
		double nota1, nota2, nota3, nota4, mediaminima;
		
		System.out.println("Digite sua média mínima:");
		mediaminima = in.nextDouble();
		
		System.out.println("Digite sua nota:");
		nota1 = in.nextDouble();
		
		System.out.println("Digite sua segunda nota:");
		nota2 = in.nextDouble();
		
		System.out.println("Digite sua terceira nota:");
		nota3 = in.nextDouble();
		
		System.out.println("Digite sua quarta nota:");
		nota4 = in.nextDouble();
		
		double soma = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(soma >= mediaminima){
			System.out.println("Você foi aprovado. Sua média foi de:"+ soma + "/10");
		}else{
			System.out.println("Você foi reprovado. Sua média foi de: "+ soma + "/10");	
		}				
	}	
}
