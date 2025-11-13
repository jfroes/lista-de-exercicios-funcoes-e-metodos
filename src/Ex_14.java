import java.util.Locale;
import java.util.Scanner;

public class Ex_14 {
    //14 - Crie imprimirArray(String[] lista).

    public static void main(String[] args) {



        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String palavra = "";


        while(!palavra.equalsIgnoreCase("sair")) {
            System.out.print("Digite uma palvra ou \"Sair\":  ");
            palavra = sc.next();
            if (!palavra.equalsIgnoreCase("sair")){
                sb.append(palavra+ ",");
            }
        }

        String[] lista = sb.toString().split(",");

        imprimirArray(lista);

    }

    public static void imprimirArray(String[] lista){
        StringBuilder sb = new StringBuilder();
        if (lista.length > 0) {
            for (String palavra : lista) {
                sb.append(palavra + ", ");
            }
            System.out.println(sb);
        }
    }
}
