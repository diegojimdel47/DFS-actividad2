# Ejercicio 17
[Regresar al Índice](/README.md)
## Descripción del programa
En este programa se le pide al usuario un número decimal y se verifican dos condiciones, si esta dentro del intervalo cerrado entre 10 y 20, o si esta dentro del intervalo abierto de 30 y 40, si cumple cualquiera de las dos condiciones es un número valido.
## Código
``` java
import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un número decimal: ");
        double num = sc.nextDouble();

        if ((num >= 10 && num <= 20) || (num > 30 && num < 40)) {
            System.out.println("El número esta dentro de uno los intervalos válidos");
        } else {
            System.out.println("El número esta fuera de los intervalos");
        }
    }
}
```
## Salida esperada
![](Ejercicio17_Captura.png)