package ObjectClassOverload;

import java.util.Scanner;

public class    ObjectSolver {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        Object test = new Object();
        System.out.println(test);
        test.keyQuery();
        test.callbackPing();
        //test.metodoPrimeiro();
        //test.metodoSegundo();
        //System.out.println(test); //Isso aqui funciona graças ao metodo toString(), uma função para debug
        //sout faz o codigo gigante do print bem rapido

        System.out.println("\nPõe um nome ai:");
        String aux=input.nextLine();

        Object testTwo = new Object(aux,07);
        //Isso aqui é a forma do Java de instanciar um objeto


        test.keyQuery();
        input.nextLine();
        testTwo.keyQuery();
        input.nextLine();

        //Debug output
        testTwo.totalPing();
        System.out.println("Enter para continuar...");
        input.nextLine();

        //Mostrar um a um
        test.callbackPing();
        System.out.println(test);
        testTwo.callbackPing();
        System.out.println(testTwo);


    }
}
