package ove;

import gato_3.interfaz;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class Ove implements Serializable{
    public static void main() {
        procesos objlista = new procesos();
        int opcion;
        
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a la consola.\n"
                    + "Elija el proceso a realizar:\n"
                    + "— 1.-Nuevo jugador \n"
                    + "— 2.-Saber quienes juegan ;\n"
                    + "— 3.-Cambiar un usuario;\n"
                    + "— 4.-salir, bye bye."));
            
            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null,"Ya estan todos los usuarios"
                            + "posibles registrados :/.");
                break;
                
                case 2:
                    JOptionPane.showMessageDialog(null,"Podras ver los jugadores si al momento,"
                            + "de jugar le das en la casita owo.");
                break;
                
                case 3:
                    objlista.modificar();
                break;
                
                case 4:
                    JOptionPane.showMessageDialog(null,"Guardado Owo.");
                    objlista.grabar();
                break;
                
                default:
                JOptionPane.showMessageDialog(null,"ijoles no se puede");
            }       
        }while((opcion >= 1) && (opcion < 4));
    }
}