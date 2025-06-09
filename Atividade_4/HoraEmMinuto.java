package Atividade_4;
import java.util.Scanner;

public class HoraEmMinuto {
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
       
       System.out.print("Digite a hora: ");
       int hora = entrada.nextInt();
     
       int minutos = hora * 60;
     
       System.out.println("São " + minutos + " minutos");
     
       entrada.close();

    }
}