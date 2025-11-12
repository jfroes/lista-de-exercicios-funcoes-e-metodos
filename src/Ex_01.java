import java.util.Scanner;

public class Ex_01 {

//01 - Crie um método soma(int a, int b) e exiba o resultado.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite o primeiro numero: ");
        int n1 = sc.nextInt();

        System.out.print("digite o segundo numero: ");
        int n2 = sc.nextInt();

        System.out.println(n1 + " + " + n2 + " = " + soma(n1, n2));
        sc.close();
    }

    public static int soma(int n1, int n2){
        return n1 + n2;
    }
}
