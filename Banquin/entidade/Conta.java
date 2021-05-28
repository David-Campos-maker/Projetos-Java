package Banquin.entidade;

public class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
        this.saldo = 0;
    }
    public int getNumero() {
        return this.numero;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void creditar(double v) {
        this.saldo = this.saldo + v;
    }
    public void debitar(double v) {
        if(this.saldo < v)
            this.saldo = this.saldo - 10;
        this.saldo = this.saldo - v;
    }
}
