public class Main3 {
    public static void main(String[] args){
        int acomulador = 0;
        int contador = 0;

        for(int i = 1; i <= 10; i++ ){
            acomulador += i;
            contador++;
        }
        double promedio = (double) acomulador / contador;
        System.out.println("La suma es: " + acomulador);
        System.out.println("La cantidad es: " + contador);
        System.out.println("El promedio es: " + promedio);
    }
}
