public class Candidato implements Votavel{

    // tipo a esquerda e o nome a direita:
    private String nome;
    private Partido partido;

    private int num;

    private int votos;


    public Candidato(String nome, Partido partido, int num){
        this.nome = nome;
        this.partido = partido;
        this.num = num;
        this.votos = 0;

    }

    @Override
    public void adicionarVoto(){

        this.votos++;
        this.partido.adicionarVoto();

    }

    @Override

    public int getVotos() { return this.votos; }

    public String getNome() { return this.nome; }

    public Partido getPartido() { return this.partido; }

    public int getNumero() { return this.getNumero(); }


}
