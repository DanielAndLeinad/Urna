package urna;

import java.time.LocalDate;

public class Eleitor extends Pessoa {
    private boolean votou;
    private String tituloEleitor;

    public Eleitor(String nome, String cpf, String rg, String endereco, String telefone,
                   String municipio, String nacionalidade, String nomeMae,
                   LocalDate dataNascimento, String tituloEleitor) {
        super(nome, cpf, rg, endereco, telefone, municipio, nacionalidade, nomeMae, dataNascimento);
        this.tituloEleitor = tituloEleitor;
        this.votou = false;
    }

    public boolean hasVotado() {
        return votou;
    }

    public void votar() {
        this.votou = true;
    }

    public String getTituloEleitor() {
        return tituloEleitor;
    }

    public void setTituloEleitor(String tituloEleitor) {
        this.tituloEleitor = tituloEleitor;
    }
}
