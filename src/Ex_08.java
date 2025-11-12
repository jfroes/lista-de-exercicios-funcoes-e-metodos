import java.util.Scanner;

public class Ex_08 {

    //08 - Crie converterCelsiusParaFahrenheit(double celsius).

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("digite a temperatura em Celcius: ");
        double celsius = sc.nextDouble();

        System.out.printf("Fahrenheit: %.2f ",converterCelsiusParaFahrenheit(celsius));


    }

    public static double converterCelsiusParaFahrenheit(double celsius){
        return celsius * 1.8 + 32;
    }
}
