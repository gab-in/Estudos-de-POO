/*
* Eu sei que é só para fixar as coisas que a gente viu, mas puta que pariu que lixo de atividade
* Eu meio
*/
package Aula02;

import java.util.Scanner;

public class LerCoisa {
    public static String perguntaNome (){
        Scanner ler=new Scanner(System.in);
        System.out.println("E o teu nome querido, qual é?");
        return(ler.nextLine());
    }
    public static int pergunta(){
        Scanner ler=new Scanner(System.in);
        //ler.nextLine(); //Limpa o buffer
        //^ Só compensa fazer isso se tem buffer ára limpar
        System.out.println("Em uma escala de 1 a 10, o quão VIADO você é?");
        /*
        * Só por curiosidade,
        * ler.close();
        * Isso fecharia o Scanner chamado de ler
        */
        return (ler.nextInt());
    }
    public static void main (String[] args){
        int NumLido;
        while(true){
            NumLido=pergunta();

            if(NumLido <= 10 && NumLido >= 1)break;
            System.out.println("Você é burro porra? É de 1 a 10");
        }

        int Teste = (NumLido < 5) ? 1 : 0;
        if(Teste==1)System.out.println("Bixa mentirosa");
        while(true){
            String Nome=perguntaNome();

            if(!Nome.isEmpty())break;
            System.out.println("burro BURRO BURRO burro idiota BURRO");
        }
    }
}