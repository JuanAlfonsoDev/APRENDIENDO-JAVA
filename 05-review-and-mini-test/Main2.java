import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido Usuario ");

        System.out.println("Digite su nombre: ");
        String nombre = input.nextLine();

        System.out.println("Digite su edad: ");
        int edad = input.nextInt();

        System.out.println("===== MENÚ =====");
        System.out.println("1. Ver estado academico ");
        System.out.println("2. Ver tipo de estudiante");
        System.out.println("3. Salir ");
        int opcion = input.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(" Estado academico ");
                System.out.println("Digite su nota: ");
                double nota = input.nextDouble();
                if (nota < 0 ){
                    System.out.println(" Rango erroneo debe ser mayor a 0 la nota" );
                }else if (nota < 3.0) {
                    System.out.println( nombre + " has reprobado");
                } else if (nota < 4.0){
                    System.out.println(nombre + " has aprobado");
                } else if ( nota <= 5.0){
                    System.out.println(nombre + " Excelente ");
                } else {
                    System.out.println(" Rango erroneo debe ser menor a 5.0 la nota");
                }
                break;
            case 2:
                System.out.println(" Ver tipo de estudiante: ");
                if (edad < 18) {
                    System.out.println(nombre + " eres un estudiante menor de edad");
                } else {
                    System.out.println(nombre + " eres un estudiante mayor de edad");
                }
                break;
            case 3: 
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Error opción inválida");
                break;
        }
            
        input.close();
    }
}
