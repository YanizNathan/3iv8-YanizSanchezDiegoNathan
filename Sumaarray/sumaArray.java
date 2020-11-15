import java.util.Scanner;
import javax.swing.JOptionPane;
/*
crear programa que se encargue 
de crear un array que almacene 
100 posiciones y sume los numero del 1
al 100 y obtenga la media*/
public class sumaArray{

    public static void main(String[] args){

        //array
       /* int[]numeros = new int[100];
        //variables
        int suma= 0;
        double media=0.00;
        //recorremos el array y le asgnamos numeros
        for(int i=0; i<numeros.length; i++){
            //asignamos los numeros dentro del arreglo
            numeros[i]=i+1;

            //sumamos los numeros
            suma+=numeros[i];

        }

        System.out.println("La suma de los numeros es de: "+suma);
        media= (double)suma/numeros.length;
                  
        //multiplicacion
        /* vamos a crar dos array de numeros con una posicion pasando por 
        el teclado uno de ellos estara rellenado con numero aleatorios y 
        */


        String texto = JOptionPane.showInputDialog("Introduce el tamaño del arreglo");
        //oara cuando tenemos que trnasformar tipos de datos tnemos que usar
        int tamanio = Integer.parseInt(texto);

        //creamos el array
        int array1[]= new int[tamanio];
        int array2[];
        //rellenamos el primer array con un metodo
        rellenarNumAleatoriosArray(array1, 10,100);
        //apuntar el array2 con el array 1
        array2 = array1;

        //creamos un nuevo array usando el array1, que tendra una nueva direccion
        array1=new int[tamanio];
        rellenarNumAleatoriosArray(array1, 10,100);
        //lo volvemos a rellenar

        //contiene el array con el resultado de multiplicar los valores de los array
        int array3[] = multiplicador(array1, array2);

        //vamos a mostrar los arreglos

        System.out.println("Arreglo 1: ");
        //metodo para mostrarlos
        mostrarArray(array1);
        System.out.println("Arreglo 2: ");
        //metodo para mostrarlos
        mostrarArray(array2);
        System.out.println("Arreglo 3: ");
        //metodo para mostrarlos
        mostrarArray(array3);
 
    }

    //metodo de relleno estatico ya que no quiero que se muevan los avlores porque lloro Owo
    public static void rellenarNumAleatoriosArray(int lista[], int a, int b){
        for(int i = 0; i<lista.length; i++){
            //aqui yo asigno los numeros aleatorios
            // tengo que ocupar a libreria Math.random
            //aqui si hay que castear el in
            lista[i] = ((int)Math.floor(Math.random()*(a-b)+b));
        }
    }

    public static void mostrarArray(int lista[]){
        for(int i = 0; i <lista.length; i++){
            System.out.println("En la posicion "+ i+"esta el valor : "+lista[i]);
        }
    }
    //la multiplicacion de arrglos
    public static int[] multiplicador (int array1[], int array2[]){
        
        int array3[] = new int[array1.length];
        //ahora multiplicamos filas por filas
        for(int i = 0; i<array1.length; i++){

            array3[i] = array1[i]*array2[i];

        } 
        return array3;
    }





}