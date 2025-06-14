package Atividade_4;
import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;

        System.out.print("Digite o valor de a: ");
        a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Não existem raízes reais.");
        } else {
            double raizDelta = Math.sqrt(delta);
            double x1 = (-b + raizDelta) / (2 * a);
            double x2 = (-b - raizDelta) / (2 * a);

            System.out.printf("x' = %.2f\n", x1);
            System.out.printf("x'' = %.2f\n", x2);
        }

        scanner.close();
    }
}

