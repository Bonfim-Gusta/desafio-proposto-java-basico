import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        /*TODO: Conhecer e importar a classe Scanner
                Exibir mensagens ao usuário
                Obter pelo scanner os valores digitados pelo terminal
                Exibir mensagem da conta criada
         */

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Digite sua agência:");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo +
                " já está disponível para saque");

    }
}