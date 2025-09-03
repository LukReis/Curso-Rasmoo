package BancoRasmo;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.depositar(300);
        conta.depositar(500);
        conta.depositar(50.30);

        boolean consegiuRealizarSaque =  conta.sacar(1000);

        if (consegiuRealizarSaque) {
            System.out.println("Saque Realizado com Sucesso! ");
        } else {
            System.out.println("Não foi possivel realizar o seu saque! ");
        }

        System.out.println(conta.saldo);
    }
}
