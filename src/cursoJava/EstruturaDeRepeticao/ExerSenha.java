package cursoJava.EstruturaDeRepeticao;

import java.util.Scanner;

public class ExerSenha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean Validacao = true;
        
        do{
            System.out.println(" Informe o seu nome ");
            String nome = scan.nextLine(); 
            System.out.println(" Informe o sua senha ");
            String senha = scan.nextLine();
            if(nome.equalsIgnoreCase(senha)){
                System.out.println(" Senha inválida, degite novamente");
                Validacao = true;
            }else{
                Validacao = false;
                System.out.println("Senha Válida");
            }
        }while(Validacao == true);
    }
}
