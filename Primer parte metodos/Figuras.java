import java.util.Scanner;
public class Figuras {
    Scanner entrada = new Scanner(System.in);
    double resultado;
    double perimetro;
    int base, altura, opcion;
    
    public void Figuras(){
       

         System.out.println("que quieres calcular? owo");
         System.out.println("Elija la opcion deseada: ");
        System.out.println("1.- Calcular el area y el perimetro de un cuadrado y perimetro ");
        System.out.println("2.- Calcular el area y el perimetro de un triangulo isoseles y perimetro");
        System.out.println("3.- Calcular el area y el perimetro de un circulo y perimetro ");
        System.out.println("4.- Calcular el area y el perimetro de un rectangulo y perimetro");
        opcion = entrada.nextInt();
    
    switch(opcion){
        case 1:
            Cuadrado();
        break;

        case 2:
            Triangulo();
        break;
        
        case 3:
            Circulo();
        break;

        case 4:
            Rectangulo();
        break;
    }

}
    public void Circulo(){
        System.out.println("Ingresa el valor del radio");
        base = entrada.nextInt();
        Circal();
        System.out.println("El area del circulo es de: "+resultado);
        System.out.println("El perimetro del circulo es de: "+perimetro);  



    }
    public void Circal(){
        resultado = 3.1416*base*base;
        perimetro = 3.1416 * (2*base);

            
        
    }
    public void Rectangulo(){
        System.out.println("Ingresa el valor de la base");
        base = entrada.nextInt();

        System.out.println("Ingresa el valor de la altura");
        altura = entrada.nextInt();
        Recal();
        System.out.println("El area del rectangulo es de: "+resultado);
        System.out.println("El perimetro del rectangulo es de: "+perimetro);
           

    }
    public void Recal(){
        resultado = (base*altura);
        perimetro = (2*base)+(2*altura);
       
    }
    public void Cuadrado(){
        System.out.println("Ingresa el valor del lado");
        base = entrada.nextInt();
        Cuadcal();
        System.out.println("El area del cuadrado es de: "+resultado);
        System.out.println("El perimetro del cuadrado es de: "+perimetro);

    }
    public void Cuadcal(){
        resultado = base*base;
        perimetro = base * 4;
        

    }
    public void Triangulo(){
        System.out.println("Ingresa el valor de la base");
        base = entrada.nextInt();

        System.out.println("Ingresa el valor de la altura");
        altura = entrada.nextInt();
        Triancal();
        System.out.println("El area del triangulo es de: "+resultado);
        System.out.println("El perimetro del triangulo es de: "+perimetro);
    }
    public void Triancal(){
        resultado = (base*altura)/2;
        perimetro = (altura*2)+base;
    }
    
}

