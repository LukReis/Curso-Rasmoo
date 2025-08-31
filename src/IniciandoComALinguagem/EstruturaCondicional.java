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

    int mes = 13;

        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Feveiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Mês Invalido");
                break;

        }
    }
}
