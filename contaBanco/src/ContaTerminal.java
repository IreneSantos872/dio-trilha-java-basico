import java.util.Scanner;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);
       //Exibir as mensagens para o nosso usuário
        System.out.print("Por favor informe o numero da conta: ");
        //Obter pela scanner os valores digitados no terminal
        Integer numero = scanner.nextInt();

        System.out.println("Por favor, digite o numero da agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo ");
        Double saldo = scanner.nextDouble();

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco," +
        "sua agência é " + agencia + " conta "+ numero + " e seu saldo " + saldo + " já está disponivel para saque.");
        scanner.close();
    }
}
