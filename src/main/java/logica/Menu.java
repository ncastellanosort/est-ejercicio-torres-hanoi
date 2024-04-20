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
public class Menu {

    Scanner in = new Scanner(System.in);

    public boolean cond = true;
    public int elecGeneral;

    public void Menu() {
        do {

            System.out.println("\n-----------------------\n");
            System.out.println("1. Iniciar Juego");
            System.out.println("2. Mover disco hacia siguientes torres");
            System.out.println("3. Salir");

            System.out.println("\n-----------------------\n");

            System.out.println("Seleccione la opcion: ");
            int opc = in.nextInt();

            switch (opc) {

                case 1:
                    Procesos.iniciarJuego();
                    Procesos.imprimirTorres();

                    break;

                case 2:

//                    if(Procesos.seleccionGeneral()) break;
                    System.out.println("\nSeleccione la torre donde esta el disco que quiere mover (1,2,3): ");
                    elecGeneral = in.nextInt();

                    if (Torre_1.primeraTorre.isEmpty() && elecGeneral == 1
                            || Torre_2.segundaTorre.isEmpty() && elecGeneral == 2
                            || Torre_3.terceraTorre.isEmpty() && elecGeneral == 3) {
                        System.out.println("\nNo hay ningun elemento en esta torre para mover.\n");

                        Procesos.imprimirTorres();

                        break;
                    }

                    switch (elecGeneral) {

                        // TORRE 1
                        case 1:
                            Torre_1.seleccionTorre1();

                            break;

                        // TORRE 2
                        case 2:
                            Torre_2.seleccionTorre2();

                            break;

                        // TORRE 3
                        case 3:
                            Torre_3.seleccionTorre3();

                            break;

                        default:
                            System.out.println("\nIngresa una torre valida");
                    }

                    Procesos.imprimirTorres();

                    break;

                case 3:
                    System.out.println("\nHasta luego!");
                    cond = false;
                    break;

                default:
                    System.out.println("\nIngrese una opcion correcta\n");
                    break;

            }
        } while (cond);

    }

}
