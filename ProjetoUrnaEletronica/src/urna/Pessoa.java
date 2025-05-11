// FLAVIANE, MARCOS E LUCAS

package urna;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private String telefone;
    private String municipio;
    private String nacionalidade;
    private String nomeMae;
    private LocalDate dataNascimento;

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

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getRg() { return rg; }
    public void setRg(String rg) { this.rg = rg; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getMunicipio() { return municipio; }
    public void setMunicipio(String municipio) { this.municipio = municipio; }

    public String getNacionalidade() { return nacionalidade; }
    public void setNacionalidade(String nacionalidade) { this.nacionalidade = nacionalidade; }

    public String getNomeMae() { return nomeMae; }
    public void setNomeMae(String nomeMae) { this.nomeMae = nomeMae; }

    public LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }
}
