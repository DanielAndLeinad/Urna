
package urna;

public class Mesario extends Pessoa {
    public Mesario(String nome, String cpf) {
        super(nome, cpf);
    }

    public void identificarEleitor(Eleitor eleitor) {
        System.out.println("Eleitor " + eleitor.getNome() + " identificado.");
    }
}
