package cursoJava.POO.LISTAS.MeuCodigoErrado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioFuncionario {
    /*Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
    N funcionários. Não deve haver repetição de id.
    Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
    Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
    mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
    conforme exemplos.
    Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
    ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
    aumento por porcentagem dada.
            (exemplo na próxima página)*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionario> listFuncionario = new ArrayList<>();
        System.out.println("Quantos funcionários serão registrados ? ");
        int qtdFuncionario = sc.nextInt();
        for(int i = 0; i < qtdFuncionario; i++){
            System.out.println("Funcionário# " + (i+1) + ":");
            System.out.println("ID: ");
            int id = sc.nextInt();
            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Salário: ");
            double salario = sc.nextDouble();
            Funcionario funcionario = new Funcionario();
            listFuncionario.add(funcionario);
        }

        System.out.println("Qual funcionário vai ter a salário aumentado");
        int idSalario = sc.nextInt();
        Integer pos = possicaoId(listFuncionario,idSalario);
        if(pos == null){
            System.out.println("Este ID não existe");
        }else{
            System.out.println("Entre com a porcentagem");
            double porcentagem = sc.nextDouble();
            listFuncionario.get(pos).incrementoSalario(porcentagem);

        }


        System.out.println();
        System.out.println("Lista de funcionários:");
        for(Funcionario funcionario : listFuncionario ){
            System.out.println(funcionario);
        }



    }
    public static Integer possicaoId(List<Funcionario> list, int id){
        for(int i = 0; i < list.size();i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

}
