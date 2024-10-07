import java.util.Scanner;

public class ejercicio_short {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        short a,b;
        System.out.println("Dime el primer numero");
        a= teclado.nextShort();
        System.out.println("Dime el segundo numero");
        b= teclado.nextShort();
        if(a>b){
            System.out.println("a es mayor que b");
        }
        teclado.close();


    }
}
