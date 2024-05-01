import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        String agencia;
        int numero;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite seu Nome: ");
        nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = sc.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        numero = sc.nextInt();

        System.out.print("Por favor, digite o saldo inicial que será depositado: ");
        saldo = sc.nextDouble();

        String retorno = toString(agencia, numero, nomeCliente, saldo);
        System.out.println(retorno);
    }


    public static String toString(String agencia, int numero, String nomeCliente, double saldo){
        return "Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero +
                " e seu saldo R$" + saldo +
                " já está disponível para saque";
    }
}
