import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da conta");
        int numero = scanner.nextInt();
        

        System.out.println("Digite o numero da agencia");
        scanner.nextLine();
        String agencia = scanner.next();        

        System.out.println("Digite o seu nome");
        String nomeCliente = scanner.next();
        nomeCliente = nomeCliente + scanner.nextLine();
        System.out.println("Digite o saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
        
    }
}
