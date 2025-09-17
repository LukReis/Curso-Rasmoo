package BancoRasmo;

public class TesteComposicao {
    public static void main(String[] args) {

        Cliente clienteLucas = new Cliente();
        clienteLucas.nome = "Lucas";
        clienteLucas.cpf = "12345678987";
        clienteLucas.profissao = "Programador";
        clienteLucas.salario = 1000;

        Conta conta = new Conta();
        conta.titular = clienteLucas;

        System.out.println(clienteLucas);
        System.out.println(conta.titular);
        System.out.println(conta.titular.nome);
        System.out.println(conta.titular.cpf);
        System.out.println(conta.titular.profissao);
        System.out.println(conta.titular.salario);
    }
}
