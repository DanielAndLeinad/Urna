// LUCAS
package urna;

import java.util.ArrayList;

public class Urna {
    private ArrayList<Candidato> candidatos;

    public Urna() {
        candidatos = new ArrayList<>();
    }

    public void adicionarCandidato(Candidato c) {
        candidatos.add(c);
    }

    public void exibirCandidatos() {
        System.out.println("Candidatos disponíveis:");
        for (Candidato c : candidatos) {
            System.out.println("Número: " + c.getNumero() + " - " + c.getNome() + " (" + c.getPartido().getSigla() + ")");
        }
    }

    public void votar(int numero) {
        for (Candidato c : candidatos) {
            if (c.getNumero() == numero) {
                c.receberVoto();
                System.out.println("Voto registrado para " + c.getNome());
                return;
            }
        }
        System.out.println("Número inválido!");
    }

    public void gerarZeresima() {
        System.out.println("Zerésima da urna:");
        for (Candidato c : candidatos) {
            System.out.println(c.getNome() + ": 0 votos");
        }
    }

    public void boletimDeUrna() {
        System.out.println("Boletim de urna:");
        for (Candidato c : candidatos) {
            System.out.println(c.getNome() + ": " + c.getVotos() + " votos");
        }
    }
}
