package com.company;

import java.util.Random;

public class Jogo {

    Random numeroRandom = new Random();
    int numeroEscolhido = numeroRandom.nextInt(25) + 1;
}