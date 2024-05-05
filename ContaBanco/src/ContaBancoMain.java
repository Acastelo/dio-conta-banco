import java.util.Locale;
import java.util.Scanner;

public class ContaBancoMain {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        Conta conta = new Conta();

        System.out.println("Digite o número");
        conta.setNumero(scanner.nextInt());

        System.out.println("Digite a agencia");
        conta.setAgencia(scanner.next());

        System.out.println("Digite o nome do cliente");
        conta.setNomeCliente(scanner.next());

        System.out.println("Digite o saldo");
        conta.setSaldo(scanner.nextDouble());

        System.out.println("Número: " + conta.getNumero());
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Nome Cliente: " + conta.getNomeCliente());
        System.out.println("Saldo: " + conta.getSaldo());


    }
}