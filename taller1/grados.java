
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class grados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        float temperatura;
        System.out.println("ingrese la temperatura en celsius");
        temperatura = leer.nextInt();
        float tenfin = temperatura * 9 / 5 + 32;

        System.out.println("la temperatura en fahrenheit" + tenfin);
    }

}