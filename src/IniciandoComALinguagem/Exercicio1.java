package IniciandoComALinguagem;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma Temperatura em graus celsius: ");
        double temperaturaCelsius = sc.nextDouble();

        double kelvin = temperaturaCelsius + 273.15;
        double fahrenheit = temperaturaCelsius * 1.8 + 32;

        System.out.println("A Temperatura em Kelvin é: " + kelvin);
        System.out.printf("A Temperatura em Fahrenheit é: %.2f ", fahrenheit);

    sc.close();
    }
}
