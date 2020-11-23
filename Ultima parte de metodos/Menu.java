     
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Menu{

    Scanner entrada = new Scanner(System.in);

    //Creación del método «menu».
    public void menu(){

        char opcion,letra;
        
        
        String cadena;

        
        do{
            
       
        opcion = JOptionPane.showInputDialog("Yaniz Sanchez Diego Nathan. 3IV8\nSeleccione el programa que desea ejecutar\nA.- Sueldo.\nB.-Proovedores\nC.-Libros").charAt(0);

        
        switch(opcion){
            case 'A':
                
                do{
                    Empleados obj = new Empleados();
                    obj.Empleados();
                
               
                    letra = JOptionPane.showInputDialog("Deseas Repetir el programa?\ndale s si es asi:").charAt(0);
                }while(letra == 's');
            break;

            case 'B':
                
                do{
                    Proovedores obj = new Proovedores();
                    obj.Proovedores();
                    letra = JOptionPane.showInputDialog("Deseas Repetir el programa?\ndale s si es asi:").charAt(0);
                }while(letra == 's');
            break;  

            case 'C':
               
            do{
               Libroprin obj = new Libroprin();
               obj.Libroprin();
                letra = JOptionPane.showInputDialog("Deseas Repetir el programa?\ndale s si es asi:").charAt(0);
            }while(letra == 's');
            break;
        }

        //Se brinda la opción para volver al menú o cerrar el programa.
        letra = JOptionPane.showInputDialog("Deseas Volver al menu?\ndale s si es asi:").charAt(0);
            }while(letra == 's');
    }

}
    

