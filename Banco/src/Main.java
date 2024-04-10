public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta(300);
        System.out.println(conta.getSaldo());

        conta.deposita(400);
        System.out.println(conta.getSaldo());

    }
}