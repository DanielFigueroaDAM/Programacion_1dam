import java.util.Scanner;

public class ejercicio2boletin3 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        short a,b,resta,suma;
        System.out.println("Dime un numero");
        a= teclado.nextShort();
        System.out.println("Dime un numero");
        b= teclado.nextShort();
        suma=(short)(a + b);
        if(a>=b){
            resta=(short)(a - b);
            System.out.println("La resta es"+resta);
        }
        System.out.println("La suma es " +suma);
        teclado.close();

    }
}
