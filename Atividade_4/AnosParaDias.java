package Atividade_4;
import java.util.Scanner;

public class AnosParaDias {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de anos: ");
        int anos = scanner.nextInt();

        int dias = anos * 365;

        System.out.println("Equivalente em dias: " + dias);
        
        scanner.close();
    }
}
