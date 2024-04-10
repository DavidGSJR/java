public class Conta {

    private double saldo;

    public Conta(double saldo){
        this.saldo = saldo;
    }

    public void deposita(double valor){
        saldo += valor;
    }

    public double getSaldo(){
        return saldo;
    }
}
