import java.util.Scanner;

public class parimpar {
    public static void main(String[] args) {
        try (Scanner leerScanner = new Scanner(System.in)) {

            int l;

            System.out.println("ingresa un numero");
            l= leerScanner.nextInt();
            
            if  (l %2 == 0){
                System.out.println("el numero es par ");
            }
            else{
                System.out.println("el numero es inpar ");
            }
        }
        
        }
    }

