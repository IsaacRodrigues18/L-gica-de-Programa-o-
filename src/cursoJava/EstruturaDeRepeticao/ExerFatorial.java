package cursoJava.EstruturaDeRepeticao;

import java.util.Scanner;

public class ExerFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite algum numero: ");
        int numero = scanner.nextInt();
        System.out.println("Fatorial de " + numero);
        System.out.print(numero +"! = ");

        int fatorial = 1;
        for(int i = numero; i > 1; i--){
            fatorial *= 1;
            System.out.print(i + " . ");
        }
        System.out.print(" 1 = " + fatorial );
    }
}
