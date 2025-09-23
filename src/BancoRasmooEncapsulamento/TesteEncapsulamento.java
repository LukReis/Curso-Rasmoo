package BancoRasmooEncapsulamento;

public class TesteEncapsulamento {
    public static void main(String[] args) {

    Contas conta = new Contas();

    conta.depositar(1000);
    conta.sacar(1000);

        System.out.println(conta.saldo);

    }
}
