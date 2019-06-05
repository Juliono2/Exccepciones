/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Error7 {
        
    public void metodoRandom() throws IllegalAccessException {
        System.out.println( "Dentro de metodoRandom" );
        throw new IllegalAccessException( "Random" );
        }

    public void error( ) {
        try {
            metodoRandom();
        } catch( IllegalAccessException e7 ) {
            System.out.println( "Error: " + e7 );
            }
        }
    
    }