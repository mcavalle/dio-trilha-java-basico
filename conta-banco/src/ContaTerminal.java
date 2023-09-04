import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite o número da agência: ");
        String agencia = sc.nextLine();

        System.out.println("Digite o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Informe o saldo inicial: ");
        float saldo = sc.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
