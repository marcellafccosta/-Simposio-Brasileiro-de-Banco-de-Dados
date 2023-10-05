import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estudante extends Pessoa {
    private Scanner scanner = new Scanner(System.in);
    private List<Trabalho> listaDeTrabalhos = new ArrayList<>();
    private List<Apresentacao> listaDeApresentacoes = new ArrayList<>();
    private List<Orientacao> listaDeOrientacoes = new ArrayList<>();
    private String resumo;
    private String titulo;

    public Estudante(int pessoaId, String pessoaNome, String pessoaEndereco, String pessoaTelefone) {
        super(pessoaId, pessoaNome, pessoaEndereco, pessoaTelefone);
    }

    public void menuEstudante() {
        System.out.println("Menu do estudante:");
        System.out.println("1. Adicionar trabalho.");
        System.out.println("2. Cadastrar trabalho para apresentacao.");
        System.out.println("3. Requisitar orientacao do professor.");
        System.out.println("4. Sair");

        System.out.print("Escolha uma opção: ");
        int escolha = scanner.nextInt();
        scanner.nextLine(); 

        switch (escolha) {
            case 1:
                adicionarTrabalho();
                break;
            case 2:
                apresentarTrabalho();
                break;
            case 3:
                requisitarOrientacao();
                break;
            case 4:
                System.out.println("Encerrando o programa.");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
    
    public void adicionarTrabalho() {
        System.out.print("Digite o título do trabalho: ");
        titulo = scanner.nextLine();
    
        System.out.print("Digite o resumo do trabalho: ");
        resumo = scanner.nextLine();
    
        Trabalho trabalho = new Trabalho(titulo, resumo);
        listaDeTrabalhos.add(trabalho);
    
        System.out.println("Trabalho adicionado com sucesso.");
        System.out.println("Deseja:");
        System.out.println("1. Cadastrar trabalho para apresentação.");
        System.out.println("2. Pedir orientação para o professor.");
        System.out.println("3. Sair.");
        System.out.print("Escolha uma opção: ");
        int escolha = scanner.nextInt();
        scanner.nextLine();
    
        if (escolha == 1) {
            if (listaDeTrabalhos.isEmpty()) {
                System.out.println("Nenhum trabalho disponível para apresentação.");
                return;
            }
    
            System.out.println("Trabalhos disponíveis para apresentação:");
            for (int i = 0; i < listaDeTrabalhos.size(); i++) {
                Trabalho trabalhoSelecionado = listaDeTrabalhos.get(i);
                System.out.println((i + 1) + ". Título: " + trabalhoSelecionado.getTitulo());
            }
    
            System.out.print("Digite o número do trabalho que deseja apresentar: ");
            int escolhaTrabalho = scanner.nextInt();
            scanner.nextLine();
    
            if (escolhaTrabalho >= 1 && escolhaTrabalho <= listaDeTrabalhos.size()) {
                Trabalho trabalhoSelecionado = listaDeTrabalhos.get(escolhaTrabalho - 1);
                listaDeApresentacoes.add(new Apresentacao(trabalhoSelecionado));
                System.out.println("Trabalho adicionado à lista de apresentações com sucesso.");
            } else {
                System.out.println("Escolha inválida. Nenhum trabalho foi adicionado à lista de apresentações.");
            }
        } else if (escolha == 2) {
            if (listaDeTrabalhos.isEmpty()) {
                System.out.println("Nenhum trabalho disponível para orientação.");
                return;
            }
    
            System.out.println("Trabalhos disponíveis para orientação:");
            for (int i = 0; i < listaDeTrabalhos.size(); i++) {
                Trabalho trabalhoSelecionado = listaDeTrabalhos.get(i);
                System.out.println((i + 1) + ". Título: " + trabalhoSelecionado.getTitulo());
            }
    
            System.out.print("Digite o número do trabalho para o qual deseja orientação: ");
            int escolhaTrabalho = scanner.nextInt();
            scanner.nextLine();
    
            if (escolhaTrabalho >= 1 && escolhaTrabalho <= listaDeTrabalhos.size()) {
                Trabalho trabalhoSelecionado = listaDeTrabalhos.get(escolhaTrabalho - 1);
    
                System.out.print("Digite sua dúvida (até 1000 caracteres): ");
                String duvida = scanner.nextLine();
    
                if (duvida.length() <= 1000) {
                    Orientacao orientacao = new Orientacao(trabalhoSelecionado, duvida);
                    listaDeOrientacoes.add(orientacao);
                    System.out.println("Orientação solicitada com sucesso.");
                } else {
                    System.out.println("A dúvida excede o limite de 1000 caracteres. Orientação não registrada.");
                }
            } else {
                System.out.println("Escolha inválida. Orientação não registrada.");
            }
        } else {
            System.out.println("Opção inválida.");
        }
    }
    

    public void apresentarTrabalho() {
        if (listaDeTrabalhos.isEmpty()) {
            System.out.println("Nenhum trabalho disponível para apresentação.");
            return;
        }

        System.out.println("Trabalhos disponíveis para apresentação:");
        for (int i = 0; i < listaDeTrabalhos.size(); i++) {
            Trabalho trabalho = listaDeTrabalhos.get(i);
            System.out.println((i + 1) + ". Título: " + trabalho.getTitulo());
        }

        System.out.print("Digite o número do trabalho que deseja apresentar: ");
        int escolhaTrabalho = scanner.nextInt();
        scanner.nextLine();

        if (escolhaTrabalho >= 1 && escolhaTrabalho <= listaDeTrabalhos.size()) {
            Trabalho trabalhoSelecionado = listaDeTrabalhos.get(escolhaTrabalho - 1);
            listaDeApresentacoes.add(new Apresentacao(trabalhoSelecionado));
            System.out.println("Trabalho adicionado à lista de apresentações com sucesso.");
        } else {
            System.out.println("Escolha inválida. Nenhum trabalho foi adicionado à lista de apresentações.");
        }
    }

    public void requisitarOrientacao() {
        if (listaDeTrabalhos.isEmpty()) {
            System.out.println("Nenhum trabalho disponível para orientação.");
            return;
        }

        System.out.println("Trabalhos disponíveis para orientação:");
        for (int i = 0; i < listaDeTrabalhos.size(); i++) {
            Trabalho trabalho = listaDeTrabalhos.get(i);
            System.out.println((i + 1) + ". Título: " + trabalho.getTitulo());
        }

        System.out.print("Digite o número do trabalho para o qual deseja orientação: ");
        int escolhaTrabalho = scanner.nextInt();
        scanner.nextLine();

        if (escolhaTrabalho >= 1 && escolhaTrabalho <= listaDeTrabalhos.size()) {
            Trabalho trabalhoSelecionado = listaDeTrabalhos.get(escolhaTrabalho - 1);

            System.out.print("Digite sua dúvida (até 1000 caracteres): ");
            String duvida = scanner.nextLine();

            if (duvida.length() <= 1000) {
                Orientacao orientacao = new Orientacao(trabalhoSelecionado, duvida);
                listaDeOrientacoes.add(orientacao);
                System.out.println("Orientação solicitada com sucesso.");
            } else {
                System.out.println("A dúvida excede o limite de 1000 caracteres. Orientação não registrada.");
            }
        } else {
            System.out.println("Escolha inválida. Orientação não registrada.");
        }
    }
    
     public List<Orientacao> getListaDeTrabalho() {
        return listaDeOrientacoes;
    }

    public List<Orientacao> getListaDeOrientacoes() {
        return listaDeOrientacoes;
    }
}