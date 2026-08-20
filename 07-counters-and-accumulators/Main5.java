import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double nota = 0;
        double suma = 0;
        double mayor = 0;
        double menor = 0;
        

        System.out.println("Cuantas notas va ingresar");
        int cantidadNotas = input.nextInt();

        for (int i = 1; i <= cantidadNotas; i++) {
            System.out.println("Digite la nota " + i);
            nota = input.nextDouble();
            if (i == 1 ) {
                mayor = nota;
                menor = nota;
            }
            suma += nota;
            if (nota>mayor) {
                mayor = nota;
            } else if(nota<menor){
                menor = nota;
            }
        }
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + (double)suma/cantidadNotas);
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);

        input.close();
    }
}
