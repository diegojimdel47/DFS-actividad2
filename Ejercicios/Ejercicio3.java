import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el número decimal: ");
        double num1 = sc.nextDouble();
        int num2 = (int) num1;
        System.out.println("Double: " +num1);
        System.out.println("Entero: " +num2);
    }
}
