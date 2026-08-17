import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

            System.out.println("Hola, Cual es tu edad?: ");
            int edad = scanner.nextInt();

            if (edad >= 18 ){
                System.out.println("Eres mayor de edad");
            } else {
                System.out.println("Eres menor de edad");
            }
        
        scanner.close();
    }
}
