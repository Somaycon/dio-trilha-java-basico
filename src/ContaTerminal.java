import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args) throws  Exception{
        Scanner ler = new Scanner(System.in);
        int number;
        String agencia;
        String nome;
        double saldo;

        System.out.println("Digite o numero da sua conta: ");
        number = ler.nextInt();

        System.out.println("Digite o numero da sua agência:");
        agencia = ler.next();

        System.out.println("Informe seu nome:");
        nome = ler.next();

        System.out.println("Digite seu saldo:");
        saldo = ler.nextDouble();

        System.out.println("Olá" + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + number + "e seu saldo " + saldo + ", já esta disponivel.");
    }
}
