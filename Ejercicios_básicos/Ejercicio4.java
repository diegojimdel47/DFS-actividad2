import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Escribe el segundo número: ");
        int num2 = sc.nextInt();

        int add = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;

        System.out.println("\nLos resultados son: ");
        System.out.println("Suma: " + add);
        System.out.println("Resta: " + sub);
        System.out.println("Multiplicación: " + mult);
        System.out.println("División: " + div);
        System.out.println("Módulo: " + mod);
    }
}
