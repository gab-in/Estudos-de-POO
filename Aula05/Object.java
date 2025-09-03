package Aula05;

/*
* Convenção de organização de código adotada pelo professor:
* 1. Atributos
* 2. Construtores
* 3. Métodos
* 4. toString
*/

public class Object {
    //final int intHash = 24; //Faz a mesma coisa que #define em C
    private static int totalObjectCount;
    private int objectId;
    String objectName;
    private int k;

    /*
    * Tá vendo que tem dois construtores? Isso se chama Sobrecarga ou Overload de construtores
    * Isso serve para pegar várias exceptions digamos assim
    * Tipo, uma mesma classe pode ser chamada de formas diferentes, e ser tratada de acordo com essas diferenças
    */
    Object(){
        //Esse construtor sem parâmetros tá chamando o com parâmetros dando um valor tratado de forma diferente
        this(null, 0);
        //Inclusive, "this" funciona da mesma forma que você leu na documentação do GML na época
    }

    Object(String objectName, int k){ //Parâmetros e atributos tem mesmo nome por convenção
        this.objectName=objectName; //Utilizar "this." não é necessário, mas é uma boa prática
        this.k=k;

        totalObjectCount++;
        this.objectId=totalObjectCount;
    }
    /*
    * Debug Outputs
    */
    public void keyQuery(){
        System.out.println(k);
    }

    public void callbackPing(){
        System.out.println("Currently pinging id: "+objectId);
    }

    public void totalPing(){
        System.out.println("Pinging a total of "+totalObjectCount+" objects");
    }

    //public void metodoPrimeiro(){ System.out.println("Numero: "+atributteInt);}
    //public void metodoSegundo(){ System.out.println("Palavra: "+atributteString); }
    public String toString(){
        return "Nome: "+objectName;
    }
}
