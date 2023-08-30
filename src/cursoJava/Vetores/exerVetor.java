package cursoJava.Vetores;

public class exerVetor {
    public static void main(String[] args) {

        int[] numeros = new int[100];
        for (int posicao = 0; posicao < numeros.length; posicao++) {
            numeros[posicao] = 10;
        }
        System.out.println(numeros[50]);
    }
}
