import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingresa una edad dentro del rango de 0 a 120: ");
        int num = sc.nextInt();

        if (num > 0 && num <= 120) {
            if (num >= 18) {
                System.out.println("Edad válida y eres mayor de edad");
            }
            if (num < 18) {
                System.out.println("Edad válida y eres menor de edad");
            }
            
        } else {
            System.out.println("No es una edad valida");
        }
    }
}
