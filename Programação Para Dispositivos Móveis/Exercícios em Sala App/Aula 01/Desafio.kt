fun main() {

    var nomes = arrayOf(
            "Alexa Martins Almeida",
            "Pedro Silva Pereira",
            "Lucas Oliveira Souza",
            "Maria Santos Rodrigues",
            "Isabella Ferreira Lima",
            "João Pereira Ribeiro",
            "Gabriel Alves Cardoso",
            "Laura Gonçalves Santos",
            "André Fernandes Mendes",
            "Beatriz Costa Almeida",
            "Matheus Rodrigues Souza",
            "Ana Martins Silva",
            "Leonardo Ribeiro Oliveira",
            "Clara Almeida Pereira",
            "Enzo Cardoso Martins",
            "Luiza Silva Rodrigues",
            "Rafael Alves Pereira",
            "Gustavo Fernandes Santos",
            "Carolina Gonçalves Ferreira",
            "João Pereira Ribeiro",
            "Lucas Fernandes Lima",
            "Manuela Almeida Costa",
            "Miguel Lima Alves",
            "Sofia Martins Santos",
            "Davi Rodrigues Pereira"
    )
    val sexos = arrayOf(
            "Feminino",
            "Masculino",
            "Masculino",
            "Feminino",
            "Feminino",
            "Masculino",
            "Masculino",
            "Feminino",
            "Masculino",
            "Feminino",
            "Masculino",
            "Feminino",
            "Masculino",
            "Feminino",
            "Masculino",
            "Feminino",
            "Masculino",
            "Masculino",
            "Feminino",
            "Masculino",
            "Masculino",
            "Feminino",
            "Masculino",
            "Feminino",
            "Masculino"
    )
    var idades =
            arrayOf(19, 65, 34, 72, 18, 28, 59, 44, 27, 76, 18, 18, 61, 22, 56, 32, 73, 18, 16, 67, 41, 70, 30, 57, 24)
    var salarios = arrayOf(
            2500,
            3200,
            1800,
            4200,
            2900,
            5500,
            3800,
            4700,
            2100,
            3600,
            2800,
            5000,
            3400,
            4400,
            2600,
            4000,
            3100,
            2300,
            4700,
            3300,
            2700,
            4900,
            3500,
            2000,
            4100
    )
    var cargos = arrayOf(
            "Gerente de Vendas",
            "Diretor",
            "Desenvolvedor de Software",
            "Assistente Administrativo",
            "Engenheiro de Projetos",
            "Designer Gráfico",
            "Contador Financeiro",
            "Especialista em Recursos Humanos",
            "Consultor de Negócios",
            "Enfermeiro(a) Clínico(a)",
            "Analista de Dados",
            "Coordenador de Logística",
            "Gerente de Operações",
            "Assistente de Atendimento ao Cliente",
            "Médico(a) Generalista",
            "Professor(a) de Inglês",
            "Analista de Finanças",
            "Arquiteto(a) de Interiores",
            "Analista de Suporte Técnico",
            "Jornalista Freelancer",
            "Diretor",
            "Técnico de Laboratório",
            "Consultor de Segurança Cibernética",
            "Engenheiro de Qualidade",
            "Diretor"
    )

    var MulherMaisVelha = idades.get(0)
    var NomeMulher = ""

    for(i in 1..25-1){
        if(sexos.get(i).equals("Feminino") && idades.get(i) < MulherMaisVelha){
            MulherMaisVelha = idades.get(i)
        }


    }


}