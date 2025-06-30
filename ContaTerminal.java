import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite o seu número da Conta: ");
        var numero = scanner.nextInt();
        System.out.println("Digite o número da Agencia: ");
        var agencia = scanner.next();
        System.out.println("Digite o seu nome: ");
        var nomeCliente = scanner.next();
        System.out.println("Informe o seu saldo: ");
        var saldo = scanner.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque \n", numero, agencia, nomeCliente, saldo);
        
        scanner.close();

    }
}

