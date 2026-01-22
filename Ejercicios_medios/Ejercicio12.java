import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un número par del 1 al 100: ");
        int num = sc.nextInt();

        if (num > 0 && num <= 100) {
            if (num % 2 == 0) {
                System.out.println("El número esta dentro del rango y es par");
            } else {
                System.out.println("El número entra dentro del rango pero no es par");
            }
            
        } else {
            System.out.println("El número no esta dentro del rango");
        }
    }
}