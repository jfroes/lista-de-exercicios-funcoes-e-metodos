import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ex_15 {
    //15 - Crie somarArray(int[] nums).

    public static void main(String[] args) {



        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        boolean sair = false;



        while(!sair) {
            System.out.print("Digite um numero ou \"Sair\":  ");
            String entrada = sc.next();
           if(entrada.equalsIgnoreCase("sair")){
               sair = true;
           }else{
               sb.append(entrada + ",");
           }

        }

        int[] nums = Arrays.stream(sb.toString().split(",")).mapToInt(Integer::parseInt).toArray();

        System.out.println("A soma de todos os numeros é: " + somarArray(nums));

    }

    public static int somarArray(int[] nums){
        int result = 0;
        for(int n : nums){
            result += n;
        }
        return result;
    }
}
