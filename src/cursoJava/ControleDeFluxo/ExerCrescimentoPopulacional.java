package cursoJava.ControleDeFluxo;

import java.util.Scanner;

public class ExerCrescimentoPopulacional {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println(" Qual é o numero de crianças nascidas ?");
        int criancas = leia.nextInt();
        System.out.println(" Qual é número de óbitos ?");
        int obitos = leia.nextInt();
        System.out.println(" Qual é o número de habitantes ? ");
        int habitantes = leia.nextInt();
        System.out.println(" Qual a taxa deve ser calculada: Natalidade ou Mortalidade ");
        String taxa = leia.next();
        if (taxa.equalsIgnoreCase("Natalidade")){
            double natalidade = (criancas * 1000) / habitantes;
            System.out.println(" Taxa de natalidade é de " + natalidade + " % ao ano ");
        }else if(taxa.equalsIgnoreCase("Mortalidade")){
            double mortalidade = (obitos * 1000) / habitantes;
            System.out.println(" Taxa de mortalidade é de " + mortalidade + " % ao ano " );
        }
    }
}
