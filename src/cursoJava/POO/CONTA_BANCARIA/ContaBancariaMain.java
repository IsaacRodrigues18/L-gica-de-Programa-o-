package cursoJava.POO.CONTA_BANCARIA;

public class ContaBancariaMain {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(1111,"Isaac",1000);
        System.out.println("Numero da conta: " + c1.getNumeroConta() + ";" + " Nome Titular: " + c1.getNomeTitular() + ";" + " Saldo inical da conta: " + c1.getValorDepositadoInicial() + ";");
        c1.setNomeTitular("Isaac Barbosa");
        System.out.println("Novo nome Titular: " + c1.getNomeTitular());
        System.out.println("Valor depositado: " + c1.depositarValor(500));
        System.out.println("Valor sacado: " + c1.sacarValor(200));


    }
}
