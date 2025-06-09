package Atividade_4;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
       
       System.out.print("Digite um número para base: ");
       double base = entrada.nextDouble();
     
       System.out.print("Digite um número para altura: ");
       double altura = entrada.nextDouble();
     
       double area = base * altura / 2;
     
       System.out.println("A área do triângulo é " + area);
     
       entrada.close();

    }
}