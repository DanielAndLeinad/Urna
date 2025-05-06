
package urna;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Partido p1 = new Partido("Partido da Liberdade", "PL");
        Partido p2 = new Partido("Partido do Progresso", "PP");

        Candidato c1 = new Candidato("Ana", 11, p1);
        Candidato c2 = new Candidato("Bruno", 22, p2);

        Urna urna = new Urna();
        urna.adicionarCandidato(c1);
        urna.adicionarCandidato(c2);

        Mesario mesario = new Mesario("Carlos", "00000000000");
        Eleitor eleitor = new Eleitor("João", "11111111111");

        mesario.identificarEleitor(eleitor);

        urna.gerarZeresima();

        Scanner sc = new Scanner(System.in);

        while (!eleitor.hasVotado()) {
            urna.exibirCandidatos();
            System.out.print("Digite o número do candidato: ");
            int num = sc.nextInt();
            urna.votar(num);
            eleitor.votar();
        }

        urna.boletimDeUrna();
        sc.close();
    }
}
