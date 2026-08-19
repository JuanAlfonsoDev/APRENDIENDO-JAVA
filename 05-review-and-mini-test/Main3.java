import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userCorrect = "admin";
        String passCorrect = "1234"; 


        System.out.println("Bienvenido Usuario");
        System.out.println("Escriba su usuario");
        String user = input.nextLine();
        System.out.println("Escriba su contraseña ");
        String pass = input.nextLine();

        if (userCorrect.equals(user) && passCorrect.equals(pass)) {
            System.out.println("Bienvenido pasaste el login");
        } else if (!userCorrect.equals(user) ) {
            System.out.println("Usuario incorrecto");
        } else {
            System.out.println("Contraseña incorrecta");
        }
        input.close();
    }
}
