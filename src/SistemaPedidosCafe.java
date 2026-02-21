import java.util.Scanner;

public class SistemaPedidosCafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-Vindo ao Café do Java!");
        System.out.println("Para finalizar aperte (F)!");

        double valorTotal = 0;
        int quatidadeCafes = 0;
        boolean continuarPedido = true;

        while (continuarPedido) {
            System.out.println("Escolha o tamanho do seu Café: (P) Pequeno (R$2,50), (M) Médio (R$3,00), (G) Grande (R$3,50).");
            String tamanhoCafe = scanner.nextLine().toUpperCase();

            if (tamanhoCafe.equals("F")) {
                continuarPedido = false;
            } else {
                System.out.println("Escolha o tipo do seu café: (E) Expresso (R$1,50), (C) Cappuccino R$(2,00), (L) Latte (R$2,50).");
                String tipoCafe = scanner.nextLine().toUpperCase();

                double preco = 0;

                switch (tamanhoCafe) {
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
                        continue;
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
                        continue;
                }

                valorTotal += preco;
                quatidadeCafes++;

                System.out.println("Café adicionado ao pedido!");
            }
        }

        System.out.println("Seu pedido foi finalizado. Total a pagar: R$" + valorTotal);
        System.out.println("Quantidade de cafés pedidos: " + quatidadeCafes);
        scanner.close();
    }
}
