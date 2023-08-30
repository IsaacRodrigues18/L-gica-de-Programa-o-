package cursoJava.EstruturaDeRepeticao;

import java.util.Scanner;

public class ExemploForAlinhado {
    public static void main(String[] args) {
        for(int i = 1; i <= 3; i++){
            for(int j = 0; j <= 2; j+=2){
                System.out.print(i);
                System.out.println(j);
            }
        }
    }

    public static class ExerCds {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double valor_cds = 0;
            int QtdCds = 0;
            double soma = 0;
            double media = 0;
            System.out.println("Informe a sua quantidade de CDs");
            QtdCds = scanner.nextInt();
            for(int i = 0; i <QtdCds; i++){
                System.out.println("Informe o valor dos CDs");
                valor_cds = scanner.nextDouble();
                soma += valor_cds;
                media = soma / QtdCds;

            }

                System.out.println(" Media dos cds: " + media);

        }
    }
}
