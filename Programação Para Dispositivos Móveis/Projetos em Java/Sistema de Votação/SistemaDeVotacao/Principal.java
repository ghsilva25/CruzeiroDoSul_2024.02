// Classe Principal
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SistemaVotacao sistema = new SistemaVotacao();

        while (true) {
            System.out.println("Menu: ");
            System.out.println("1 - Criar Partido");
            System.out.println("2 - Criar Candidato");
            System.out.println("3 - Votar");
            System.out.println("4 - Exibir Resultados");
            System.out.println("5 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do partido: ");
                    String nomePartido = scanner.nextLine();
                    System.out.println("Digite o número do partido (2 dígitos): ");
                    int numeroPartido = scanner.nextInt();
                    scanner.nextLine();
                    Partido partido = new Partido(nomePartido, numeroPartido);
                    sistema.adicionarPartido(partido);
                    System.out.println("Partido " + nomePartido + " criado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o nome do candidato: ");
                    String nomeCandidato = scanner.nextLine();
                    System.out.println("Digite o número do candidato: ");
                    int numeroCandidato = scanner.nextInt();
                    scanner.nextLine();
                    Candidato candidato = new Candidato(nomeCandidato, numeroCandidato);
                    sistema.adicionarCandidato(candidato);
                    System.out.println("Candidato " + nomeCandidato + " criado com sucesso!");
                    break;
                case 3:
                    System.out.println("Digite o número do candidato para votar: ");
                    int numeroVotoCandidato = scanner.nextInt();
                    sistema.votar(numeroVotoCandidato);
                    break;
                case 4:
                    sistema.exibirResultados();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}