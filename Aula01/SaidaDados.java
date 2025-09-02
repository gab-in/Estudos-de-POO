package Aula01;

public class SaidaDados {
    public static void main(String[] homossexualismo){
        /*
        * Isso aqui é só para demonstrar que a parte do "println" substitui o \n (Usado no C)
        * Você pode usar sim \n, mas é cringe e não tem para que (palavras do professor)
        */
        System.out.print("Esse aqui não quebra linha olha que legal");
        System.out.println("Lula Livre");
        System.out.println("Bolsonaro preso");

        /*
        * Olha a declaração de variável que legal
        */
        String nome = "Luiz Inácio Lula da Silva";
        int idade = 999999;
        double peso = 0.000001;

        System.out.println("Meu presidente:\nNome: "+nome+"\nIdade: "+idade+"\nPeso: "+peso+"KG");

        /*
        * Mais um teste bem legal só para a gente pensar, é MESMA coisa de cima mas engual C
        * Só não é muito usado tlgd
         */
        System.out.printf("Meu presidente:\nNome: %s\nIdade: %d\nPeso: %fKG\n",nome,idade,peso);

        /*
        * String.format()
        * Nem te conto o que que isso faz... Ele formata... String...... UAAAAUUUUU, EU SEI EU SEI QUE INCRIVEL
         */
        System.out.println("Para para pensar "+String.format("%.2f",peso));
    }
}
