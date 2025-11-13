import java.util.*;

public class Ex_17 {
    //17 - Escreva gerarSenha(int tamanho) gerando caracteres aleatórios.

    public static void main(String[] args) {



        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.print("o tamanho da senha:  ");
        int entrada = sc.nextInt();


        System.out.println(gerarSenha(entrada));

    }

    public static String gerarSenha(int tamanho){
        StringBuilder password = new StringBuilder();
        List<String> chars = new ArrayList<>();

        for (char c = 'a'; c <= 'z'; c++) {
            chars.add(String.valueOf(c));
        }

        for (char c = 'A'; c <= 'Z'; c++) {
            chars.add(String.valueOf(c));
        }

        for (char c = '0'; c <= '9'; c++) {
            chars.add(String.valueOf(c));
        }

        char[] especiais = {'#', '@', '!', '$', '%', '&', '*', '_'};
        for (char c : especiais) {
            chars.add(String.valueOf(c));
        }

        for (int i = 0; i < tamanho; i++) {
            int index = (int) (Math.random() * chars.size());
            password.append(chars.get(index));
        }


        return password.toString();
    }
}
