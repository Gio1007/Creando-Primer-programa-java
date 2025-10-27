import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        Random Random = new Random();

        int numeroSecreto = Random.nextInt(100);
        int intentos = 5;
        boolean adivinaste = false;

        System.out.println("Bienvenido al juego Adivina el numero");
        System.out.println("Tienes " + intentos + " Intentos para adiviar el numero");

        for (int i = 1; i <= intentos ; i++) {
            System.out.println("Intento " + i + " Ingresa tu numero ->");
            int numeroUsuario = Scanner.nextInt();

            if (numeroUsuario == numeroSecreto) {
                System.out.println("Felicidades Adivinaste");
                adivinaste = true;
                break;
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("El numero es mayor");
            } else {
                System.out.println("El numero es menor");
            }
            if (!adivinaste) {
                System.out.println("Te quedaste sin intentos. El numero secreto era: " + numeroSecreto);

            }
        }
    }
}
