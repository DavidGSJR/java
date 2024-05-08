public class Contador {
    private static int contador;

    public Contador(){
        contador++;
    }

    public static void incremento(){
        contador++;
    }

    public static void zerar(){
        contador = 0;
    }

    public static void retornar(){
        contador--;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Contador.contador = contador;
    }
}
