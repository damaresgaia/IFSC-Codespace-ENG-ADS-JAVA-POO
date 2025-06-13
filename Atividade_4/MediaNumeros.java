package Atividade_4;

import java.util.Scanner;

public class MediaNumeros {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        System.out.print("Digite o quarto valor: ");
        double valor4 = scanner.nextDouble();

        // Cálculo da soma
        double soma = valor1 + valor2 + valor3 + valor4;

        // Cálculo da média
        double media = soma / 4;

        System.out.println("A média é: " + media);

        scanner.close();
    }
}