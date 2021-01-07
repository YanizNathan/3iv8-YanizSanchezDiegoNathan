/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

/**
 *
 * @author die_w
 */
public class Alumno extends Persona{
    private int bol;

   

    public Alumno(int bol, String nombre, int edad) {
        super(nombre, edad);
        this.bol = bol;
    }

    Alumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    String tipoPersona(){
        return ("Alumno");
        
}
    
    
}
