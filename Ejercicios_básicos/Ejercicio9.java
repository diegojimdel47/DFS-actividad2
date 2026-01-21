import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe tu calificación: ");
        int cal = sc.nextInt();

        if (cal < 70) {
            System.out.println("Estas reprobado");
        } else if (cal < 80) {
            System.out.println("Aprobaste");
        } else if (cal < 90) {
            System.out.println("Muy bien");
        } else {
            System.out.println("Excelente");
        }
    }
}
