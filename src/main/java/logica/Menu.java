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
            System.out.println("5. Salir");

            System.out.println("\n-----------------------\n");

            System.out.println("Seleccione la opcion: ");
            int opc = in.nextInt();

            switch (opc) {

                case 1:
                    Procesos.iniciarJuego();
                    Procesos.imprimirTorres();

                    break;

                case 2:

                    System.out.println("\nSeleccione la torre donde esta el disco que quiere mover (1,2,3): ");
                    elecGeneral = in.nextInt();

                    if (Torre_1.primeraTorre.isEmpty() && elecGeneral == 1
                            || Torre_2.segundaTorre.isEmpty() && elecGeneral == 2
                            || Torre_3.terceraTorre.isEmpty() && elecGeneral == 3) {
                        System.out.println("No hay ningun elemento en esta torre para mover.");
                        break;
                    }

                    switch (elecGeneral) {

                        // TORRE 1
                        case 1:
                            System.out.println("\nSeleccione la torre a donde quiere mover (2/3): ");
                            int eleccion = in.nextInt();
                            if (eleccion == 2) {
                                int x = Torre_1.primeraTorre.pop();
                                Torre_2.segundaTorre.push(x);
                            } else if (eleccion == 3) {

                                int x = Torre_1.primeraTorre.pop();
                                Torre_3.terceraTorre.push(x);

                            } else {
                                System.out.println("No es una torre valida");
                            }
                            break;

                        // TORRE 2
                        case 2:
                            System.out.println("\nSeleccione la torre a donde quiere mover (1/3): ");
                            int eleccion2 = in.nextInt();
                            if (eleccion2 == 1) {
                                int xx = Torre_2.segundaTorre.pop();
                                Torre_1.primeraTorre.push(xx);
                            } else if (eleccion2 == 3) {

                                int xx = Torre_2.segundaTorre.pop();
                                Torre_3.terceraTorre.push(xx);

                            } else {
                                System.out.println("No es una torre valida");
                            }
                            break;

//                        // TORRE 3
                        case 3:
                            System.out.println("\nSeleccione la torre a donde quiere mover (1/2): ");
                            int eleccion222 = in.nextInt();
                            if (eleccion222 == 1) {
                                int xd = Torre_3.terceraTorre.pop();
                                Torre_1.primeraTorre.push(xd);
                            } else if (eleccion222 == 2) {

                                int xd = Torre_3.terceraTorre.pop();
                                Torre_2.segundaTorre.push(xd);
                            } else {
                                System.out.println("No es una torre valida");
                            }
                            break;
                        default:
                            System.out.println("\nIngresa una torre valida");
                    }
                    Procesos.imprimirTorres();

                    System.out.println("\nElemento movido exitosamente!");

                    break;

                case 5:
                    System.out.println("\nHasta luego");
                    cond = false;
                    break;

                default:
                    System.out.println("\nIngrese una opcion correcta\n");
                    break;

            }
        } while (cond);

    }

}
