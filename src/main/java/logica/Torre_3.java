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
                int elem = terceraTorre.pop();
                Torre_1.primeraTorre.push(elem);
                break;
            }
            case 2: {
                int elem = terceraTorre.pop();
                Torre_2.segundaTorre.push(elem);
                break;
            }
            default:
                System.out.println("No es una torre valida");
                break;
        }

    }

}
