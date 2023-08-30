package cursoJava.Vetores;

import java.util.Scanner;
/*/
Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
Exemplo:
Quantos numeros voce vai digitar? 6
Digite um numero: 8
Digite um numero: -2
Digite um numero: 9
Digite um numero: 10
Digite um numero: -3
Digite um numero: -7
NUMEROS NEGATIVOS:
-2
-3
-7
 */

public class NumerosNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você vai digita ?");
        int qtdNumeros = sc.nextInt();

        int vetor[] = new int[qtdNumeros];

        for (int i = 0; i < qtdNumeros; i++) {
            System.out.println("Digite os números: ");
            vetor[i] = sc.nextInt();

        }
        for (int i = 0; i < qtdNumeros; i++) {
            if (vetor[i] < 0) {
                System.out.println("Números Negativos: ");
                System.out.println(vetor[i]);
            }
        }
    }
}
