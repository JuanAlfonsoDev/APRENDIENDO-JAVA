import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("HOLA");
        System.out.println("Cual es tu nombre?");
        String nombre = input.nextLine();
        System.out.println("Cual es tu edad");
        int edad = input.nextInt();


        System.out.println("==== MENU ====");
        System.out.println("1. Saludar");
        System.out.println("2. Mostrar nombre");
        System.out.println("3. Mostrar edad");
        System.out.println("4. Salir");
        System.out.println("Seleccione una opcion: ");

        int opcion = input.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Hola, bienvenido");
                break;
            case 2: 
                System.out.println("Mi nombre es: " + nombre);
                break;
            case 3:
                System.out.println("Tengo " + edad + " años ");
                break;
            case 4: 
                System.out.println("Saliendo del programa ... ");
                break;
            default: 
                System.out.println("Opcion no valida ");
                break;
        }
        input.close();
    }
}