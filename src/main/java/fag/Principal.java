package main.java.fag;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=== ATIVIDADE JAVA BÁSICO - 10 QUESTÕES ===\n");
		
		// Executar todas as questões
//		questao1_Scanner(scan);
//		questao2_Print();
//		questao3_For();
//		questao4_If(scan);
//		questao5_While(scan);
//		questao6_Metodos();
//		questao7_ScannerIf(scan);
//		questao8_ForPrint();
		questao9_WhileScanner(scan);
		questao10_MetodosFor();
		
		scan.close();
	}
	
	// ========================================
	// QUESTÃO 1 - SCANNER (Entrada de Dados)
	// ========================================
	// TODO: Crie um programa que leia o nome e a idade de uma pessoa
	// e exiba uma mensagem de boas-vindas personalizada
	// Exemplo: "Olá João! Você tem 20 anos. Seja bem-vindo(a)!"
	public static void questao1_Scanner(Scanner scan) {
		System.out.println("Informe seu nome: ");
		String nome = scan.nextLine();
		System.out.println("Informe sua idade: ");
		int idade = scan.nextInt();
		System.out.printf("Olá %s! Você tem %d anos. Seja bem-vindo(a)!",nome, idade);
		
	}
	
	// ========================================
	// QUESTÃO 2 - PRINT (Saída de Dados)
	// ========================================
	// TODO: Crie um programa que exiba uma tabela de multiplicação do 5 (de 1 a 10)
	// Formate a saída de forma organizada
	// Exemplo: "5 x 1 = 5", "5 x 2 = 10", etc.
	public static void questao2_Print() {
		System.out.println("=== QUESTÃO 2 - PRINT ===");
		int numero = 5;

        System.out.println(numero + " x 1 = " + (numero * 1));
        System.out.println(numero + " x 2 = " + (numero * 2));
        System.out.println(numero + " x 3 = " + (numero * 3));
        System.out.println(numero + " x 4 = " + (numero * 4));
        System.out.println(numero + " x 5 = " + (numero * 5));
        System.out.println(numero + " x 6 = " + (numero * 6));
        System.out.println(numero + " x 7 = " + (numero * 7));
        System.out.println(numero + " x 8 = " + (numero * 8));
        System.out.println(numero + " x 9 = " + (numero * 9));
        System.out.println(numero + " x 10 = " + (numero * 10));
    }

	// ========================================
	// QUESTÃO 3 - FOR (Laço de Repetição)
	// ========================================
	// TODO: Crie um programa que calcule e exiba a soma dos números de 1 até 100
	// Use um laço for para fazer o cálculo
	// Resultado esperado: 5050
	public static void questao3_For() {
		System.out.println("=== QUESTÃO 3 - FOR ===");
		System.out.println();
		int soma = 0;
		int i = 1;
		for (i = 1; i <= 100; i++) {
		soma += i;
		}
		System.out.println("A soma dos números de 1 até 100 é: " + soma);
	}	


	
	// ========================================
	// QUESTÃO 4 - IF (Estrutura Condicional)
	// ========================================
	// TODO: Crie um programa que leia uma nota e informe:
	// - Aprovado (nota >= 7): "Parabéns! Você foi APROVADO!"
	// - Recuperação (4 <= nota < 7): "Você está em RECUPERAÇÃO. Estude mais!"
	// - Reprovado (nota < 4): "Infelizmente você foi REPROVADO. Tente novamente!"
	public static void questao4_If(Scanner scan) {
	    System.out.println("=== QUESTÃO 4 - IF ===");
	    System.out.println("Digite sua nota (0 a 10):");

	    double nota = scan.nextDouble();

	    if (nota >= 7) {
	        System.out.println("Parabéns! Você foi APROVADO!");
	    } if (nota >= 4 && nota < 7) {
	        System.out.println("Você está em RECUPERAÇÃO. Estude mais!");
	    } if (nota < 4) {
	        System.out.println("Infelizmente você foi REPROVADO. Tente novamente!");
	    }
	}
	
	// ========================================
	// QUESTÃO 5 - WHILE (Laço de Repetição)
	// ========================================
	// TODO: Crie um programa que leia números inteiros até que o usuário digite 0
	// e então exiba a soma de todos os números digitados
	public static void questao5_While(Scanner scan) {
		System.out.println("=== QUESTÃO 5 - WHILE ===");
		System.out.println("Digite números inteiros (digite 0 para parar):");
		int soma = 0;
	    int numero = scan.nextInt();

	    while (numero != 0) {
	        soma += numero;
	        numero = scan.nextInt();
	    }

	    System.out.println();
	    System.out.println("A soma de todos os números digitados é: " + soma);
	}
	
	// ========================================
	// QUESTÃO 6 - MÉTODOS (Função)
	// ========================================
	// TODO: Crie um método que receba dois números e retorne o maior entre eles
	// Teste o método com diferentes valores
	// Dica: Use o método encontrarMaior() que está declarado abaixo
	public static void questao6_Metodos() {
		int n1 = 10;
	    int n2 = 20;

	    int maior = encontrarMaior(n1, n2);
	    System.out.println("Entre " + n1 + " e " + n2 + ", o maior é: " + maior);
	}
	// ========================================
	// QUESTÃO 7 - SCANNER + IF
	// ========================================
	// TODO: Crie um programa que leia um número e informe se ele é par ou ímpar
	// Use o operador % (módulo) para verificar o resto da divisão por 2
	public static void questao7_ScannerIf(Scanner scan) {
		System.out.println("=== QUESTÃO 7 - SCANNER + IF ===");
		System.out.print("Digite um número inteiro: ");
	    
	    int numero = scan.nextInt(); 

	    if (numero % 2 == 0) {
	        System.out.println("O número " + numero + " é PAR.");
	    } else { 
	        System.out.println("O número " + numero + " é ÍMPAR.");
	    }

	}
	
	// ========================================
	// QUESTÃO 8 - FOR + PRINT
	// ========================================
	// TODO: Crie um programa que exiba todos os números pares de 2 até 20
	// Exiba um número por linha
	public static void questao8_ForPrint() {
		System.out.println("=== QUESTÃO 8 - FOR + PRINT ===");
		
		for (int i = 2; i <= 20; i += 2) { 
	        System.out.println(i);
	}
	}
	
	// ========================================
	// QUESTÃO 9 - WHILE + SCANNER
	// ========================================
	// TODO: Crie um programa que leia números até que o usuário digite um número negativo
	// e conte quantos números positivos foram digitados
	public static void questao9_WhileScanner(Scanner scan) {
		System.out.println("=== QUESTÃO 9 - WHILE + SCANNER ===");
		System.out.println("Digite números (digite um número negativo para parar):");
		
		int contador = 0;
	    int numero = scan.nextInt();

	    while (numero > 0) { 
	        contador++;       
	        numero = scan.nextInt();
	    }

	    System.out.println("Quantidade de números positivos digitados: " + contador);
	}
	// ========================================
	// QUESTÃO 10 - MÉTODOS + FOR
	// ========================================
	// TODO: Crie um método que receba um número e retorne o fatorial desse número
	// Teste o método com os valores 5 e 7
	// Dica: Use o método calcularFatorial() que está declarado abaixo
	// Fatorial de 5 = 5! = 5 x 4 x 3 x 2 x 1 = 120
	public static void questao10_MetodosFor() {
		System.out.println("=== QUESTÃO 10 - MÉTODOS + FOR ===");
		int num1 = 5;
	    int num2 = 7;

	    System.out.println("Fatorial de " + num1 + " = " + calcularFatorial(num1));
	    System.out.println("Fatorial de " + num2 + " = " + calcularFatorial(num2));

	    System.out.println();
	}
	
	// ========================================
	// MÉTODO PARA QUESTÃO 6
	// ========================================
	// TODO: Implemente este método para retornar o maior entre dois números
	public static int encontrarMaior(int a, int b) {
	    if (a > b) {
	        return a;
	    } else {
	        return b;
	    }
	}

	// ========================================
	// MÉTODO PARA QUESTÃO 10
	// ========================================
	// TODO: Implemente este método para calcular o fatorial de um número
	// Use um laço for para fazer o cálculo
	public static long calcularFatorial(int n) {
		long fatorial = 1; 
	    for (int i = 2; i <= n; i++) { 
	        fatorial *= i;
	    }

	    return fatorial;
	}
}	