import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o saldo atual:");
        double saldoAtual = scanner.nextDouble();
        System.out.println("Informe o valor do depósito:");
        double valorDeposito = scanner.nextDouble();
        System.out.println("Informe o valor do saque:");
        double valorRetirada = scanner.nextDouble();

       //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
       saldoAtual = saldoAtual + valorDeposito - valorRetirada;

     //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
     System.out.printf("Saldo atualizado na conta: %.1f", saldoAtual);

     scanner.close();
    }
}