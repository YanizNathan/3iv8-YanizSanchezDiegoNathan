import java.util.Scanner;

class figurasClasico{

    /*
    vamos a crear un programa que se encargue de realizar
    un menu en el cual se pueda elegir entre calcular
    el area o el perimetro de las siguientes figuras
    triangulo
    cuadrado
    circulo
    actualizacion, ahora quiero que se repita todo el programa
    para volver a calcular otra area,
    como trabajo
    ustedes deben agregar las opciones del perimetro
    y dos figuras mas
    rectangulo pentagono
    */

    public static void main(String[] args){

        //instancea de nuestro objeto
        Scanner entrada = new Scanner(System.in);

        //variables
        int base, altura, opcion;
        char letra;
        //char es el tipo de dato y letra es el nombre de la variable
        double resultado;
        double perimetro;
    do{
        //el cuerpo del programa
        System.out.println("Elija la opcion deseada: ");
        System.out.println("1.- Calcular el area y el perimetro de un cuadrado y perimetro ");
        System.out.println("2.- Calcular el area y el perimetro de un triangulo equilatero y perimetro");
        System.out.println("3.- Calcular el area y el perimetro de un circulo y perimetro ");
        System.out.println("4.- Calcular el area y el perimetro de un rectangulo y perimetro");
        System.out.println("5.- Calcular el area y el perimetro de un pentagono regular y perimetro ");
        System.out.println("6.- ayos ");

        //asignar la opcion

        opcion = entrada.nextInt();

        //segun, porque vamos a dar opciones a elegir

        switch (opcion) {
            case 1:
                //aqui es donde realizamos las operaciones
                System.out.println("Ingresa el valor del lado");
                base = entrada.nextInt();

                resultado = base*base;
                perimetro = base * 4;
                System.out.println("El area del cuadrado es de: "+resultado);
                System.out.println("El perimetro del cuadrado es de: "+perimetro);
                break;


            case 2:
                System.out.println("Ingresa el valor de la base");
                base = entrada.nextInt();

                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();

                resultado = (base*altura)/2;
                perimetro = base*3;
                System.out.println("El area del triangulo es de: "+resultado);
                System.out.println("El perimetro del triangulo es de: "+perimetro);
                break;

            case 3:
                System.out.println("Ingresa el valor de la radio");
                base = entrada.nextInt();

                resultado = 3.1416*base*base;
                perimetro = 3.1416 * (2*base);

                System.out.println("El area del circulo es de: "+resultado);
                System.out.println("El perimetro del circulo es de: "+perimetro);    
                break;
            case 4:
                System.out.println("Ingresa el valor de la base");
                base = entrada.nextInt();

                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();

                resultado = (base*altura);
                perimetro = (2*base)+(2*altura);
                System.out.println("El area del rectangulo es de: "+resultado);
                System.out.println("El perimetro del rectangulo es de: "+perimetro);
                break;
            case 5:

                System.out.println("Ingresa el valor de la base");
                base = entrada.nextInt();

                
                perimetro= base*5;
                resultado = ((base*5)*(base/1.45))/2;

                System.out.println("El area del pentagono regular es de: "+resultado);
                System.out.println("El perimetro del pentagono es de: "+perimetro);
               
                break;      



            default:
                System.out.println("te me cuidas cruck ");





        }

        System.out.println("¿Deseas repetir el programa?, si lo desea escriba s");
        //recibir una respuesta de si o no
        //booleano o un char s
        letra = entrada.next().charAt(0);

        //si utilizamos char se usa '' 
        //si usamos string   se usa ""
        //char num = 1       1 + 1 = 11

    }while(letra == 's');

        //System.out.println(letra);

    }
} 