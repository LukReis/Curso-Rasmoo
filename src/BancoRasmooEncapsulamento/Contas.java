package BancoRasmooEncapsulamento;

public class Contas {

    int agencia;
    int numero;
    Cliente titular;
    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {

        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else {

        return false;
        }

    }

    public void tranferir(double valor, Contas contaDestino) {
        if (saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo Insuficiente Para Transferencia!!");
        }

    }

}
