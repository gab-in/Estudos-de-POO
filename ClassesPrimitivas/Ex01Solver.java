package ClassesPrimitivas;
import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex01Solver {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        //Declaração de tipo primitivo como classe
        System.out.println("Insira alguma coisa:");
        String subject = new String(input.nextLine()); // Na teoria a declaração da String é uma entrada de dados

        System.out.println(subject.charAt(3)); // Retorna o valor da 3º casa
        System.out.println(subject.length()); // Retorna o tamanho total da String
        System.out.println(subject.toUpperCase()); // Imprime com tudo maiúsculo

        String [] subjectSplit = subject.split(" ");

        for (int i=0;i<subjectSplit.length;i++){ // Para o tamanho das splits
            System.out.println(subjectSplit[i]); // Imprimir tudo isso na tela
        }

        System.out.println("Insire alguma outra coisa:");
        String subjectTwo = new String(input.nextLine());

        if(subject.equals(subjectTwo)){ // Verifica se duas Strings são iguais ou não
            System.out.println("São iguais");
        }
        else{
            System.out.println("Não são iguais");
        }
    }
}
