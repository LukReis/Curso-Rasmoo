package IniciandoComALinguagem;

public class EstruturaRepeticao {
    public static void main(String[] args) {

        int contador = 0;

//        while(contador <= 5) {
//            System.out.println(contador);
//            contador++;
//        }

        do {
            System.out.println(contador);
             contador++;
        } while (contador <= 5);

        System.out.println("-------------------------------------------");

        for (int count = 0 ; count <=5 ; count++) {
            System.out.println(count);
        }

        System.out.println("-------------------------------------------");



    }
}
