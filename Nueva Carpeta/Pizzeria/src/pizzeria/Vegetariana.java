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
public class Vegetariana extends Pizza{

    public Vegetariana(String masa, String salsa, String[] ingrdientes) {
        super(masa, salsa, ingrdientes);
        //parmesano rallado, hongos
        this.ingredientes = new String[6];
        this.ingredientes[0] = "Parmesano rayado";
        this.ingredientes[1] = "Champiñones";
         this.ingredientes[2] = "Piña";
          this.ingredientes[3] = "Tofu";
           this.ingredientes[4] = "Soya";
         this.ingredientes[5] = "Albaca";  
         
    }
    public String[] getIngredientes(){
        return this.ingredientes;
    }
}
