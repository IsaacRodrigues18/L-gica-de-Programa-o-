package cursoJava.POO.HERANCA.EXERCICIO;

public class ProdutoImportado extends Produto {
    private double taxa_Alfandega;
    public ProdutoImportado(){
        super();
    }
    public ProdutoImportado(String nome, double preco, double taxa_Alfandega) {
        super(nome, preco);
        this.taxa_Alfandega = taxa_Alfandega;
    }

    public double getTaxa_Alfandega() {
        return taxa_Alfandega;
    }

    public void setTaxa_Alfandega(double taxa_Alfandega) {
        this.taxa_Alfandega = taxa_Alfandega;
    }
    @Override
    public double priceTag(){
        return super.priceTag() + this.taxa_Alfandega;
    }

}
