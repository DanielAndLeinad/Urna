// LUCAS E FLAVIANE
package urna;

import java.time.LocalDate;

public class Eleitor extends Pessoa {
    private boolean votou;

    public Eleitor(String nome, String cpf, String rg, String endereco, String telefone,
                   String municipio, String nacionalidade, String nomeMae, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, telefone, municipio, nacionalidade, nomeMae, dataNascimento);
        this.votou = false;
    }

    public boolean hasVotado() {
        return votou;
    }

    public void votar() {
        this.votou = true;
    }
}
