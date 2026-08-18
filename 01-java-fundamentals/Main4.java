import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cual es tu nombre? ");
        String nombre = scanner.nextLine();

        System.out.println("Cual es tu edad? ");
        String edad = scanner.nextLine();

        System.out.println("Hola " + nombre + " tienes " + edad);

        scanner.close();
    }
}
