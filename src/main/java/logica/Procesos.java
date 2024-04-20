/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Procesos {

    public static Scanner in = new Scanner(System.in);

    public static int elecGeneral;
    public static boolean ps;

    public static void iniciarJuego() {
        System.out.println("\nTorre llenada!\n");
        for (int i = 4; i > 0; --i) {
            Torre_1.primeraTorre.push(i);

        }

    }

    public static void imprimirTorres() {
        System.out.println(Torre_1.primeraTorre);
        System.out.println(Torre_2.segundaTorre);
        System.out.println(Torre_3.terceraTorre);
    }

    static boolean seleccionGeneral() {
        System.out.println("\nSeleccione la torre donde esta el disco que quiere mover (1,2,3): ");
        elecGeneral = in.nextInt();

        if (Torre_1.primeraTorre.isEmpty() && elecGeneral == 1
                || Torre_2.segundaTorre.isEmpty() && elecGeneral == 2
                || Torre_3.terceraTorre.isEmpty() && elecGeneral == 3) {
            System.out.println("\nNo hay ningun elemento en esta torre para mover.\n");

            Procesos.imprimirTorres();

            ps = true;

        }

        return ps;

    }

}
