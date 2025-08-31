package IniciandoComALinguagem;

public class EstruturaCondicional {
    public static void main(String[] args) {



        String nome = "Lucas";
        double media = 4.8;

        if (media >= 7) {
            System.out.println("Parabens " + nome + ", Você foi Aprovado" + " Sua nota foi de: " + media);
        } else if (media >= 5) {
            System.out.println("você está de recuperação, " + nome + " Sua nota foi de: " + media);
        } else {
            System.out.println("Infelizmente você foi reprovado, " + nome + " Sua nota foi de: " + media);
        }

    }
}
