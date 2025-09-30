package exercicioarraylist;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosInformados {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<Integer>();

        System.out.println("Digite o primeiro numero: ");
        listaNumeros.add(in.nextInt());
        System.out.println("Digite o segundo numero: ");
        listaNumeros.add(in.nextInt());
        System.out.println("Digite o terceiro numero: ");
        listaNumeros.add(in.nextInt());
        System.out.println("Digite o quarto numero: ");
        listaNumeros.add(in.nextInt());
        System.out.println("Digite o quinto numero: ");
        listaNumeros.add(in.nextInt());


        //Agora a gente faz o que pedia o exercício
        int i,conta=0;
        for(i=0;i<listaNumeros.size();i++){
            conta=conta+listaNumeros.get(i);
        }
        System.out.println("Valor da soma: "+conta);
        System.out.println("Média Aritmética: "+(conta/listaNumeros.size()));
    }
}
