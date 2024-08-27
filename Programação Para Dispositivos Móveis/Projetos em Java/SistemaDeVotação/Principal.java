import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SistemaVotacao sistema = new SistemaVotacao();

        while (true){
            System.out.println("Menu: ");
            System.out.println("1. Criar Partido");
            System.out.println("2. Criar Candidato");
            System.out.println("3. Votar");
            System.out.println("4. Exibir Resultados");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Informe o nome do Partido: ");
                    String nomePartido = scanner.nextLine();
                    Partido partido = new Partido(nomePartido);
                    sistema.adicionarPartido(partido);
                    System.out.println("Partido " + nomePartido + " criado com sucesso!");
                    break;

                case 2:
                    System.out.println("Informe o nome do candidato: ");
                    String nomeCandidato = scanner.nextLine();
                    System.out.println("Informe o nome do partido do candidato: ");
                    String nomePartidoCandidato = scanner.nextLine();
                    System.out.println("Informe o número do candidato: ");
                    int numeroCandidato = scanner.nextInt();
                    scanner.nextInt();

                    Partido partidoCandidato = sistema.buscarPartidoPorNome(nomePartidoCandidato);

                    if(partidoCandidato != null){

                        Candidato candidato = new Candidato(nomeCandidato, partidoCandidato, numeroCandidato);

                        sistema.adicionarCandidato(candidato);
                        System.out.println("Candidato " + nomeCandidato + " foi criado com sucesso!");

                    } else {
                        System.out.println("Partido não encontrado. " + "Crie o partido primeiro");
                }

                    break;

                case 3:
                    System.out.println("Informe o número do candidato para votar: ");

                    int numeroVotoCandidato = scanner.nextInt();
                    sistema.votar(numeroVotoCandidato);
                    break;

                case 4:
                    sistema.exibirResultados();
                    break;

                case 5:
                    System.out.println("Saindo ...");
                    scanner.close();

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }


        }

    }

}
