package cursoJava.POO.HERANCA.EXERCICIO;
// MELHORA ESSE CÓDIGO
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char ch = 'x';
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos Produtos: ");
        int n = sc.nextInt();
        List<Produto> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Produto #" + (1 + i));
            System.out.print("Produto comum, usado ou importado (c/u/i) ?");
            ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            if (ch == 'c') {
                Produto p = new Produto(nome,preco);
                list.add(p);
            } else if (ch == 'i') {
                System.out.print("Qual é a taxa: ");
                double taxa_Alfandega = sc.nextDouble();
                list.add(new ProdutoImportado(nome, preco, taxa_Alfandega));
            } else if (ch == 'u') {
                // USA A DATA COMO DO TIPO DATE INVÊS DA STRING
                System.out.print("Informe a data do produto: ");
                sc.nextLine();
                String data = sc.nextLine();
                list.add( new ProdutosUsados(nome, preco, data));
            } else {
                System.out.println("Caracter inválido!!!");
            }
        }
        System.out.println();
        System.out.println("Produtos: ");
        for (Produto p : list) {
            System.out.println(p.getNome() + " " + p.priceTag());
        }


    }
}
