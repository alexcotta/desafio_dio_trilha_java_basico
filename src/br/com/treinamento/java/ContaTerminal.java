package br.com.treinamento.java;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Solicitando numero
		System.out.print("Por favor, digite o número: ");
		int numero = scanner.nextInt();

		// Solicitando numero da agencia
		System.out.print("Por favor, digite a Agência: ");
		String agencia = scanner.next();

		// Solicitando nome do cliente
		System.out.print("Por favor, digite seu nome: ");
		String nome = scanner.next();

		// Solicitando saldo
		System.out.print("Por favor, digite seu saldo: ");
		double saldo = scanner.nextDouble();

		scanner.close();

		System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, " + "sua agência é "
				+ agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
	}
}
