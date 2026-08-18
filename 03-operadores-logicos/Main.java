import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Cual es tu edad: ");
        int edad = input.nextInt();
        
        if (edad < 18 || edad > 60 ) {
            System.out.println("Puede acceder a la promoción su edad es de : " + edad);
        } else {
            System.out.println("No puede acceder a la promoción su edad es de : " + edad);
        }

        input.close();
    }
}