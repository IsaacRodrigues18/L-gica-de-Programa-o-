package cursoJava.Vetores;

import java.util.Scanner;

public class Alturas {

    /*
    * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numeros de pessoas:");
        int n = sc.nextInt();
        double soma = 0;
        double media = 0;
        double porcentagem = 0;

        String nome[] = new String[n];
        int idade[] = new int[n];
        double altura[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (1 + i) + "a pessoa");
            System.out.print("Digite o nome:");
            sc.nextLine();
            nome[i] = sc.nextLine();
            System.out.print("Digite a idade:");
            idade[i] = sc.nextInt();
            System.out.print("Digite a altura:");
            altura[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            soma += altura[i];
            media = soma / n;
        }
        System.out.println("Media das Alturas: " + media);
        // Revisa esse for
        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                System.out.print(idade[i] + porcentagem);
            }

        }


    }
}
