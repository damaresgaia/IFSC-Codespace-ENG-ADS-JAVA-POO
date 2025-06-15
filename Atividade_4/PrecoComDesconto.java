package Atividade_4;
import java.util.Scanner;

public class PrecoComDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total (R$): ");
        double total = scanner.nextDouble();

        System.out.print("Digite o valor do desconto (R$): ");
        double desconto = scanner.nextDouble();

        double totalComDesconto = total - desconto;
        
        System.out.printf("Total com desconto: R$%.2f\n", totalComDesconto);
        scanner.close();
    }
}
