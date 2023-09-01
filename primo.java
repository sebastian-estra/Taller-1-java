import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner (System.in)) {
            System.out.println("dame el numero ");
            int numero = leer.nextInt();

            int suma = 0;

            for (int i=1; i<=numero; i++){

            
            
               int auciliar = numero % i;

               if (auciliar == 0){
                suma = suma + 1 ;
                }
   }
            if (suma <= 2){     
                System.out.println("tu numero es primo");
            }
            else {
                System.out.println("tu numero NO es primo ");
            }
        }
    }
}