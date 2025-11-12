import java.util.Locale;
import java.util.Scanner;

public class Ex_11 {
    //11 - Faça calcularDesconto(double preco, double percentual).

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        double preco = sc.nextDouble();


        System.out.print("Digite o percentual de desconto: ");
        double percentual = sc.nextDouble();




        System.out.printf("%.2f", calcularDesconto(preco, percentual));


    }

    public static double calcularDesconto(double preco, double percentual){

        return preco = preco - preco * (percentual / 100);
    }
}
