import java.util.Scanner;

public class Ex_09 {
    //09 - Crie verificarPrimo(int n).

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        System.out.println( n + " é primo? " +verificarPrimo(n));


    }

    public static Boolean verificarPrimo(int n){
        if (n > 1){
            for (int i = 2; i <= Math.sqrt(n); i++){
                if (n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}

