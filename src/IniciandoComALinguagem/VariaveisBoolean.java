package IniciandoComALinguagem;

public class VariaveisBoolean {
    public static void main(String[] args) {

        boolean usuarioAtivo = true;
        int idadeLucas = 25;

        System.out.println(usuarioAtivo);
        System.out.println(idadeLucas > 25);
        System.out.println(idadeLucas == 30);

        System.out.println(usuarioAtivo == true && idadeLucas < 30);
        System.out.println(usuarioAtivo == false && idadeLucas == 28);
        System.out.println(usuarioAtivo == false || idadeLucas == 25);
    }
}
