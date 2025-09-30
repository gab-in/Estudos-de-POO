package Exercicio01;

public class Funcionarios {
    //Não necessariamente precisava ser tudo private, mas isso aqui ajuda a ter uma ideia só
    static int registrosTotais;

    private int registro;
    private String nome;
    private String nasc;
    private char sexo;
    private String setor;
    private int telefone;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;


    Funcionarios(String nome, String nasc, char sexo, String setor, int telefone, String rua,
                 String bairro, String cidade, String estado){ //método construtor
        //Inicialização de todos os atributos de funcionário
        registrosTotais++;
        registro=registrosTotais;

        //Eu tinha esquecido de por this., tem que lembrar para todas as instancias
        this.nome=nome;
        this.nasc=nasc;
        this.sexo=sexo;
        this.setor=setor;
        this.telefone=telefone;
        this.rua=rua;
        this.bairro=bairro;
        this.cidade=cidade;
        this.estado=estado;
    }

    //Métodos de get
    public String getNome(){return nome;}
    public String getNasc(){return nasc;}
    public char getSexo(){return sexo;}
    public String getSetor(){return setor;}
    public int getTelefone(){return telefone;}
    public String getRua(){return rua;}
    public String getBairro(){return bairro;}
    public String getCidade(){return cidade;}
    public String getEstado(){return estado;}

    //Métodos de set (os dois permitidos pelo exercicio)
    public void setSetor(String setor){this.setor=setor;} //VERDADE, lembra de usar this.
    public void setTelefone(int telefone){this.telefone=telefone;}

    public void emitirRelatorio(){
        System.out.println("Registro: "+this.registro+
                            "Nome: "+this.nome+
                            "Data de Nascimento: "+this.nasc+
                            "Sexo: "+this.sexo+
                            "Setor: "+this.setor+
                            "Telefone: "+this.telefone+
                            "Endereço: "+this.rua+","+this.bairro+","+this.cidade+","+this.estado);
    }
}
