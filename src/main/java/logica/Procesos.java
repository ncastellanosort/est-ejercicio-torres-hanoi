/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Nicolas
 */
public class Procesos {

    static void iniciarJuego() {
        System.out.println("\nTorre llenada!\n");
        for (int i = 1; i < 5; i++) {
            Torre_1.primeraTorre.push(i);

        }

    }

    static void imprimirTorres() {
        System.out.println(Torre_1.primeraTorre);
        System.out.println(Torre_2.segundaTorre);
        System.out.println(Torre_3.terceraTorre);
    }

}
