package ClassesPrimitivas;
import java.util.Scanner;

public class Ex02Solver {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Insere um número: ");
        int firstValue = input.nextInt();

        System.out.println("Insere outro número: ");
        double secndValue = input.nextDouble();

        String firstValueConverted = String.valueOf(firstValue);
        String secndValueConverted = String.valueOf(secndValue);

        System.out.println(firstValueConverted);
        System.out.println(secndValueConverted);
    }
}
