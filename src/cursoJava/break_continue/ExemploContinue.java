package cursoJava.break_continue;

import java.util.Scanner;

public class ExemploContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Digite o menor numero ");
        int numeroMenor = scanner.nextInt();

        System.out.println(" Digite o maior numero ");
        int numeroMaior = scanner.nextInt();

        for(int i = numeroMenor ; i <= numeroMaior;i++){
            //System.out.println(i);
            if(i % 5 == 0){
                // No Continue ele não vai imprimir o loop i quando a
                //condição do if estiver verdadeira
                continue;
            }
            System.out.println(" O valor de i é: " + i );

        }
    }
}
