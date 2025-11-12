import java.util.Locale;
import java.util.Scanner;

public class Ex_04 {
    //04 - Escreva fatorial(int n) recursivamente.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("digite um numero: ");
        int n = sc.nextInt();

        System.out.println(fatorial(n));
        sc.close();
    }

    public static int fatorial(int n){
        if(n <= 1){
            return 1;
        }
       return n * fatorial(n -1);
    }
}
