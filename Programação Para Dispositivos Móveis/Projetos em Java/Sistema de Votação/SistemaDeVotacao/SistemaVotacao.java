// Classe SistemaVotacao
import java.util.List;
import java.util.ArrayList;

public class SistemaVotacao {

    private List<Candidato> candidatos;
    private List<Partido> partidos;

    public SistemaVotacao() {
        this.candidatos = new ArrayList<>();
        this.partidos = new ArrayList<>();
    }

    public void adicionarPartido(Partido partido) {
        this.partidos.add(partido);
    }

    public void adicionarCandidato(Candidato candidato) {
        this.candidatos.add(candidato);
    }

    public Partido buscarPartidoPorNumero(int numero) {
        for (Partido partido : partidos) {
            if (partido.getNumero() == numero)
                return partido;
        }
        return null;
    }

    public void votar(int numeroCandidato) {
        boolean candidatoEncontrado = false;

        if (numeroCandidato >= 10 && numeroCandidato <= 99) { // Prefeito
            for (Candidato candidato : candidatos) {
                if (candidato.getNumero() == numeroCandidato) {
                    candidato.adicionarVoto();
                    System.out.println("Voto registrado para " + candidato.getNome() + " (Prefeito)");
                    candidatoEncontrado = true;
                    break;
                }
            }
        } else if (numeroCandidato >= 10000 && numeroCandidato <= 99999) { // Vereador
            int numeroPartido = numeroCandidato / 1000; // Extraindo os dois primeiros dígitos
            Partido partido = buscarPartidoPorNumero(numeroPartido);

            for (Candidato candidato : candidatos) {
                if (candidato.getNumero() == numeroCandidato) {
                    candidato.adicionarVoto();
                    if (partido != null) {
                        partido.adicionarVoto();
                    }
                    System.out.println("Voto registrado para " + candidato.getNome() + " (Vereador) do partido " + partido.getNome());
                    candidatoEncontrado = true;
                    break;
                }
            }
        }

        if (!candidatoEncontrado) {
            System.out.println("Candidato não encontrado!");
        }
    }

    public void exibirResultados() {
        if (candidatos.isEmpty()) {
            System.out.println("Nenhum candidato cadastrado!");
        }

        Candidato candidatoVencedor = candidatos.get(0);
        Partido partidoVencedor = partidos.get(0);

        for (Candidato candidato : candidatos) {
            if (candidato.getVotos() > candidatoVencedor.getVotos()) {
                candidatoVencedor = candidato;
            }
        }

        for (Partido partido : partidos) {
            if (partido.getVotos() > partidoVencedor.getVotos()) {
                partidoVencedor = partido;
            }
        }

        System.out.println("Candidato vencedor: " + candidatoVencedor.getNome() + " com " + candidatoVencedor.getVotos() + " votos.");
        System.out.println("Partido com mais votos: " + partidoVencedor.getNome() + " com " + partidoVencedor.getVotos() + " votos.");
    }
}
