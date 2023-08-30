package cursoJava.break_continue;

import java.util.Scanner;


public class ExemploBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Digite o menor numero ");
        int numeroMenor = scanner.nextInt();

        System.out.println(" Digite o maior numero ");
        int numeroMaior = scanner.nextInt();

        for (int i = numeroMenor; i <= numeroMaior; i++) {
            System.out.println(i);
            if (i % 5 == 0) {
                System.out.println(" Primeiro numero divisivél pro 5 é: " + i);
                // No break ele vai para de imprimir o loop i quando a
                //condição do if estiver verdadeira
                break;

            }


        }


    }
}