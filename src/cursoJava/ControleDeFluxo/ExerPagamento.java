package cursoJava.ControleDeFluxo;

import java.util.Scanner;

public class ExerPagamento {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double desconto = 0;
        System.out.println("Informe o valor do produto ");
        double valor_produto = leia.nextDouble();
        System.out.println(" Digite a forma de pagamento - 1= à vista ou 2= à prazo");
        int ForPagamento = leia.nextInt();

        if (ForPagamento == 1) {
            desconto = (valor_produto * 10) / 100;
            valor_produto = valor_produto - desconto;
            System.out.println(" O valor do produto é: " + valor_produto);
        } else if (ForPagamento == 2) {
            System.out.println(" O valor do produto é: " + valor_produto);
        } else {
            System.out.println(" Forma de pagamento inválida");
        }
    }
}

