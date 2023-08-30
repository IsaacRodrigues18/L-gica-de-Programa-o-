package cursoJava.POO.CONTA_BANCARIA;

public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double valorDepositadoInical;



    public ContaBancaria(){
    }

    public ContaBancaria(final int numeroConta, final String nomeTitular, final int valorDepositadoInical) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.valorDepositadoInical = valorDepositadoInical;
    }
    public ContaBancaria(final int numeroConta, final String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public void setNomeTitular(final String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getValorDepositadoInicial() {
        return this.valorDepositadoInical;
    }

    public double depositarValor(double valorAumentado){
        return this.valorDepositadoInical += valorAumentado;
    }

    public double sacarValor(double valorSacado){
        return this.valorDepositadoInical -= valorSacado + 5;
    }
}
