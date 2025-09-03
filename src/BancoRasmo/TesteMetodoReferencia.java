package BancoRasmo;

public class TesteMetodoReferencia {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();


        primeiraConta.depositar(1000);
        segundaConta.depositar(5000);

        primeiraConta.sacar(100);

        primeiraConta.tranferir(400, segundaConta);

        segundaConta.tranferir(2500, primeiraConta);



        System.out.println("Saldo da Primeira Conta: " + primeiraConta.saldo);
        System.out.println("Saldo da Segunda Conta: " + segundaConta.saldo);


    }
}
