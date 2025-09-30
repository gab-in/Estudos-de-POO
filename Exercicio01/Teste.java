package Exercicio01;

public class Teste {
    public static void main(String[] args){
        Funcionarios fun1= new Funcionarios("Gabriel Covalski","08/08/2006",
                                        'm',"TI",99828603,
                                        "Doutor Washington Subtil Chueire",
                                        "Jardim Carvalho","Ponta Grossa",
                                        "PR");
        fun1.emitirRelatorio();

        fun1.setSetor("Viadagem aguda");

        fun1.emitirRelatorio();

        fun1.setTelefone(69420);

        fun1.emitirRelatorio();

    }
}
