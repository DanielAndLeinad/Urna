// MARCOS E FLAVIANE

package urna;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Mesario mesario = new Mesario("Carlos", "00000000000");

        System.out.println("Digite os dados do eleitor:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("RG: ");
        String rg = sc.nextLine();

        System.out.print("Endereço: ");
        String endereco = sc.nextLine();

        System.out.print("Telefone: ");
        String telefone = sc.nextLine();

        System.out.print("Município: ");
        String municipio = sc.nextLine();

        System.out.print("Nacionalidade: ");
        String nacionalidade = sc.nextLine();

        System.out.print("Nome da mãe: ");
        String nomeMae = sc.nextLine();

        System.out.print("Data de nascimento (dd/MM/yyyy): ");
        LocalDate dataNascimento = LocalDate.parse(sc.nextLine(), dtf);

        Eleitor eleitor = new Eleitor(nome, cpf, rg, endereco, telefone, municipio, nacionalidade, nomeMae, dataNascimento);

        mesario.identificarEleitor(eleitor);

        Partido p1 = new Partido("Partido da Liberdade", "PL");
        Partido p2 = new Partido("Partido do Progresso", "PP");

        Candidato c1 = new Candidato("Ana", "33333333333", "1234567", "Rua C", "11988887777",
                "São Paulo", "Brasileira", "Clara", LocalDate.of(1990, 1, 10), 11, p1);

        Candidato c2 = new Candidato("Bruno", "44444444444", "7654321", "Rua D", "11977776666",
                "São Paulo", "Brasileiro", "Helena", LocalDate.of(1988, 6, 20), 22, p2);

        Urna urna = new Urna();
        urna.adicionarCandidato(c1);
        urna.adicionarCandidato(c2);

        urna.gerarZeresima();

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
