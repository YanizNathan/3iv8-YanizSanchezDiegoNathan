import java.util.*;
public class Funciones{

    Scanner entrada = new Scanner(System.in);


    public void cadenas(){

        String s1 = "hola wiiiiiiiiiiii la generacion de cristal templato";

        //longitud de cadena

        System.out.println("EL tamaño de la cadena es: "+s1.length());

        //si comienza con...

        System.out.println("la cadena inicia V o F con hola?"+s1.startsWith("hola"));

        //si termina con...

        System.out.println("la cadena termina con plato?"+s1.endsWith("plato"));

        //leer una variable

        System.out.println("ingrese una palabra: ");
        String s2 = entrada.next();
        System.out.println("la palabra es: "+s2);

        //subcadenas, busque la primera

        System.out.println("Parte de una subcadena "+s1.indexOf("ra"));
        
        
        //substraer una palabra de la cadena

        System.out.println("Primera parte: "+s1.substring(12));
        System.out.println("Segunda parte: "+s1.substring(3, 11));

        //convertir una variable a una cadena

        int valor = 24;

        String s22 = String.valueOf(valor);

        System.out.println("El valor es de :"+s22+ " como cadena");

        // convertir una cadena a un numero 

        String s3 = "20";

        int num = Integer.parseInt(s3);

        System.out.println("el valor de es: "+num+ " ahora es un numero");

        //convertir cadena a un decirmal

        String s4 = "20.89";
        Double num1= Double.parseDouble(s4);
        System.out.println("el valor de es: "+num1+" ahora es un numero");

        //metodo toString converte un entero a cadena

        Integer x = 5;
        System.out.println("El valor de "+x.toString()+" Ahora es cadena");
        System.out.println("El valor de "+x.toString(12)+" Ahora es cadena");




    }

}