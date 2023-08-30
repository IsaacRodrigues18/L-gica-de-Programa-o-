package cursoJava.EstruturaDeRepeticao;

public class ExerCrescimentoPolulacional {
    public static void main(String[] args) {
        double populacaoA = 80000;
        double populacaob = 200000;
        int ano = 0;
        while(populacaoA < populacaob){
             populacaoA += (populacaoA * 0.03);
             populacaob += (populacaob * 0.015);
            ano++;
            }
            System.out.println("Quantos anos: " + ano);
        }
    }
