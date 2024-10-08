import java.util.Scanner;

public class ejercicio4boletin3 {
    public static void main(String[] args)
    {
        Scanner teclado=new Scanner(System.in);
        double p1, p2, dif;
        String nom1,nom2;
        System.out.println("Dime el nombre de la primera persona");
        nom1 = teclado.nextLine();
        System.out.println("Ahora dime su peso");
        p1 = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Dime el nombre de la segunda persona");
        nom2 = teclado.nextLine();
        System.out.println("Ahora dime su peso");
        p2 = teclado.nextDouble();
        teclado.nextLine();
        if(p1<p2){
            dif=p2-p1;
            System.out.println("La que pesa mas es "+nom2+"su peso es" +p2+ "y la diferencia es "+dif);
        }
        else if(p2<p1) {
            dif = p1 - p2;
            System.out.println("La que pesa mas es " + nom1 + "su peso es" + p1 + "y la diferencia es " + dif);
        }
        teclado.close();

    }

    }

