import java.util.Scanner;

public class Menu{

    Scanner entrada = new Scanner(System.in);

    //Creación del método «menu».
    public void menu(){

        char opcion, letra;

        System.out.println("Yaniz Sanchez Diego Nathan. 3IV8");

        do{
        System.out.println("Seleccione el programa que desea ejecutar.");
        System.out.println("A. Calculadora de edad.");
        System.out.println("B. area y perimemetro.");
        System.out.println("C. Costos Llamadas.");

        opcion = entrada.next().charAt(0);

        
        switch(opcion){
            case 'A':
                
                do{
                    Edad obj = new Edad();
                    obj.Edad();
                
               
                System.out.println("Deseas repetir el programa? dale s si es asi.");
                letra = entrada.next().charAt(0);
                }while(letra == 's');
            break;

            case 'B':
                
                do{
                    Figuras obj = new Figuras();
                    obj.Figuras();
                    System.out.println("Deseas repetir el programa? dale s si es asi.");
                    letra = entrada.next().charAt(0);
                }while(letra == 's');
            break;  

            case 'C':
               
            do{
                Llamadas obj = new Llamadas();
                obj.Llamadas();
                System.out.println("Deseas repetir el programa? dale s si es asi.");
                letra = entrada.next().charAt(0);
            }while(letra == 's');
            break;
        }

        //Se brinda la opción para volver al menú o cerrar el programa.
        System.out.println("Deseas volver al menu? dale s si es asi.");
                letra = entrada.next().charAt(0);
            }while(letra == 's');
    }

}