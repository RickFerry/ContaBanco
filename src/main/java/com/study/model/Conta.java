package com.study.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Conta {
    private int numero;
    private int agencia;
    private String nomeCliente;
    private double saldo;
}
