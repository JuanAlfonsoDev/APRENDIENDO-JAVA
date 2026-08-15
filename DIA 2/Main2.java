import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String truepass = "1234";
        System.out.println("Bienvenido Usuario, digite su contraseña: ");
        String pass = scanner.nextLine();

        if(truepass.equals(pass)){
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }
        scanner.close();
    }
}
