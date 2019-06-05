/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Error9 {
    
   static double[] numeros = new double[0]; 
   
   public double promedio (double[] arreglo ){
       if( arreglo.length == 0){
           throw new IllegalArgumentException();
       } else{
           double suma = 0.0; 
           for (int i =0; i<arreglo.length;i++){
               suma += arreglo[i];           

           }
       return suma / arreglo.length;
       }
   }
   
   public void error (){
       try{
           promedio(numeros);
       }catch (IllegalArgumentException ex9){
           System.out.println("ERROR: "+ ex9.getMessage());
           System.out.println("Argumento invalido");
       }

   }
   
}
