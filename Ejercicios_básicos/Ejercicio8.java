import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String baseName = "Diego";
        System.out.print("Escribe tu nombre: ");
        String userName = sc.next();

        if (userName.equalsIgnoreCase(baseName)) {
            System.out.println("Hola " + baseName + " bienvenido");
        } else {
            System.out.println("Hola " + userName + " tu nombre no esta guardado");
        }
    }
}
