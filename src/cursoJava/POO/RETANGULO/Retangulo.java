package cursoJava.POO.RETANGULO;

public class Retangulo {
    public double altura;
    public double largura;


    public double calcArea(){
        return this.altura * this.largura;
    }

    public double calcPerimetro(){
    return (this.altura * 2) + (this.largura * 2);
    }
    /*public double calcDiagonal(double diagonal) {
         (this.altura * this.altura) + (this.largura * this.largura) = diagonal;
        return  = Math.sqrt(diagonal);
    }*/
    public void imprimirResultado(){

        System.out.println("Area " + calcArea() + " Perímetro " + calcPerimetro() );
    }

}
