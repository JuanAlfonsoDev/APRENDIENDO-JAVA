import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Selecione una operacion: ");
        System.out.println("1. Sumar ");
        System.out.println("2. Restar ");
        System.out.println("3. Multiplicar ");
        System.out.println("4. Dividir");
        int opcion = input.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Numero 1: ");
                int num1 = input.nextInt();
                System.out.println("Numero 2: ");
                int num2 = input.nextInt();
                int res = num1 + num2;
                System.out.println("La respuesta es " + res);
                break;
            case 2:
                System.out.println("Numero 1: ");
                int num3 = input.nextInt();
                System.out.println("Numero 2: ");
                int num4 = input.nextInt();
                int res2 = num3 - num4;
                System.out.println("La respuesta es " + res2);
                break;
            case 3:
                System.out.println("Numero 1: ");
                int num5 = input.nextInt();
                System.out.println("Numero 2: ");
                int num6 = input.nextInt();
                int res3 = num5 * num6;
                System.out.println("La respuesta es " + res3);
                break;
            case 4:
                System.out.println("Numero 1: ");
                double num7 = input.nextDouble();
                System.out.println("Numero 2: ");
                double num8 = input.nextDouble();
                if (num8 == 0) {
                    System.out.println("Indefinido");
                    break;
                }
                double res4 = num7 / num8;
                System.out.println("La respuesta es " + res4);
                break;

            default:
                System.out.println("Opcion invalida");
                break;
        }
        input.close();
    }
}
