import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {

        int escolhaJogador, escolhaComputador;
        String escolhaJogadorString, escolhaComputadorString;
        Random sorteador = new Random();

        Scanner leitor = new Scanner(System.in);

        System.out.println("*******************");
        System.out.println("      JOKENPÔ      ");
        System.out.println("*******************");
        System.out.println();
        System.out.println("1 - PEDRA");
        System.out.println("2 - PAPEL");
        System.out.println("3 - TESOURA");
        System.out.println();


        try {
            System.out.print("Qual sua escolha? (1 - 3) ");
            escolhaJogador = leitor.nextInt();
            escolhaComputador = sorteador.nextInt(3) +1;

            System.out.println("Escolha do jogador: " + definirNomeEscolha(escolhaJogador));
            System.out.println("Escolha do computador: " + definirNomeEscolha(escolhaComputador));

            determinarVencedor(escolhaJogador, escolhaComputador);


        } catch (Exception erro){
            System.out.println(" Por gentileza, escolha um NÚMERO entre 1 e 3");

        }



    }

    private static void testar(){
        System.out.println("Olá mundo!!");

    }

    private static  String definirNomeEscolha(int opcao){

        String escolhaString;

        if (opcao == 1) {
            escolhaString = "PEDRA";
        } else if (opcao == 2){
            escolhaString = "PAPEL";
        } else {
            escolhaString = "TESOURA";
        }

        return  escolhaString;
    }

    private static void determinarVencedor(int escolhaJogador, int escolhaComputador){

        if (escolhaJogador ==1){
            if (escolhaComputador ==1){
                System.out.println("O JOGO EMPATOU!!");
            } else if (escolhaComputador ==2) {
                System.out.println("O COMPUTADOR VENCEU!!");
            } else {
                System.out.println("O HUMANO VENCEU !!");
            }
        } else if (escolhaJogador == 2) {
            if (escolhaComputador ==1){
                System.out.println("O HUMANO VENCEU!!");
            } else if (escolhaComputador ==2) {
                System.out.println("O COMPUTADOR EMPATOU!!");
            } else {
                System.out.println("O COMPUTADOR VENCEU !!");
            }

        } else {
            if (escolhaComputador ==1){
                System.out.println("O COMPUTADOR VENCEU!!");
            } else if (escolhaComputador ==2) {
                System.out.println("O HUMANO VENCEU!!");
            } else {
                System.out.println("O JOGO EMPATOU !!");
            }
        }

    }

}

