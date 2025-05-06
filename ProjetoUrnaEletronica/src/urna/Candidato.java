
package urna;

public class Candidato {
    private String nome;
    private int numero;
    private Partido partido;
    private int votos;

    public Candidato(String nome, int numero, Partido partido) {
        this.nome = nome;
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

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public Partido getPartido() {
        return partido;
    }
}
