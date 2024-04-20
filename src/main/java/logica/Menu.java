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

    public static boolean cond = true;
    public int elecGeneral;
    public int seleccionSalir;

    public void Menu() {
        do {
            System.out.println("\n------------TORRES DE HANOI------------\n");
            System.out.println("1. Iniciar Juego");
            System.out.println("2. Mover disco hacia siguientes torres");
            System.out.println("3. Salir");
            System.out.println("\n---------------------------------------\n");

            System.out.println("Seleccione la opcion: ");
            int opc = in.nextInt();

            OUTER:
            switch (opc) {
                case 1:
                    Procesos.iniciarJuego();
                    Procesos.imprimirTorres();

                    break;
                case 2:
//                    if(Procesos.seleccionGeneral()) break;
                    System.out.println("\nSeleccione la torre donde esta el disco que quiere mover (1,2,3): ");
                    elecGeneral = in.nextInt();

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
                    System.out.println("\nSeguro que quiere salir?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    seleccionSalir = in.nextInt();
                    switch (seleccionSalir) {
                        case 1:
                            System.out.println("\nHasta luego!");
                            cond = false;
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("\nSeleccione entre Si y No.\n");
                            break;
                    }
                default:
                    System.out.println("\nIngrese una opcion correcta\n");
                    break;
            }
        } while (cond);

    }

}
