import java.util.Scanner;

public class calculo {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float kg, mt , imc ,x ;
    System.out.print("calcule cual es tu peso (kg)");
    kg=sc.nextFloat();
    System.out.print("cual es tu estatura (mt)");
    mt=sc.nextFloat();
    imc=mt*mt;
    x=kg/imc;
    System.out.println("tu indice de masa corporal es : "+ x);
    if (x>=18){
        System.out.println("ESTAS DESNUTRIDO");
    
    } else if ( x <18 && x <= 24.9){
        System.out.println(" PESO NORMAL ");


    } else if ( x <25 && x <= 29.9){
        System.out.println(" TIENES UN SOBREPESO ");


    } else if ( x <30 && x<= 34.9){
        System.out.println(" TIENES UN SOBREPESO 1 ");


    } else if ( x <35 && x <= 39.9){
        System.out.println(" TIENES UN SOBREPESO 2 " );


    } else if ( x <40 && x <= 49.9){
        System.out.println(" TIENES UN SOBREPESO 3 ");

    }else  if (x >50){
        System.out.println(" TIENES UN SOBREPESO 4 ");
        }
    }

    
 }   
