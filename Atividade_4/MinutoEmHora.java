package Atividade_4;

import java.util.Scanner;

public class MinutoEmHora {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
       
       System.out.print("Digite os minutos: ");
       int minutos = entrada.nextInt();
     
       int hora = minutos / 60;
     
       System.out.println(minutos + " minutos correspondem a " + hora + " horas");
     
       entrada.close();

    }    
}
