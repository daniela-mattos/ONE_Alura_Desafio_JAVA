import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Mitsy Mattos";
        String conta = "corrente";
        double saldo = 2500.00;
        int opcao = 0;
        String menu = """
                    Escolha uma das Operações:
                        1 - Consultar saldo
                        2 - Receber valor
                        3 - Transferir valor
                        4 - Sair
                    """;

        System.out.println("*-=---------------------------=-*");
        System.out.println("Dados iniciais do cliente:\n");
        System.out.println(String.format("Nome: %s", nome));
        System.out.println(String.format("Conta: %s", conta));
        System.out.println(String.format("Saldo inicial: R$%.2f", saldo));
        System.out.println("*-=---------------------------=-*\n");

        do {
            System.out.println(menu);
            Scanner leitura = new Scanner(System.in);
            System.out.println("\nDigite a opção desejada: ");
            opcao = leitura.nextInt();

            if (opcao < 1 || opcao > 4 ) {
                System.out.println("Opção inválida!\n");
            } else {
                switch (opcao) {
                    case 1: {
                        System.out.println("*-=---------------------------=-*");
                        System.out.println(String.format("O saldo é: R$%.2f", saldo));
                        System.out.println("*-=---------------------------=-*\n");
                        break;
                    }
                    case 2: {
                        System.out.println("Informe o valor a depositar: ");
                        double valor = leitura.nextDouble();
                        saldo += valor;
                        System.out.println("*-=---------------------------=-*");
                        System.out.println("Saldo atualizado: " + saldo);
                        System.out.println("*-=---------------------------=-*\n");
                        break;
                    }
                    case 3: {
                        System.out.println("Informe o valor a transferir: ");
                        double valor = leitura.nextDouble();
                        if (valor > saldo) {
                            System.out.println("*-=---------------------------=-*");
                            System.out.println("Transferência não pode ser realizada.");
                            System.out.println("Saldo atualizado: " + saldo);
                            System.out.println("*-=---------------------------=-*\n");
                        } else {
                            saldo -= valor;
                            System.out.println("*-=---------------------------=-*");
                            System.out.println("Saldo atualizado: " + saldo);
                            System.out.println("*-=---------------------------=-*\n");
                        }
                        break;
                    }
                }
            }
        } while (opcao != 4 );

    }
}