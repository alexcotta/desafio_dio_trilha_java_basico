package br.com.treinamento.java;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Solicitando numero
		System.out.print("Por favor, digite o n�mero: ");
		int numero = scanner.nextInt();

		// Solicitando numero da agencia
		System.out.print("Por favor, digite a Ag�ncia: ");
		String agencia = scanner.next();

		// Solicitando nome do cliente
		System.out.print("Por favor, digite seu nome: ");
		String nome = scanner.next();

		// Solicitando saldo
		System.out.print("Por favor, digite seu saldo: ");
		double saldo = scanner.nextDouble();

		scanner.close();

		System.out.println("Ol� " + nome + ", obrigado por criar uma conta em nosso banco, " + "sua ag�ncia � "
				+ agencia + ", conta " + numero + " e seu saldo " + saldo + " j� est� dispon�vel para saque.");
	}
}
