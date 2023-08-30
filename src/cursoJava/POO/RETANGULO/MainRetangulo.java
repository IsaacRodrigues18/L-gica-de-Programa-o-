package cursoJava.POO.RETANGULO;

import java.util.Scanner;

public class MainRetangulo {

    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe a Altura do retângulo: ");
        r1.altura = scan.nextDouble();
        System.out.print("Informe a Largura do retângulo: ");
        r1.largura = scan.nextDouble();

        r1.calcArea();
        r1.calcPerimetro();
        r1.imprimirResultado();





    }
}
