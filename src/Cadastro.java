import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá Bem-vindo ao Cadastro da Loja!");
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine().toUpperCase();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine().toUpperCase();

        System.out.println("Olá " + nome + " " + sobrenome + " Digite seu email:");
        String email = scanner.nextLine().toUpperCase();
        System.out.println("Seu email é: " + email + "? Digite (S) para Sim e (N) para Não.");
        String respostaEmail = scanner.nextLine().toUpperCase();
        if (respostaEmail.equals("S")) {
            System.out.println("Email " + email + " cadastrado!");
        } else if (respostaEmail.equals("N")) {
            System.out.println("Digite novamente seu email!");
            email = scanner.nextLine().toUpperCase();
            System.out.println("Email " + email + " cadastrado!");
        } else {
            System.out.println("Resposta inválida!");
        }

        System.out.println("Digite sua senha:");
        String senha = scanner.nextLine().toUpperCase();
        System.out.println("Senha Cadastrada!");
        System.out.println("Perfil Cadastrado! Obrigado pelas informações. Fique à vontade para olhar a loja! Boas compras!");
    }
}
