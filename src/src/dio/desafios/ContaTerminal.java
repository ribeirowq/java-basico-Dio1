package src.dio.desafios;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta:");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite a agencia:");
        String agencia = sc.nextLine();
        System.out.print("Digite seu nome:");
        String nome = sc.nextLine();
        System.out.print("Digite seu saldo:");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome
                + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero
                + " e seu saldo " + saldo + "ja esta disponivel para saque");
    }
}