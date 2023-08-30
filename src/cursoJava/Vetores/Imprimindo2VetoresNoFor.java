package cursoJava.Vetores;

public class Imprimindo2VetoresNoFor {
    public static void main(String[] args) {
        String mes[] = {"Jan","fev","mar","abri","mai","jun","jul","ago","out","nov","dez" };
        int tot[] = {31,28,31,30,31,30,31,31,30,31,30,31,};
        for(int c = 0; c<mes.length; c++){
            System.out.println("O mês de " + mes[c] + " tem " + tot[c] + " dias ao todo");
        }
    }
}
