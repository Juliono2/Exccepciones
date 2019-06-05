/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class Error6 {
    
    static char[] matrix = new char[] {'H', 'e', 'l', 'l', 'o'};
    
public static void mostrarPosicionInexistente(){
    System.out.println("La matriz es de 3x3");
    for (int i=0;i<10;i++){
        System.out.println(matrix[i]);
    }
}

public void error(){
    try{
        mostrarPosicionInexistente();
    }catch (IndexOutOfBoundsException ex6){
        System.out.println("ERROR: "+ ex6.getMessage());
        System.out.println("Las filas o columnas despues del 5 no existen");
    }
}
}

