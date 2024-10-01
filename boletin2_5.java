import java.util.Scanner;
public class boletin2_5 {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        double millas, metros = 1852, resultado;
        System.out.println("Dime la cantidad de millas ");
        millas= teclado.nextDouble();
        resultado=millas*metros;
        System.out.println("El cambio da "+ resultado);
    }
}
