import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o seu primero nome:");
        String nomeCliente = scanner.next();

        System.out.println("Digite o seu ultimo nome:");
        String ultimoNomeCliente = scanner.next();
        
        System.out.println("Digite o número da agência:");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o saldo da conta:");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " " + ultimoNomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + numeroAgencia + ", conta: " + numeroConta + " e seu saldo: R$" + saldoConta + " já está disponível para saque.");
    }
}
