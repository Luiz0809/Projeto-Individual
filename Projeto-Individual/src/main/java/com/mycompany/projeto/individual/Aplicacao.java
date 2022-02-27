package com.mycompany.projeto.individual;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-".repeat(30));
        System.out.println("SEJA BEM VINDO AO UNIVERSO CALCIO"); 
        System.out.println("-".repeat(30));
        System.out.println("");
        
        Integer respostaDoUsuario = 0;
        CalcioUniverse calcio = new CalcioUniverse();
        
        while(respostaDoUsuario != 4){
            System.out.println(String.format("OPÇÕES: \n 1- Simule uma campanha"
                    + " \n 2- Dados históricos \n 3- Veja em qual time você jogaria \n"
                    + " 4- Encerrar \n 5- Advinhe o time sorteado"));
            respostaDoUsuario = sc.nextInt();
            
            switch(respostaDoUsuario){
                case 1: 
                    calcio.Simulacao();
                    break;
                case 2:
                    System.out.println(String.format("1- Maior campeão italiano \n"
                            + "2- Maior artilheiro do campeonato \n"
                            + "3- Titulos da Seleção \n"
                            + "4- Maior artilheiro da seleção"));
                    int escolha = sc.nextInt();
                    calcio.DadosHistoricos(escolha);
                    break;
                case 3:
                    calcio.Time();
                    break;
                case 4:
                    System.out.println("Muito obrigado pela participação, volte sempre!");
                    respostaDoUsuario = 4;
                    break;
                case 5:
                    calcio.AdvinheOTime();
                    break;
                default:
                System.out.println("Número inválido, Tente novamente");
            }
            
            
        }
    }
}
