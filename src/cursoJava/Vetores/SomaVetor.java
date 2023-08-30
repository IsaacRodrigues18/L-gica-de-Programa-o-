package cursoJava.Vetores;

import java.util.Scanner;

public class SomaVetor {
    /*
    * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
Exemplo:
Quantos numeros voce vai digitar? 4
Digite um numero: 8.0
Digite um numero: 4.0
Digite um numero: 10.0
Digite um numero: 14.0
VALORES = 8.0 4.0 10.0 14.0
SOMA = 36.00
 * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int valores = 0;
        double media = 0;

        System.out.print("Digite a quantidade de numeros reais:");
        int qtdnumeros = sc.nextInt();
        int vector[] = new int[qtdnumeros];


        for (int i = 0; i < qtdnumeros; i++) {
            System.out.println("Digite um número: ");
            vector[i] = sc.nextInt();
        }

        //Revisa este for
        for (int i = 0; i < qtdnumeros; i++) {
            valores = vector[i];
            System.out.println("Valores: " + valores);
        }


        for (int i = 0; i < qtdnumeros; i++) {
            soma += vector[i];
        }
        System.out.println("soma: " + soma);
        for (int i = 0; i < qtdnumeros; i++) {
            media = soma / qtdnumeros;
        }
        System.out.println("Media: " + media);
    }
}

