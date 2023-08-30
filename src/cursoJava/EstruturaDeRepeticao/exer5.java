package cursoJava.EstruturaDeRepeticao;

import java.util.Scanner;

public class exer5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double desconto = 0;
        int NumClientes = 10;
        double valorComprar =0;
        double arrecadacao = 0;

        for(int i = 0; i <= NumClientes; i++ ) {
            System.out.println(" Informe o valor a comprar: ");
            valorComprar = leia.nextDouble();
            if (valorComprar >= 250) {
                desconto = (valorComprar * 20) / 100;
                valorComprar = valorComprar - desconto;
                System.out.println(" O desconto é de : " + desconto + " e o valor da comprar é de: " + valorComprar);
            } else if (valorComprar < 250) {
                desconto = (valorComprar * 15) / 100;
                valorComprar = valorComprar - desconto;
                System.out.println(" O desconto é de : " + desconto + " e o valor da comprar é de: " + valorComprar);
            }
            arrecadacao += valorComprar;
            System.out.println(" A arrecadação da loja é :" + arrecadacao + "$");
        }

    }
}