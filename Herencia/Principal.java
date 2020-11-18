/*
va a ser la clase principal para poder hacer las invocaciones de las diferentes 
objetos de la clase y sus metodos de un reino animal

*/
import java.util.*;

public class Principal{
    //al metodo principal de todo el programa
    public static void main(String[]args){
        // y ahora no ponemos anda y tulizare git como se debe

        //ahora vamos a realizar los objetos de las clases y sus invocaciones

        Perro dog =new Perro("Teddy", "Callejero", "Croquetas", 2, "fuerte" ); 
        Gato cat = new Gato("Miau", "Hogareño", "atun", 1, 7);
     
        
        //dog.setNombre(variable);

        //los metodos
        dog.mostrarPerro();
        cat.mostrarGato();
        System.out.println("-------");
        }







    }   