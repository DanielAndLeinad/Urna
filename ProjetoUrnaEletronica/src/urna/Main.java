// MARCOS E FLAVIANE

package urna;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Partido p1 = new Partido("Partido da Liberdade", "PL");
        Partido p2 = new Partido("Partido do Progresso", "PP");

        Candidato c1 = new Candidato(
        	    "Ana", "33333333333", "1234567", "Rua C, 123", "11988887777",
        	    "São Paulo", "Brasileira", "Clara", LocalDate.of(1990, 1, 10), 11, p1
        	);

        Candidato c2 = new Candidato(
        	    "Bruno", "44444444444", "7654321", "Rua D, 456", "11977776666",
        	    "São Paulo", "Brasileiro", "Helena", LocalDate.of(1988, 6, 20), 22, p2
        	);

        Urna urna = new Urna();
        urna.adicionarCandidato(c1);
        urna.adicionarCandidato(c2);

       
        Mesario mesario = new Mesario(
            "Carlos", "00000000000", "1234567", "Rua A, 123", "11999999999",
            "São Paulo", "Brasileiro", "Maria", LocalDate.of(1985, 5, 10)
        );

        Eleitor eleitor = new Eleitor(
            "João", "11111111111", "9876543", "Rua B, 456", "11888888888",
            "São Paulo", "Brasileiro", "Ana", LocalDate.of(2000, 3, 15), "123456789012"
        );

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
