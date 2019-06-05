
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class NewClass {
    
    public static void main(String[] args) {
        
        int Decicion;
      
        System.out.println("ACONTINUACION UN MENU DE EXCEPCIONES");

        for(int i=0; i<10;i++){
        
        System.out.println("Digite la Excepcion que desea ejecutar");
        System.out.println("1. AritmeticException"+
                "\n 2. InputMismatchException"+
                "\n 3. NullPointerException"+
                "\n 4. NegativeArraySizeException"+
                "\n 5. NumberFormatException"+
                "\n 6. IndexOutOfBoundsException"+
                "\n 7. IllegalAccessException"+
                "\n 8. ClassCastException"+
                "\n 9. IllegalArgumentException"+
                "\n 10. ClassNotFoundException");
        Scanner Sn = new Scanner (System.in);
        Decicion = Sn.nextInt();        
        switch (Decicion){
            case 1:
                Error1 ex = new Error1();
                ex.error();
                    break;
            case 2:
                Error2 ex2 = new Error2();
                ex2.error();
                    break;
            case 3:
                Error3 ex3 = new Error3();
                ex3.error(null);
                    break;
            case 4:
                Error4 ex4 = new Error4();
                ex4.error();
                    break;
            case 5:
                Error5 ex5 = new Error5();
                ex5.error();
                    break;
            case 6:
                Error6 ex6 = new Error6();
                ex6.error();
                    break;
            case 7:     
                Error7 ex7 = new Error7();
                ex7.error();
                    break;
            case 8:
                Error8 ex8 = new Error8();
                ex8.error();
                    break;
            case 9:
                Error9 ex9 = new Error9();
                ex9.error();
                    break;
            case 10:
                Error10 ex10 = new Error10();
                ex10.error();
        }
        }  
    }
}
