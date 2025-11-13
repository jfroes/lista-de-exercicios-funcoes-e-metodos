import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ex_16 {
    //16 - Crie converterParaMaiusculo(String texto).

    public static void main(String[] args) {



        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



            System.out.print("Digite um texto:  ");
            String entrada = sc.nextLine();


        System.out.println("saida: " + converterParaMaiusculo(entrada));

    }

    public static String converterParaMaiusculo(String texto){
        return texto.toUpperCase();
    }
}
