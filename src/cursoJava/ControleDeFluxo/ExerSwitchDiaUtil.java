package cursoJava.ControleDeFluxo;

import java.util.Scanner;

public class ExerSwitchDiaUtil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Digite o dia da semana com valores de 1 a 7 " +
                "Sendo 1 = Domingo, 2 = Segunda, 3 = Terça..........");
        int diaSemana = scan.nextInt();
        switch (diaSemana) {
            case 1:
                System.out.println(" FINAL DE SEMANA "); break;
            case 2:
                System.out.println(" DIA ÚTIL ");break;
            case 3:
                System.out.println(" DIA ÚTIL ");break;
            case 4:
                System.out.println(" DIA ÚTIL ");break;
            case 5:
                System.out.println(" DIA ÚTIL ");break;
            case 6:
                System.out.println("DIA ÚTIL ");break;
            case 7:
                System.out.println(" FINAL DE SEMANA ");break;
            default:
                System.out.println("Opção inválida, tente novamente");
        }
/*
    Uma alternativa mais "Limpa"

    switch (diaSemana){
        case 1:
        case 7:
        System.out.println(" FINAL DE SEMANA ");break;
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        System.out.println(" DIA ÚTIL ");break;
            default:
        System.out.println("Opção inválida, tente novamente");


     */

    }

    }

