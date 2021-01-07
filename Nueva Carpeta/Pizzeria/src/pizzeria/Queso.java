/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author die_w
 */
public class Queso extends Pizza{
   

        
    
    
    
    //vamos a suponer que hay diferentes tipos de queso

    public Queso(String masa, String salsa, String[] ingrdientes) {
        super(masa, salsa, ingrdientes);
        //parmesano
        //chedar o mozzarela
        this.ingredientes = new String[2];
        this.ingredientes[0]="Queso Parmesano";
        this.ingredientes[1]="Queso Mozzarela";
        
    }
    public String[] getIngredientes(){
        return this.ingredientes;
        
    }
    
    
    //vamos a suponer que hay diferentes tipos de queso
    
    
    
}
