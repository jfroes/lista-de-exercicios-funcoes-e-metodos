import java.util.Scanner;

public class Ex_02 {

    //02 - Implemente ehPar(int n) que retorna true/false.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("digite um numero para saber se é par: ");
        int numero = sc.nextInt();

        System.out.println(ehPar(numero));
        sc.close();
    }

    public static boolean ehPar(int numero){
        return numero % 2 == 0 ? true : false;
    }
}
