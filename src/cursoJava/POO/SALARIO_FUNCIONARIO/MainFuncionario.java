package cursoJava.POO.SALARIO_FUNCIONARIO;
import java.util.Scanner;

public class MainFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario jose = new Funcionario();
        System.out.println("Informe o seu nome: ");
        jose.nome = scanner.nextLine();
        System.out.println("Informe o seu salário: ");
        jose.salario = scanner.nextDouble();
        System.out.println("Informe o imposto: ");
        jose.imposto = scanner.nextDouble();




        System.out.println(jose.nome + " Seu salário é de: " + jose.salarioLiquido() + " $ " + " Coma taxa adicional fica em: " + jose.imcrementoSalario(10));
    }
}
