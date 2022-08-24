package com.company;

import java.util.Scanner;

public class Main {
    static Jogo jogo = new Jogo();
    static int numeroDigitado;

    static int numeroCaido = jogo.numeroEscolhido;
    public static void main(String[] args) {
        System.out.println("#####################################");
        System.out.println("#####Bem-Vindo ao blaze do SENAI#####");
        System.out.println("#####################################");
        System.out.println("Entre com um número que você deseja apostar de 1 a 25");
        Scanner scanner = new Scanner(System.in);
        numeroDigitado = scanner.nextInt();
        aposta();
        System.out.println("#####################################");
        System.out.println("O número aleatório escolhido é: " + numeroCaido);
        }

    static void aposta(){
        if (numeroCaido == numeroDigitado){
            System.out.println("VOCÊ QUEBROU A BANCA DO SENAI!!!");
        }else if(numeroCaido != numeroDigitado){
            System.out.println("Você errou, tente mais tarde");
        }if(numeroDigitado > 25){
            System.out.println("Digite um número menor ou igual a 25");
        }if(numeroDigitado < 1){
            System.out.println("Digite um número maior ou igual a 1");
        }
    }
}