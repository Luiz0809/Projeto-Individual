package com.mycompany.projeto.individual;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class CalcioUniverse {

    void Simulacao() {
        Scanner sc = new Scanner(System.in);   
        
         System.out.println("Digite o nome do seu time: ");
         String nomeDoTime = sc.nextLine();
         
        int vitorias = 0, empates = 0, derrotas = 0;
        
        for (int i =0; i < 38; i++){
            Integer numeroSorteado = ThreadLocalRandom.current().nextInt(1,4);
            
            switch (numeroSorteado){
                case 1:
                    vitorias++;
                    break;
                case 2:
                    empates++;
                    break;
                case 3:
                    derrotas++;
                    break;
            }      
        }
        
        Integer pontuacao = (vitorias*3) + empates;
        Double aproveitamento = (pontuacao/(38*3.0))*100;
        
        System.out.println(String.format("O time %s somou %d pontos e teve um aproveitamento (%d V, %d E, %d D)"
                + " de %.2f", nomeDoTime, pontuacao, vitorias, derrotas, empates, aproveitamento));
    }

    void DadosHistoricos(int escolha) {
        if(escolha == 1){
            System.out.println("A Juventus é a maior campeã italiana com 36 títulos");
        }
        else if (escolha == 2){
            System.out.println("Silvio Piola – 274 gols (Clubes: Pro Vercelli, Lazio, Torino, Juventus e Novara.)");
        }
       else if (escolha == 3){
            System.out.println(String.format("Copa Internacional: 2 títulos (1927-1930, 1933-1935)\n" +
            "Copa do Mundo: 4 títulos (1934, 1938, 1982, 2006)\n" +
            "Olimpíadas: 1 medalha de ouro (1936)\n" +
            "Eurocopa: 2 títulos (1968, 2020)"));
        }
       else if (escolha == 4){
            System.out.println("Luigi Riva - 35 gols em 42 partidas");
       }
       else {
            System.out.println("Número inválido");
       }
    }

    void Time() {
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(1,4);
        
        switch(numeroSorteado){
            case 1:
                System.out.println("Você vai jogar no Milan");
                break;
            case 2:
                System.out.println("Você vai jogar na Inter");
                break;
            case 3:
                System.out.println("Você vai jogar no Napoli");
                break;
            case 4:
                System.out.println("Você vai jogar na Juventus");
                break;
            case 5:
                System.out.println("Você vai jogar na Roma");
                break;
            case 6:
                System.out.println("Você vai jogar na Atalanta");
                break;
            case 7:
                System.out.println("Você vai jogar na Lazio");
                break;
            case 8:
                System.out.println("Você vai jogar na Fiorentina");
                break;
            case 9:
                System.out.println("Você vai jogar no Hellas Verona");
                break;
            case 10:
                System.out.println("Você vai jogar no Sassuolo");
                break;
            case 11:
                System.out.println("Você vai jogar no Torino");
                break;
            case 12:
                System.out.println("Você vai jogar no Bologna");
                break;
            case 13:
                System.out.println("Você vai jogar no Empoli");
                break;
            case 14:
                System.out.println("Você vai jogar na Udinese");
                break;
            case 15:
                System.out.println("Você vai jogar na Sampdoria");
                break;
            case 16:
                System.out.println("Você vai jogar no Spezia Calcio");
                break;
            case 17:
                System.out.println("Você vai jogar no Cagliari");
                break;
            case 18:
                System.out.println("Você vai jogar no Venezia");
                break;
            case 19:
                System.out.println("Você vai jogar no Genoa");
                break;
            case 20:
                System.out.println("Você vai jogar no Salernitana");
                break;
        }
    }

    void AdvinheOTime() {
        System.out.println("Escolhemos as 6 principais equipes da Itália para esse game"
                + ", sua missão é advinhar o time que será sorteado"
                + "e a cada acerto, você ganha 10 pontos, boa sorte!");
        Scanner sc = new Scanner(System.in);
        int milan = 1;
        int juventus = 2;
        int inter = 3;
        int roma = 4;
        int napoli = 5;
        int lazio = 6;
        int pontuacao = 0;
        boolean jogo = true;
        
        while (jogo == true){
            System.out.println("Digite o número do time e veja se ele é sorteado");
            System.out.println(String.format(" 1- Milan \n 2- Juventus \n 3- Inter \n"
                    + " 4- Roma \n 5- Napoli \n 6- Lazio"));
            int numeroEscolhido = sc.nextInt();
            Integer numeroSorteado = ThreadLocalRandom.current().nextInt(1,7);
            
            if(numeroEscolhido == numeroSorteado){
                pontuacao += 10;
                System.out.println(String.format("Parabéns, você acertou e ganhou mais 10 pontos"
                        + " e sua pontuação atual é de: %d", pontuacao));
            }
            else {
                System.out.println(String.format("Infelizmente você errou, e sua pontuação terminou em: %d", pontuacao));
                jogo = false;
                pontuacao = 0;
            }
        }
    }
    
}
