package cursoJava.POO.HERANCA.EXERCICIO;

import org.w3c.dom.ls.LSOutput;

public class ProdutosUsados extends Produto{
    private String data;
    public ProdutosUsados(){
        super();
    }

    public ProdutosUsados(String nome, double preco, String data) {
        super(nome, preco);
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    @Override
    public double priceTag(){
        System.out.println(getData());
        return super.priceTag();
    }

}
