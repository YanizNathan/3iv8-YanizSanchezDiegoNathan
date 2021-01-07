package ove;

import java.util.*;
import java.io.*;

public class Ove implements Serializable{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        procesos objlista = new procesos();
        int opcion;
        
        do{
            System.out.println("\nBienvenido al Organizador de Víveres Electrónico (OVE).");
            System.out.println("Elija el proceso a realizar:");
            System.out.println("— agregar un nuevo producto (1);");
            System.out.println("— consultar un producto (2);");
            System.out.println("— consultar todos los productos (3);");
            System.out.println("— borrar un producto (4);");
            System.out.println("— modificar un producto (5);");
            System.out.println("— salir (6).");
            
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    objlista.agregarLibro();    
                break;
                
                case 2:
                    objlista.buscar();    
                break;    
                
                case 3:
                    objlista.consultaGral();
                    
                break;
                
                case 4:
                    objlista.borrar();
                    
                break;
                
                case 5:
                    objlista.modificar();
                    
                break;
                
                case 6:
                    System.out.println("Archivo generado.");
                    objlista.grabar();
                break;
                
                default:
                System.out.println("Error.");
            }       
        }while((opcion >= 1) && (opcion < 6));
    }
}