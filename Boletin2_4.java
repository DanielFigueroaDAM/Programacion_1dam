import java.util.Scanner;
public class boletin2_4 {
    Scanner teclado=new Scanner(System.in);
    public static void main(String[] args){
        int numero1, numero2, suma, resta, producto;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Dime el numero 1 ");
        numero1= teclado.nextInt();
        System.out.println("Dime el numero 2 ");
        numero2= teclado.nextInt();
        suma=numero2+numero1;
        resta=numero1-numero2;
        producto=numero1*numero2;
        System.out.println("La suma es"+ suma);
        System.out.println("La resta es"+ resta);
        System.out.println("La multiplicación es"+ producto);
    }
}
