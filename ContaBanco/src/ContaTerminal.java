import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String agencia, nomeCliente;
        double saldo;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da Agência");
        agencia = scanner.next();
        System.out.println("Por favor, o Número da Conta");
        numeroConta = scanner.nextInt();
        System.out.println("Por favor, Digite o nome do cliente");
        nomeCliente = scanner.next();
        System.out.println("Por favor, saldo da conta");
        saldo = scanner.nextDouble();
        

        String retorno = "Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta " +numeroConta+" e seu saldo R$ "+ saldo+ " já está disponível para saque";
        System.out.println(retorno);

    }
}
