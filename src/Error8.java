/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Error8 {
    class Animal {
    public void Comer(String str) {
        System.out.println("Comiendo hierba");
    }
}

class Cabra extends Animal {
    @Override
    public void Comer(String str) {
        System.out.println("comiendo");
    }
}

class Otro extends Cabra{
    
  public void eat(String str) {
        System.out.println("another");
  }
}

public void error (){
    
    try{
        Animal a = new Animal();
        Otro t = (Otro) new Cabra();        
    }catch(ClassCastException ex8){
        System.out.println("ERROR: "+ex8.getMessage());   
        System.out.println("No es posible realizar dicha conversion");
    }
}  
}

