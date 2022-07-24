package br.com.dio.Calculadora;

import java.util.Scanner;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro Valor:");
		a = scan.nextInt();
		System.out.println("Digite o segundo Valor:");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao (a,b);
		double divisao = divisao(a,b);
		int multiplicacao = multiplicacao(a,b);
		
		System.out.println("soma: " + soma);
		System.out.println("sub: " + subtracao);
		System.out.println("divisao: " + divisao);
		System.out.println("multiplicacao: " + multiplicacao);
		
	}

	public static int soma(int a, int b) {
		return a + b;
		
	}
	
	public static int subtracao(int a, int b) {
		return a - b;
		
	}
	public static double divisao(double a, double b) {
		return a / b;
		
	}

	public static int multiplicacao(int a, int b) {
		return a * b;
		
	}
}
