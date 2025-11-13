import java.util.Locale;
import java.util.Scanner;

public class Ex_12 {
    //12 - Implemente ehPalindromo(String texto).

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a palavra: ");
        String palavra = sc.next();


        System.out.println(ehPalindromo(palavra));


    }

    public static boolean ehPalindromo(String texto) {
        String textoReverse = "";

        for(int i = 1; i <= texto.length(); i++){
            textoReverse += texto.charAt(texto.length() - i);
        }

        return textoReverse.equals(texto) ? true : false;
    }
}