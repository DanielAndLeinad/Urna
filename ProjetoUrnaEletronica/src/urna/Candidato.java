package urna;

import java.time.LocalDate;

public class Candidato extends Pessoa {
    private int numero;
    private Partido partido;
    private int votos;

    public Candidato(String nome, String cpf, String rg, String endereco, String telefone,
                     String municipio, String nacionalidade, String nomeMae,
                     LocalDate dataNascimento, int numero, Partido partido) {
        super(nome, cpf, rg, endereco, telefone, municipio, nacionalidade, nomeMae, dataNascimento);
        this.numero = numero;
        this.partido = partido;
        this.votos = 0;
    }

    public void receberVoto() {
        votos++;
    }

    public int getVotos() {
        return votos;
    }

    public int getNumero() {
        return numero;
    }

    public Partido getPartido() {
        return partido;
    }
}
