package BancoRasmo;

public class Conta {

    int agencia;
    int numero;
    String titular;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
    }

    boolean sacar(double valor) {
        if (saldo >= valor) {

            saldo -= valor;
            return true;

        } else {

        return false;

        }
    }

}
