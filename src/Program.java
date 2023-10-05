import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolhaUsuario;

        while (true) {
            System.out.println("Selecione o tipo de usuário:");
            System.out.println("1. Estudante");
            System.out.println("2. Professor");
            System.out.println("3. Sair");

            System.out.print("Escolha uma opção: ");
            escolhaUsuario = sc.nextInt();
            sc.nextLine();

            if (escolhaUsuario == 1) {
                Estudante estudante = new Estudante(1, "Nome do Estudante", "Endereço", "Telefone");
                estudante.menuEstudante();
                
            } else if (escolhaUsuario == 2) {
                Professor professor = new Professor(escolhaUsuario, null, null, null, null);
               professor.orientarTrabalho();
            } else if (escolhaUsuario == 3) {
                System.out.println("Encerrando o programa.");
                break; 
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        sc.close();
    }
}
