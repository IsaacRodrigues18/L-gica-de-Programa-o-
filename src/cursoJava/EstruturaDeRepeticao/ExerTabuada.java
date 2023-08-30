package cursoJava.EstruturaDeRepeticao;

import java.util.Scanner;

public class ExerTabuada {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println(" Digite um número de 1 a 10");
    int num = scan.nextInt();
    System.out.println(" A tabela de " + num + " é");
    for(int i = 0; i <= 10; i ++){
        int resultado = i*num;
        System.out.println(num + " X " +  i + " = " + resultado);

    }
    


}    
}
