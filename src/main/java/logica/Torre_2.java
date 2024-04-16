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
public class Torre_2 {

    public static Scanner in = new Scanner(System.in);
    public static Stack<Integer> segundaTorre = new Stack();
    public static int eleccionTorre2;

    public static void seleccionTorre2() {

        System.out.println("\nSeleccione la torre a donde quiere mover (1/3): ");
        eleccionTorre2 = in.nextInt();
        switch (eleccionTorre2) {
            case 1: {
                int elem = segundaTorre.pop();
                Torre_1.primeraTorre.push(elem);
                break;
            }
            case 3: {
                int elem = segundaTorre.pop();
                Torre_3.terceraTorre.push(elem);
                break;
            }
            default:
                System.out.println("No es una torre valida");
                break;
        }

    }

}
