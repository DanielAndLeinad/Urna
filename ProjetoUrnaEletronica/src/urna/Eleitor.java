
package urna;

public class Eleitor extends Pessoa {
    private boolean votou;

    public Eleitor(String nome, String cpf) {
        super(nome, cpf);
        this.votou = false;
    }

    public boolean hasVotado() {
        return votou;
    }

    public void votar() {
        this.votou = true;
    }
}
