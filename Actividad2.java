import java.util.Scanner;
public class Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");
        String name = sc.next();
        String saved_names = "Diego";

        if (name.equals(saved_names)) {
            System.out.println("Bienvenido " + name);
        } else if (name.toLowerCase(saved_names)) {
            System.out.println("Tienes que escribir la inicial con mayúscula");
        } else if (name.toUpperCase(saved_names)) {
            System.out.println("Solo la inicial se escribe con mayúscula");
        } else {
            System.out.println("Este nombre no coincide con los guardados");
        }
    }