/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Nicolas
 */
public class Procesos {

    public static Scanner in = new Scanner(System.in);

    public static int elecGeneral;
    public static boolean ps;
    public static int cantDiscos;
    public static Stack<Integer> torreGanador = new Stack();

    public static void iniciarJuego() {
        System.out.println("\nIngrese la cantidad de discos: ");
        cantDiscos = in.nextInt();

        System.out.println("\nTorre llenada!\n");
        for (int i = cantDiscos; i > 0; --i) {
            Torre_1.primeraTorre.push(i);
            torreGanador.push(i);
        }

        Torre_2.segundaTorre.push(cantDiscos);
        Torre_3.terceraTorre.push(cantDiscos);

//        MatrizStacks.mostrarMatrizStacks();
    }

    public static void imprimirTorres() {
//        System.out.println(Torre_1.primeraTorre);
//        System.out.println(Torre_2.segundaTorre);
//        System.out.println(Torre_3.terceraTorre);

        int alturaMaxima = torreGanador.size();

        for (int i = alturaMaxima - 1; i >= 0; i--) {

            if (i < Torre_1.primeraTorre.size()) {
                System.out.print(Torre_1.primeraTorre.get(i) + "\t");
            } else {
                System.out.print("|\t");
            }

            if (i < Torre_2.segundaTorre.size()) {
                System.out.print(Torre_2.segundaTorre.get(i) + "\t");
            } else {
                System.out.print("|\t");
            }

            if (i < Torre_3.terceraTorre.size()) {
                System.out.print(Torre_3.terceraTorre.get(i));
            } else {
                System.out.print("|");
            }

            System.out.println();
        }

        if (Torre_2.segundaTorre.equals(Procesos.torreGanador) || Torre_3.terceraTorre.equals(Procesos.torreGanador)) {
            System.out.println("\nHas ganado, felicitaciones!\n");
            Menu.cond = false;
        }

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
