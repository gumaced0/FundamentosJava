import java.util.Random;
import java.util.Scanner;

public class Sorteio {
    public static void main(String[] args) {
        int aleatorio = new Random().nextInt(100);
        Scanner sc = new Scanner(System.in);

        for (int tentativas = 1; tentativas <= 5 ; tentativas++) {
            System.out.println("Tente Adivinhar o Número Sorteado: ");
            int numero = sc.nextInt();
            
            if (numero == aleatorio){
                System.out.println("Parabéns, você acertou!");
                break;
            } else if (numero > aleatorio) {
                System.out.println("A Tentativa é maior que o número sorteado");
            }else {
                System.out.println("A Tentativa é menor que o número sorteado");
            }
        }
    }
}
