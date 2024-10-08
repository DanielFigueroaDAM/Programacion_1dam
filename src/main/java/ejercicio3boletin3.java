import java.util.Scanner;
public class ejercicio3boletin3 {
    public static void main(String[] args)
    {
        Scanner teclado=new Scanner(System.in);
        int a;
        System.out.println("Dime un numero");
        a = teclado.nextInt();
        if(a>0){
            System.out.println("+");
        }
        else if(a==0){
            System.out.println("0");
        }
        else System.out.println("-");
        teclado.close();
    }
}
