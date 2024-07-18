package com.study;

import com.study.model.Conta;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();
        System.out.println("Digite a agência:");
        int agencia = scanner.nextInt();
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.next();
        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();
        Conta conta = new Conta(numero, agencia, nomeCliente, saldo);
        System.out.println("Conta criada: " + conta);
    }
}