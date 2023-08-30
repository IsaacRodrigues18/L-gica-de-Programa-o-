package cursoJava.POO.SALARIO_FUNCIONARIO;

public class Funcionario {
    public String nome;
    public double salario;
    public double imposto;

    double salarioNovo = 0;



    public double salarioLiquido(){
        return this.salario - this.imposto;
    }
    public double imcrementoSalario( int taxa ){
        double salarioLiquido = this.salario - this.imposto;
        double aumento = this.salario * taxa/100;
        return   salarioNovo = salarioLiquido + aumento;
    }
}
