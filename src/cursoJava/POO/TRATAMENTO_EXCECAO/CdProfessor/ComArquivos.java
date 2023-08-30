package cursoJava.POO.TRATAMENTO_EXCECAO.CdProfessor;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ComArquivos {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\tamar\\Documents\\Curso de SI\\5º período\\WEB 1\\CURSO DE JAVA - SPRING BOOT\\POO\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
