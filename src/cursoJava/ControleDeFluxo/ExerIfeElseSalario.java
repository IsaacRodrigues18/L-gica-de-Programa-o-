package cursoJava.ControleDeFluxo;

import java.util.Scanner;

public class ExerIfeElseSalario {
    /*
    Crie uma variável salário e imprima seu imposto
    imposto:
    Salário < 1000, 5%
    Salário >= 1000 && salário < 2000, 10%
    Salário >= 2000 && salário < 4000, 15%
    Salário < 5000, 20%
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double imposto = 0;
        System.out.println("Informe seu salário: ");
        double salario = scan.nextDouble();
        if (salario < 1000) {
            imposto = salario * 0.05;
            salario +=  - imposto;
        } else if (salario >= 1000 && salario < 2000) {
            imposto = salario * 0.1;
            salario = salario - imposto;
        } else if (salario >= 2000 && salario < 4000) {
            imposto = salario * 0.15;
            salario = salario - imposto;
        } else if (salario >= 5000) {
            imposto = salario * 0.2;
            salario = salario - imposto;
        }

        System.out.print("Salário líquido: " + salario);

    }
    

}

