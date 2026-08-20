public class Main4 {
    public static void main(String[] args) {
        int minimo = 1;
        int maximo = 1;
        for (int i = 1; i <= 100; i++) {
            if (i < minimo) {
                minimo = i;
            } else if (i > maximo){
                maximo = i;
            }
        }
        System.out.println("El numero mayor es " + maximo);
        System.out.println("El numero menor es " + minimo);
    }
}
