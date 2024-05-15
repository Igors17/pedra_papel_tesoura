import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {

        System.out.println("Qual número você deseja?");
        Random sorteio =new Random(); // Gerando um número aleatório!!
        int sorteado = sorteio.nextInt(3) + 1; // (bound 3) + 1; Assim será de 0 a 3, caso seja de (bound 3) sem acrescentar + algum número será de 0 a 2!!
        System.out.println(sorteado);

        int pedra = "pedra;
        int papel = 2;
        int tesoura = 3;


    }
}
