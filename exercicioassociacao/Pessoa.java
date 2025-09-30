package exercicioassociacao;

import java.sql.SQLOutput;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String sexo;
    private String email;
    private String estadoCivil;
    private Endereco endereco; //Aqui a associação (Pessoa possui Endereço)

    Pessoa(String nome,String dataNascimento, String sexo,String email,String estadoCivil,
           String logradouro, int numero, String bairro, String cidade, String uf){
        //Cada construtor tem que inicializar seus respectivos atributos
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.email = email;
        this.estadoCivil = estadoCivil;

        //Olha aqui a incialização
        endereco =  new Endereco(logradouro,numero,bairro,cidade,uf);
    }

    public void imprimirDados(){
        //Código para retornar os dados
        System.out.println("Nome: "+this.nome+
                            "\nData de Nascimento: "+this.dataNascimento+
                            "\nSexo: "+this.sexo+
                            "\nEmail: "+this.email+
                            "\nEstado Civil: "+this.estadoCivil+
                            "\nLogradouro: "+endereco.getLogradouro()+
                            "\nNúmero: "+endereco.getNumero()+
                            "\nBairro: "+endereco.getBairro()+
                            "\nCidade: "+endereco.getCidade()+
                            "\nUF: "+endereco.getUf());
    }
}
