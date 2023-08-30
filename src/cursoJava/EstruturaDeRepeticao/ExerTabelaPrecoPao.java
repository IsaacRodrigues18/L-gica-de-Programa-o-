package cursoJava.EstruturaDeRepeticao;

import java.util.Scanner;

public class ExerTabelaPrecoPao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ValorPao = 0;
        int qtd_pao = 0;
        System.out.println(" Digite a quantidade de pães");
        qtd_pao = scanner.nextInt();
        System.out.println(" informe o valor dos pães");
        ValorPao = scanner.nextDouble();
        System.out.println("***************");
        System.out.println(" Preço dos pães: " + ValorPao);
        System.out.println(" Panificadora Pão de Ontem - Tabela de preços");
        for(int i = 0; i <= qtd_pao;i++ ){
            double valoresTabela = i * ValorPao;
            System.out.println(i + " - R$ " + valoresTabela);
        }
    }
    
}
