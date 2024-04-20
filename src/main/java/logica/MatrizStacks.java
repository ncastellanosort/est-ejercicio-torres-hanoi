/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Stack;

/**
 *
 * @author Nicolas
 */
public class MatrizStacks {

    public static Stack[][] matriz = new Stack[1][3];

    public MatrizStacks() {
        matriz[0][0] = Torre_1.primeraTorre;
        matriz[0][1] = Torre_2.segundaTorre;
        matriz[0][2] = Torre_3.terceraTorre;
    }

    public static void mostrarMatrizStacks() {


    }

}
