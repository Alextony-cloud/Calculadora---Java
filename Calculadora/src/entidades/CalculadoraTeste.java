package entidades;

import java.util.Scanner;

public class CalculadoraTeste {

	public static void main(String[] args) {
		String nome;
		String fim;
		double n1, n2;
		int valor;
		Calculadora calculadora = new Calculadora();
		Scanner ler = new Scanner(System.in);

		System.out.println("--------------- Calculadora de opera��es b�sicas ---------------");
		System.out.print("Digite seu nome: ");
		nome = ler.next();
		do {
			System.out.printf("Ol�, %s. Escolha a opera��o que deseja efetuar de acordo com as op��es logo abaixo \n",
					nome);
			System.out.print("1 - somar, 2 - subtrair, 3 - multiplicar, 4 - dividir: ");
			valor = ler.nextInt();
			if (valor < 1 || valor > 4) {
				System.out.println("N�mero inv�lido");
			} else {

				System.out.printf("Por favor, %s. digite o primeiro n�mero: ", nome);
				n1 = ler.nextDouble();
				System.out.print("Digite o segundo n�mero: ");
				n2 = ler.nextDouble();

				switch (valor) {
				case 1: {
					System.out.println("Resultado: " + calculadora.somar(n1, n2));
					break;
				}
				case 2: {
					System.out.println("Resultado: " + calculadora.subtrair(n1, n2));
					break;
				}
				case 3: {
					System.out.println("Resultado: " + calculadora.multiplicar(n1, n2));
					break;
				}
				case 4: {
					System.out.println("Resultado: " + calculadora.dividir(n1, n2));
					break;
				}

				}
			}
			System.out.println("Deseja repetir? (sim / n�o) ");
			fim = ler.next();
		} while (!fim.equalsIgnoreCase("n�o"));
		System.out.println("Programa encerrado!!!");
		ler.close();
	}
}
