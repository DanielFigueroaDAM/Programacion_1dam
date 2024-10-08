import java.util.Scanner;
public class ejercicio1boletin3 {
    public static void main(String[] args)
    {
        Scanner teclado=new Scanner(System.in);
        int a;
        System.out.println("Dime un numero");
        a = teclado.nextInt();
        if(a>0){
            System.out.println(a+"positivo");
        }
        else if(a==0){
            System.out.println("El numero es 0");
        }
        teclado.close();
    }
}
