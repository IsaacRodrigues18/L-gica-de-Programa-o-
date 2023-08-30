package cursoJava.EstruturaDeRepeticao;

import java.util.Random;
import java.util.Scanner;

public class exer2 {
      public static void main(String[] args) {
          
      
    Scanner leia = new Scanner(System.in);
        Random aleatorio = new Random();
        int numAleatorio = aleatorio.nextInt(10);
        System.out.println(" Digite um numero aleátorio de 0 a 10: ");
        int numAleatorioLeia = leia.nextInt();
        


        System.out.println("************");
        while (numAleatorio != numAleatorioLeia) {
            System.out.println(" Você errou ");
                  if (numAleatorio < numAleatorioLeia) {
                    System.out.println("Numero chutado acima " );
                } else if (numAleatorio > numAleatorioLeia) {
                    System.out.println(" Numero chutado abaixo ");
                }
                    System.out.println(" Digite novamente ");
                    numAleatorioLeia = leia.nextInt();
                }
                if (numAleatorio == numAleatorioLeia) {
                System.out.println(" Parabéns você acertou " + numAleatorio + " = " + numAleatorioLeia);
                }
              }
              
            }
        

