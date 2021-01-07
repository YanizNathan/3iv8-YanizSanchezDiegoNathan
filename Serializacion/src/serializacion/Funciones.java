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
import java.io.*;
import java.util.*;
import javax.swing.*;


public class Funciones {
    //variables y objetos
    ArrayList<Persona> listaPersonas =new ArrayList();
    String rep = "si";
    String nombre;
    int edad, num_empleado, bol;
    //polimorfismo persona - Profesor
    Persona profe = new Profesor();
    //polimorfismo Persona -Alumno
    Persona alumno = new Alumno();
    
    //meno
    
    void menu(){
        //ciclo infinito
        while(true){
            while(rep.equalsIgnoreCase("si")){
                try{
                    
                    String var = (JOptionPane.showInputDialog("Ingresa la opcion "
                            + "Deseada : \n"
                            + "1.- Registrar nuevo PRofesor\n"
                            + ""));
                }
            }
        }
    }
    
    //meno
    
}
