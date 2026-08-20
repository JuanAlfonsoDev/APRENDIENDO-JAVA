public class Main2 {
    public static void main(String[] args){
        int contador = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0){
                contador++;
            }
        }
        System.out.println("Cantidad de múltiplos de 5: " + contador);
    }
}
