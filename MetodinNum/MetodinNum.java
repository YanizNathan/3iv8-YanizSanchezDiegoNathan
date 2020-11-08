/*
 el uso de metodos dentro de una classe nos va a ayudar a organizar el codigo de 
forma que se pueda dividir en diferentes procesos que se encarguen de realizar diferentes acciones
o funciones.
asi como en los ejemplos anteriores que hemos visto que el codigo 
empieza a crecer de forma exponensial, llega un momento 
donde no se tiene orden en las diferentes operaciones o funciones, es por llo 
que es importante el utilizar metodos que ayuden a la clase a ser más rapida al momento de ejecutar las tareas.abstract
*/

 import java.util.Scanner;
 public class MetodinNum{
    int m;
    String letra;
    // Scanner entrada=new Scanner(System.in);

    /*
     * programa que se encargue de saber cual es el numero mayor y menor utilizando
     * metodos para optimizar su operacion
     */

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String letra;
        MetodinNum maymen = new MetodinNum();
        do {
            maymen.cargarValores();
            System.out.println("deseas repetir? OWo");
            
            
            letra = entrada.nextLine();
        

        }while(letra !="s");
           
        //cuerpo principal
    }

    /* vamos a crear un metodo que tenga el menu de opciones*/
    //el menu de operaciones
    //palabra reservada vacio para metodos que
    // no necesitan parametros

    public void cargarValores(){

        Scanner entrada=new Scanner(System.in);

        //variables

        int val1, val2, val3;
        int mayor, menor;
        
        System.out.println("Ingresa el primer numero a comparar");
        val1= entrada.nextInt();
        System.out.println("Ingresa el segundo numero a comparar");
        val2= entrada.nextInt();
        System.out.println("Ingresa el tercer numero a comparar");
        val3= entrada.nextInt();

        /* llamar un metodo que se encargue 
        de conocer cual es mayor y cual es menor*/

        mayor= calcularMayor(val1, val2, val3);
        menor= calcularMenor(val1, val2, val3);

        System.out.println("el valor mayor es: "+ mayor);
        System.out.println("el valor menor es: "+menor);
    }

    public int calcularMayor(int v1, int v2, int v3){
        //vamos a realizar las operaciones
        //para saber quien es el más grande
        //necesitamos retornar le valor mas grande
        //int m;
        if(v1>v2 && v1>v3){

            //asigno el v1 a m
            m=v1;

        }else{
            if(v2>v3){
                m=v2;

            }else{
                m=v3;;
            }
        }
        return m;
    }
    public int calcularMenor(int v1, int v2, int v3){
        //vamos a realizar las operaciones
        //para saber quien es el más grande
        //necesitamos retornar le valor mas grande
       //int m;
        if(v1<v2 && v1<v3){

            //asigno el v1 a m
            m=v1;

        }else{
            if(v2<v3){
                m=v2;

            }else{
                m=v3;;
            }
        }
        return m;
    }
 }