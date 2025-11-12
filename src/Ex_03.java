import java.util.Locale;
import java.util.Scanner;

public class Ex_03 {

    //03 - Crie areaRetangulo(double base, double altura).

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("digite a base do retangulo: ");
        int base = sc.nextInt();

        System.out.print("digite a altura do retangulo: ");
        int altura = sc.nextInt();

        System.out.printf("área: %.2f",areaRetangulo(base, altura));
        sc.close();
    }

    public static double areaRetangulo(double base, double altura){
        return base * altura;
    }
}
