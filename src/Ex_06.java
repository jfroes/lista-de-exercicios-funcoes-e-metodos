import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ex_06 {


    //06 - Crie media(double[] notas) para retornar a média de um array.

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite de quantas notas  a média será calculada: (max 5) ");
        int numeroDeNotas = sc.nextInt();
        double[] notas = new double[numeroDeNotas];

        for (int i = 0; i < numeroDeNotas; i++){
            System.out.print("Digite a #" + (i+1) + ": ");
            notas[i] = sc.nextDouble();
        }

        System.out.printf("%.2f",media(notas));
    }

    public static double media(double[] notas){
        double media = 0;

        for (double nota : notas){
            media += nota;
        }
        return media/notas.length;
    }
}

