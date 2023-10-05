import java.util.List;

public class Professor extends Pessoa {
    private List<Orientacao> listaDeOrientacoesEstudante;

    public Professor(int pessoaId, String pessoaNome, String pessoaEndereco, String pessoaTelefone,
            List<Orientacao> listaDeOrientacoesEstudante) {
        super(pessoaId, pessoaNome, pessoaEndereco, pessoaTelefone);
        this.listaDeOrientacoesEstudante = listaDeOrientacoesEstudante;
    }

    public void orientarTrabalho() {
        // Aqui você pode acessar e exibir a listaDeOrientacoesEstudante
        if (listaDeOrientacoesEstudante != null && !listaDeOrientacoesEstudante.isEmpty()) {
            System.out.println("Lista de Orientações da Classe Estudante:");
            for (Orientacao orientacao : listaDeOrientacoesEstudante) {
                System.out.println("Trabalho: " + orientacao.getTrabalho());
                System.out.println("Dúvida: " + orientacao.getOrientacao());
                System.out.println("---------------------------");
            }
        } else {
            System.out.println("Não há orientações disponíveis.");
        }
    }
}