import java.util.Scanner;

public class SistemaPedidosCafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-Vindo ao Café do Java!");
        System.out.println("Escolha o tamanho do seu Café: (P) Pequeno (R$2,50), (M) Médio (R$3,00), (G) Grande (R$3,50).");
        String tamanho = scanner.nextLine().toUpperCase();
        System.out.println("Escolha o tipo do seu café: (E) Expresso (R$1,50), (C) Cappuccino R$(2,00), (L) Latte (R$2,50).");
        String tipoCafe = scanner.nextLine().toUpperCase();

        double preco = 0;

        switch (tamanho) {
            case "P":
                preco += 2.50;
                break;
            case "M":
                preco += 3.00;
                break;
            case "G":
                preco += 3.50;
                break;
            default:
                System.out.println("Opção de tamanho inválida!");
                return;
        }

        switch (tipoCafe) {
            case "E":
                preco += 1.50;
                break;
            case "C":
                preco += 2.00;
                break;
            case "L":
                preco += 2.50;
                break;
            default:
                System.out.println("Opção do tipo de café inválida!");
                return;
        }
        System.out.println("Seu pedido foi confirmado!");
        System.out.println("Total a pagar: R$ " + preco);
    }

}
