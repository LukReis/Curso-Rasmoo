package BancoRasmo;

public class TesteNull {

    public static void main(String[] args) {
        Conta conta = new Conta();


        System.out.println(conta.agencia);
        System.out.println(conta.numero);
        System.out.println(conta.saldo);


        System.out.println(conta.titular);

        conta.titular = new Cliente();
        conta.titular.nome = "Lucas Esdras";
        System.out.println("O nome do titular da conta é: " + conta.titular.nome);
    }
}
