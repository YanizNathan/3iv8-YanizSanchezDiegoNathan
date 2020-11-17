//en esta clase vamos a comrprobar que pasa cuando pongan letras en lugar de numeros
import java.util.*;
public class operaciones {

    //objeto scanner
    Scanner entrada = new Scanner (System.in);

    int y=0;
    //metodo para verificar un numero

    public void Ejemplo(){
      
            System.out.println("ingresa un valor numerico");
        try{
            y = entrada.nextInt();
            System.out.println("El numero es: "+y);
            //para salir
            System.exit(0);

            //cacha el error mediante objeto e
        }catch(Exception e){
           
            //saber el tipo de error
            System.out.println("Error: "+e.getMessage());
            System.out.println("ingresa solo valores enteros");
            
        }
    }
    
}
