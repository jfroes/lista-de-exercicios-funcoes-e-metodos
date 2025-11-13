import java.util.Locale;
import java.util.Scanner;

public class Ex_13 {
    //13 - Escreva multiplicarElementos(int[] array, int fator)

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos serão multiplicados? ");
        int nElementos = sc.nextInt();

        int elementos[] = new int[nElementos];

        System.out.print("Qual o fator da multiplicação? ");
        int fator = sc.nextInt();

        for(int i = 0; i < nElementos; i++){
            System.out.print("digite o #"+ (i+1) + " elemento: ");
            int elemento = sc.nextInt();
            elementos[i] = elemento;
        }

        multiplicarElementos(elementos, fator);


    }

    public static void multiplicarElementos(int[] array, int fator){
        if (fator > 0) {
            for (int e : array) {
                System.out.println(e + " X " + fator + " = "+ e * fator);
            }
        }else{
            System.out.println("fator nao pode ser zero");
        }
    }
}
