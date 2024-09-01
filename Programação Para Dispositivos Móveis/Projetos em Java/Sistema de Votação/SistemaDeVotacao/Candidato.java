// Classe Candidato
public class Candidato implements Votavel {
    private String nome;
    private int numero; // Número do candidato
    private int votos;

    public Candidato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.votos = 0;
    }

    @Override
    public void adicionarVoto() {
        this.votos++;
    }

    @Override
    public int getVotos() {
        return this.votos;
    }

    public String getNome() {
        return this.nome;
    }

    public int getNumero() {
        return this.numero;
    }
}