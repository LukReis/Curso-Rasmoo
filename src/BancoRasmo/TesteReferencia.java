package BancoRasmo;

public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();

        System.out.println(primeiraConta);

        Conta segundaConta = primeiraConta;

        primeiraConta.saldo = 1000;

        System.out.println(segundaConta.saldo);

        segundaConta.saldo = 450;

        System.out.println(primeiraConta.saldo);

        if(primeiraConta == segundaConta) {
            System.out.println("As duas variaveis apontam para o mesmo local");
        } else {
            System.out.println("São diferentes");
        }
    }
}
