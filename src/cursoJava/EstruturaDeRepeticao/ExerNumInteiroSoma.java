package cursoJava.EstruturaDeRepeticao;

import java.util.Scanner;

public class ExerNumInteiroSoma {
    public static void main(String[] args) {
        int somaFinal = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println(" Entre com o primeiro numero");
        int num1 = scan.nextInt();
        System.out.println(" Entre com o segundo numero");
        int num2 = scan.nextInt();

        for(int i = num1; i < num2; i++){
            somaFinal += i;
            System.out.println("Soma Final: " + somaFinal);
           

        }
    }
}
