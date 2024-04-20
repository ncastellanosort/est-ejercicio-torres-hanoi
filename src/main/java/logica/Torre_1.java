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
public class Torre_1 {

    // el scanner estatico ya que para que el metodo estatico sirva debe ser una variable estatica
    public static Scanner in = new Scanner(System.in);

    public static Stack<Integer> primeraTorre = new Stack();
    public static int eleccionTorre1;

    public static void seleccionTorre1() {

        System.out.println("\nSeleccione la torre a donde quiere mover (2/3): ");
        eleccionTorre1 = in.nextInt();
        switch (eleccionTorre1) {
            case 2: {

                if (primeraTorre.peek() < Torre_2.segundaTorre.peek()) {
                    int elem = primeraTorre.pop();
                    Torre_2.segundaTorre.push(elem);
                    System.out.println("\nElemento movido exitosamente!");
                    break;
                } else {
                    System.out.println("\nEl disco no se puede mover a esa posicion\n");
                    break;
                }

            }
            
            case 3: {
                if (primeraTorre.peek() < Torre_3.terceraTorre.peek()) {
                    int elem = primeraTorre.pop();
                    Torre_3.terceraTorre.push(elem);
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
