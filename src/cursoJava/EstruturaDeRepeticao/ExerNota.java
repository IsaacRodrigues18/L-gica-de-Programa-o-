package cursoJava.EstruturaDeRepeticao;

import java.util.Scanner;

public class ExerNota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean notaValida = true;
        do{
            System.out.println("Informe a sua nota entre 0 e 10" );
            double nota = scan.nextDouble();
            if(nota >= 0 && nota <= 10){
                 notaValida = true;
                System.out.println(" nota válida "+ nota + " sua nota");
            }else{
                 notaValida = false;
                System.out.println(" nota inválida");
            }
        }while( notaValida == false);
     }
}
