package cursoJava.ControleDeFluxo;

import java.util.Scanner;

public class ExerSwitchDiaDaSemana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Digite o dia da semana: ");
        String diaSemana = scan.next();
        switch (diaSemana) {
            case "Segunda":
                System.out.println(" O dia escolhido foi a Segunda-feira"); break;
            case "Terça":
                System.out.println(" O dia escolhido foi a Terça-feira");break;
            case "Quarta":
                System.out.println(" O dia escolhido foi a Quarta-feira");break;
            case "Quinta":
                System.out.println(" O dia escolhido foi a Quinta-feira");break;
            case "Sexta":
                System.out.println(" O dia escolhido foi a Sexta-feira");break;
            case "Sábado":
                System.out.println(" O dia escolhido foi a Sábado");break;
            case "Domingo":
                System.out.println(" O dia escolhido foi a Domingo");break;
            default:
                System.out.println("Opção inválida, tente novamente");
        }
    }



}
