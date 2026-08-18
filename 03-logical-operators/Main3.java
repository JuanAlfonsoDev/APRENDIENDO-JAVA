import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Cual es tu edad?");

        int edad = input.nextInt();
        boolean invitacionEspecial = true;

        if ((edad <= 18 && edad >= 12) || !invitacionEspecial){
            System.out.println("Puede entrar");
        } else {
            System.out.println("No puede entrar");
        }


        input.close();
    }
}
