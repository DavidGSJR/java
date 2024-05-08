public class Main {
    public static void main(String[] args) {

        Contador contador1 = new Contador();
        Contador contador2 = new Contador();
        Contador contador3 = new Contador();
        System.out.println(Contador.getContador());

        Contador.zerar();
        System.out.println(Contador.getContador());

        Contador.retornar();
        System.out.println(Contador.getContador());


    }
}