import java.util.Scanner;

public class Boletin3_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Dime el primer numero");
        n1 = teclado.nextInt();
        System.out.println("Dime el segundo numero");
        n2 = teclado.nextInt();
        System.out.println("Dime el tercer numero");
        n3 = teclado.nextInt();
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("el primer numero es el mayor");
            }else if(n1<n3){
                System.out.println("El tercer numero es el mayor");
            }
        } else if (n2 > n1) {
                if (n2 > n3) {
                    System.out.println("El segundo numero es el mayor");
                }
                else if(n2<n3){
                    System.out.println("El tercer numero es el mayor");
                }
            }
                teclado.close();
        }
}
