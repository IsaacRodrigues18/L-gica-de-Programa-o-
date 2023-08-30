package cursoJava.EstruturaDeRepeticao;

import java.util.Scanner;

public class ExerParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int numeroPar = 0;
        int numeroImpar = 0;

        for(int i = 0; i <= 10; i++){
            System.out.println("Digite um 10 numero (Menores que 100)");
             numero = scanner.nextInt(); 
            if(numero % 2 == 0){
                numeroPar++;
            }else{
                numeroImpar++;
            }
        }
        System.out.println(" Numero pares: " + numeroPar);
        System.out.println(" Numero pares: " + numeroImpar);
 }
}
