package BancoRasmo;

public class TestaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 1540.40;


        Conta segundaConta = new Conta();
        segundaConta.saldo = 500;

        System.out.println(primeiraConta.saldo);
        System.out.println(segundaConta.saldo);


    }
}
