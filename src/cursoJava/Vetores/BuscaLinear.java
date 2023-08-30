package cursoJava.Vetores;

import java.util.Scanner;

public class BuscaLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String estatos[] = new String[10];
        estatos[0] = "AC";
        estatos[1] = "BA";
        estatos[2] = "CE";
        estatos[3] = "DF";
        estatos[4] = "AM";
        estatos[5] = "AP";
        estatos[6] = "PB";
        estatos[7] = "RN";
        estatos[8] = "MS";
        estatos[9] = "SP";

        //Imprimir o vetor
        for (int i = 0; i < estatos.length; i++) {
            System.out.println("Estados: " + (1 + i) + " " + estatos[i]);
        }

        System.out.print("Digite a sigla do Estado: ");
        String siglaBusca = sc.nextLine();

        //Busca o estado com a sigla igual
        boolean encontrou = false;
        for (int i = 0; i < estatos.length; i++) {
            String elemento = estatos[i];
            if (elemento.equalsIgnoreCase(siglaBusca)) {
                encontrou = true;
                break;
            }
        }
        if (encontrou == true) {
            System.out.println("Encontrou");
        } else {
            System.out.println("Não encontrou");
        }

    }
}
