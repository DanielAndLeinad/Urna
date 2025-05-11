package urna;

import java.time.LocalDate;

public class Mesario extends Pessoa {
    public Mesario(String nome, String cpf, String rg, String endereco, String telefone,
                   String municipio, String nacionalidade, String nomeMae, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, telefone, municipio, nacionalidade, nomeMae, dataNascimento);
    }

    public void identificarEleitor(Eleitor eleitor) {
        System.out.println("Eleitor " + eleitor.getNome() + " identificado.");
    }
}
