// FLAVIANE, MARCOS E LUCAS

package urna;

import java.time.LocalDate;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String rg;
    protected String endereco;
    protected String telefone;
    protected String municipio;
    protected String nacionalidade;
    protected String nomeMae;
    protected LocalDate dataNascimento;

    public Pessoa(String nome, String cpf, String rg, String endereco, String telefone,
                  String municipio, String nacionalidade, String nomeMae, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.telefone = telefone;
        this.municipio = municipio;
        this.nacionalidade = nacionalidade;
        this.nomeMae = nomeMae;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}
