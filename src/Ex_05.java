import java.util.Locale;
import java.util.Scanner;

public class Ex_05 {

    //05 - Implemente maior(int a, int b).

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("digite o primeiro numero: ");
        int n1 = sc.nextInt();

        System.out.print("digite o segundo numero: ");
        int n2 = sc.nextInt();

        System.out.println("O maior é: " + maior(n1, n2));

    }

    public static int maior(int a, int b){
        return Math.max(a, b);
    }
}

