package Atividade_4;

import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
       
       System.out.print("Digite a hora: ");
       double hora = entrada.nextDouble();
     
       int minutos = hora * 60;
     
       System.out.println("São " + minutos + " minutos");
     
       entrada.close();

    }
}
