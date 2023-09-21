import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o valor inicial:");
        double valorInicial = scanner.nextDouble();
        
        System.out.println("Informe a taxa de juros:");
        double taxaJuros = scanner.nextDouble();
        
        System.out.println("Informe o período:");
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;

        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        valorFinal = valorInicial * Math.pow(1 + taxaJuros, periodo);

        System.out.printf("Valor final do investimento: R$ %.2f", valorFinal);
        
        scanner.close();
    }
}