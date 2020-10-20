import java.util.Scanner;

class sumadenumeros{

    public static void main(String[] args){
        /*
        vamos a crear un programa que se encargue de sumar 2 numeros
        */

        //Instancea del objeto

        Scanner entrada = new Scanner(System.in);

        //variables
        int num1, num2;
        int resultado=0;
        do {
        System.out.println("Ingresa el primer numero: ");
        
        num1 = entrada.nextInt();

        while(num1<0){

            System.out.println("Introduzca un valor positivo porfis: ");
            num1 = entrada.nextInt();
        }
        /*System.out.println("Ingresa el segundo numero: ");
        num2 = entrada.nextInt();
        while(num2<0){

            System.out.println("Introduzca un valor positivo porfis: ");
            num2 = entrada.nextInt();
        }*/
        resultado = resultado + num1;
     } while(num1!= 0);

       
        System.out.println("El resultado es: "+resultado);
    }
}