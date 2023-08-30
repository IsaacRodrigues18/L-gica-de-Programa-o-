package cursoJava.EstruturaDeRepeticao;

import java.util.Random;

public class exer6 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int QTD_num = 50;
        for (int i = 0; i <= QTD_num; i++) {
            int Num = aleatorio.nextInt(1000);
            System.out.println(" numeros aleatórios: " + Num);
        }


    }
}
