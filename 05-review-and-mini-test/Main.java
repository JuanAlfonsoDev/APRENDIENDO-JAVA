import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido Usuario. ");
        System.out.println("Digite su edad: ");
        int edad = input.nextInt();

        if (edad < 12 ) {
            System.out.println("Niño");
        } else if (edad>= 12 && edad <= 17){
            System.out.println("Adolescente");
        } else if (edad >= 18 && edad <= 59){
            System.out.println("Adulto");
        } else if (edad > 59){
            System.out.println("Adulto Mayor");
        } else {
             System.out.println("Error de digitacion");
        }

        input.close();
    }
}