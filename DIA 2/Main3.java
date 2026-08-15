import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido estudiante");
        System.out.println("Digite su nota: ");
        double nota = input.nextDouble();

        if (nota < 3.0) {
            System.out.println("REPROBO CON : " + nota);
        } else if (nota >= 3.0 && nota < 4.0) {
             System.out.println("APROBO CON : " + nota);
        } else if (nota >= 4.0 && nota <= 5.0 ){
            System.out.println("EXCELENTE CON : " + nota);
        } else {
            System.out.println("ERROR DE DIGITACION");
        }

        input.close();
    }
}
