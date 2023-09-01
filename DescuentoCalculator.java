 import java.util.Scanner;

 public class DescuentoCalculator { 
        
        private static int porcentajeDescuento;
       
        public static double Calculodescuento (double PresiOriguinal,  double porsentajeDescuento) {
            double descuento, presioFinal;
            descuento = (porcentajeDescuento/100) * PresiOriguinal;
            presioFinal = PresiOriguinal - descuento;

            return presioFinal;


        }
        
        public static void main(String[] args) {
            double PresiOriguinal, porcentajeDescuento;
            try (Scanner leer = new Scanner(System.in)) {
                do {
                    System.out.println("ingrese el presio origuinal ");
                    PresiOriguinal= leer.nextDouble();
                    
                    if ( PresiOriguinal < 0){
                        System.out.println("la cantidad debe ser mayor a 0 ");

                    }
                }while(PresiOriguinal < 0 );
      
      
                do{
                    System.out.println("ingresse el porsentaje de descuento 1% 99%");
                    porcentajeDescuento =leer.nextDouble();
                    if (porcentajeDescuento <1 || porcentajeDescuento >99 ){
                        System.out.println("el porcentaje debe de estar dentro del 1 y el 99 porciento");

                    }
                }while (porcentajeDescuento <1 || porcentajeDescuento >99 );
            }

            System.out.println("el presio final de la compra es :"+ Calculodescuento(PresiOriguinal,porcentajeDescuento));
            
        }
    }

