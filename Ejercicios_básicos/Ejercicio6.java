import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos años tienes?: ");
        int age = sc.nextInt();

        if (age < 13) {
            System.out.println("Eres un niño");
        } else if(age < 18) {
            System.out.println("Eres un adolescente");
        } else if(age < 65) {
            System.out.println("Eres un adulto");
        } else {
            System.out.println("Eres un adulto mayor");
        }
    }
}
