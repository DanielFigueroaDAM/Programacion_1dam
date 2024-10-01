import java.util.Scanner;
public class boletin2_3 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double euros, cambio, dolares;
        cambio = 1.1071; // <-- esa cantidad sería del cambio actual
        System.out.println("Dame la cantidad en euros");
        euros= teclado.nextDouble();
        dolares=euros*cambio;
        System.out.println("El cambio seria "+ dolares +" en dolares");

}
}
