import java.util.Scanner;

public class Ex_10 {
    //10 - Crie saudacao(String nome) retornando “Olá, nome!”.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digiteseu nome: ");
        String nome = sc.nextLine();

        System.out.println(saudacao(nome));


    }

    public static String saudacao(String nome){
        return "Olá, " + nome + "!";
    }
}
