import java.util.Scanner;

public class temperatura {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner lector = new Scanner(System.in)) {
            double F, C;
            System.out.println("ingesa la cantidad de grados celsios a combertir :");
            C = lector.nextDouble();

            F = (9 / 5.0) * C + 32;

            System.out.println(C + "grados celsios equibalen a " + F + "gados fahrenheit ");
        }

    }
}