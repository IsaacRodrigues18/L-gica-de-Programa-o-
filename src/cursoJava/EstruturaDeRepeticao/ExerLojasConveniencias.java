package cursoJava.EstruturaDeRepeticao;

import java.util.Scanner;

public class ExerLojasConveniencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtdProdutos = 0;
        double valorProdutos = 0;
        double dinheiro = 0;
        double troco = 0;
        double total = 0;
        System.out.println("Digite valor a pagar");
        dinheiro = scanner.nextDouble();
        System.out.println("Informe a quantidae de produtos");
        qtdProdutos = scanner.nextInt();
        for(int i = 0; i <= qtdProdutos; i++){
            System.out.println("Informe o valor do produto");
            valorProdutos = scanner.nextDouble();
            total = valorProdutos * qtdProdutos;
            troco = dinheiro - total;
            System.out.println("**********");
            System.out.println(" Loja Tabajara");
            System.out.println(" Produto "  + i + ":R$ " + total);
            System.out.println("Total: R$ " + total);
            System.out.println(" Dinheiro: R$ " + dinheiro);
            System.out.println(" Troco: R$" + troco);
        }
        
    }
}
