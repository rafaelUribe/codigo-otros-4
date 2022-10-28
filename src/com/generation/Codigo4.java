package com.generation;

import java.util.Scanner;

public class Codigo4 {

    public static void main(String[] args){
        // agragamos System.in como parametro
        Scanner s = new Scanner(System.in);

        // hacemos un piedra papel o tijeras con 2 escaner, con una concidional if
        // evaluamos si son iguales y hay un empate, si no existe empate
        // declaramos por default ganador a jugador 2
        // mediate un switch evaluamos los 3 escenarios en los que jugador 1 le gana
        // a jugador 2 y de cumplirse, gana jugador 1

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        Scanner s2 = new Scanner(System.in);
        String j2 = s2.nextLine();

        /** evaluamos con equals por tratarse de diferentes lugares en memoria */

        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            int g = 2;
            switch(j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        g = 1;
                    }
                break;
                case "papel":
                    if (j2.equals("piedra")) {
                        g = 1;
                    }
                break;
                case "tijeras":
                    if (j2.equals("papel")) {
                        g = 1;
                    }
                break;
                    // eliminamos el default ya que por defecto
                // declaramos a 2 como ganador
            }
            System.out.println("Gana el jugador " + g);
        }
    }
}



