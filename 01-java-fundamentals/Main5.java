import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 

        System.out.println("Cual es tu nombre?: ");
        String nombre = scanner.nextLine();

        System.out.println("Cual es tu edad?: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Cual es tu ciudad?: ");
        String ciudad = scanner.nextLine();

        System.out.println("Hola " + nombre);
        System.out.println("Tienes: " + edad);
        System.out.println("Y tu ciudad es: " + ciudad);
        scanner.close();
    }
}
