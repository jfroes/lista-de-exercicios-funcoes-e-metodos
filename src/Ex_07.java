
import java.util.Scanner;

public class Ex_07 {

    //07 - Escreva contarCaracteres(String s) que devolve o número de caracteres.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("digite uma frase: ");
        String frase = sc.nextLine();

        System.out.println("essa frase tem: " + contarCaracteres(frase) +" caracteres." );


    }

    public static int contarCaracteres(String s){
        return s.length();
    }
}
