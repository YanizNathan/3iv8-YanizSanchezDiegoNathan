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
import java.io.Serializable;
//cuando nosotros necesitamos generar un archivo de una clas
//se debed de incluir la palabra reservada implements

public abstract class Persona implements Serializable{
    //una clase abstracta nos sirve como molde para poder 
    //aplicar de forma superir polimorfismo
    private String nombre;
    private int edad;
    
    public Persona(){
        
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //vamos a generar una persona que se transforme
    //en un alumno o un profesor
    abstract String tipoPersona();
    
}
