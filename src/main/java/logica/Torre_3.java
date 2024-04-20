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
public class Torre_3 {

    public static Scanner in = new Scanner(System.in);
    public static Stack<Integer> terceraTorre = new Stack();
    public static int eleccionTorre3;

    public static void seleccionTorre3() {

        System.out.println("\nSeleccione la torre a donde quiere mover (1/2): ");
        eleccionTorre3 = in.nextInt();
        switch (eleccionTorre3) {
            case 1: {

                if (terceraTorre.peek() < Torre_1.primeraTorre.peek()) {
                    int elem = terceraTorre.pop();
                    Torre_1.primeraTorre.push(elem);
                    System.out.println("\nElemento movido exitosamente!");
                    break;

                } else {
                    System.out.println("\nEl disco no se puede mover a esa posicion\n");
                    break;
                }

            }
            case 2: {

                if (terceraTorre.peek() < Torre_2.segundaTorre.peek()) {
                    int elem = terceraTorre.pop();
                    Torre_2.segundaTorre.push(elem);
                    System.out.println("\nElemento movido exitosamente!");

                    break;
                } else {
                    System.out.println("\nEl disco no se puede mover a esa posicion\n");
                    break;
                }

            }
            default:
                System.out.println("No es una torre valida");
                break;
        }

    }

}
