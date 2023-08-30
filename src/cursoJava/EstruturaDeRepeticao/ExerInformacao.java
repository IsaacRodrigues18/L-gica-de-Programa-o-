package cursoJava.EstruturaDeRepeticao;

import java.util.Scanner;

public class ExerInformacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean informacao = false;
        String nome;
        int idade;
        double salario;
        String sexo;
       do{
            System.out.println(" Informe seu nome ");
            nome = scan.nextLine();
            if(nome.length() < 3){
                System.out.println(" Nome Inválido, menor que 3 caracteres");
                informacao = false;
            }else{
                System.out.println(" Nome válido ");
                informacao = true;
            }
        }while(informacao == false);

        
        do{
            System.out.println(" Informe sua idade ");
            idade = scan.nextInt();
            if(idade < 0 || idade > 150 ){
                System.out.println(" Idade inválida");
                informacao = false;
            }else{
                System.out.println(" Idade válida ");
                informacao = true;
            }
        }while(informacao == false);
        
        do{
            System.out.println(" Informe seu salário");
            salario = scan.nextDouble();
            if(salario < 0){
                System.out.println(" Salário inválido");
                informacao = false;
            }else{
                System.out.println(" Salário válido ");
                informacao = true;
            }
        }while(informacao == false);
        
        
        do{
            System.out.println(" Informe seu sexo");
            sexo = scan.nextLine();
            if(sexo.equalsIgnoreCase("m")|| sexo.equalsIgnoreCase("f")){
                System.out.println(" sexo válido ");
                informacao = true;
            }else{
                
                System.out.println(" Sexo inválido, digete m para masculino e f para feminino");
                informacao = false;
            }
        }while(informacao == false);
    }
}
