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
//    public int eleccionTorre1;
//    public int eleccionTorre2;
//    public int eleccionTorre3;

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
                        System.out.println("\nNo hay ningun elemento en esta torre para mover.\n");
                        
                        
                        Procesos.imprimirTorres();

                        break;
                    }

                    switch (elecGeneral) {

                        // TORRE 1
                        case 1:
                            Torre_1.seleccionTorre1();
                         
//                            System.out.println("\nSeleccione la torre a donde quiere mover (2/3): ");
//                            eleccionTorre1 = in.nextInt();
//                            switch (eleccionTorre1) {
//                                case 2: {
//                                    int elem = Torre_1.primeraTorre.pop();
//                                    Torre_2.segundaTorre.push(elem);
//                                    break;
//                                }
//                                case 3: {
//                                    int elem = Torre_1.primeraTorre.pop();
//                                    Torre_3.terceraTorre.push(elem);
//                                    break;
//                                }
//                                default:
//                                    System.out.println("No es una torre valida");
//                                    break;
//                            }
                            break;

                        // TORRE 2
                        case 2:
                            Torre_2.seleccionTorre2();
//                            System.out.println("\nSeleccione la torre a donde quiere mover (1/3): ");
//                            eleccionTorre2 = in.nextInt();
//                            switch (eleccionTorre2) {
//                                case 1: {
//                                    int elem = Torre_2.segundaTorre.pop();
//                                    Torre_1.primeraTorre.push(elem);
//                                    break;
//                                }
//                                case 3: {
//                                    int elem = Torre_2.segundaTorre.pop();
//                                    Torre_3.terceraTorre.push(elem);
//                                    break;
//                                }
//                                default:
//                                    System.out.println("No es una torre valida");
//                                    break;
//                            }
                            break;

//                        // TORRE 3
                        case 3:
                            Torre_3.seleccionTorre3();
//                            System.out.println("\nSeleccione la torre a donde quiere mover (1/2): ");
//                            eleccionTorre3 = in.nextInt();
//                            switch (eleccionTorre3) {
//                                case 1: {
//                                    int elem = Torre_3.terceraTorre.pop();
//                                    Torre_1.primeraTorre.push(elem);
//                                    break;
//                                }
//                                case 2: {
//                                    int elem = Torre_3.terceraTorre.pop();
//                                    Torre_2.segundaTorre.push(elem);
//                                    break;
//                                }
//                                default:
//                                    System.out.println("No es una torre valida");
//                                    break;
//                            }
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
