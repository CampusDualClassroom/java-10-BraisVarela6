package com.campusdual.classroom;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {

    public static void main(String[] args) {
        // Contador de bolas azules
        int azulCount = 0;

        // Bucle do-while para repetir hasta obtener dos bolas de color azul
        do {
            // Obtener el color de la bola usando el método getBall
            String color = getBall();

            // Imprimir el color de la bola
            System.out.println("La bola es de color: " + color);

            // Si el color es azul, incrementamos el contador de bolas azules
            if (color.equals("azul")) {
                azulCount++;
            }

            // Continuar hasta que se obtengan dos bolas de color azul
        } while (azulCount < 1);

        // Mensaje final cuando se obtienen dos bolas azules
        System.out.println("Se han obtenido dos bolas de color azul.");
    }

    // Método que devuelve un color de bola basado en un número aleatorio
    public static String getBall() {
        // Generar un número aleatorio entre 1 y 3
        int bola = randomWithRange(1, 4);

        // Asignar un color en función del número aleatorio
        switch (bola) {
            case 1:
                return "rojo";
            case 2:
                return "azul";
            case 3:
                return "verde";
            default:
                return "desconocido"; // Este caso no debería ocurrir
        }
    }

    // Método para generar un número aleatorio en el rango [min, max)
    public static int randomWithRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }
}