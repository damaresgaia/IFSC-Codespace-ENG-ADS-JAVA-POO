package Atividade_4;
import java.util.Scanner;

public class DolarParaReal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em dólares: ");
        double dolares = scanner.nextDouble();

        double reais = dolares * 5.64;

        System.out.printf("Valor em reais: R$%.2f\n", reais);
        
        scanner.close();
    }
}
