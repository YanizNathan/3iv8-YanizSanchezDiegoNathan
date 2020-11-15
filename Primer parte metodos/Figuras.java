import java.util.Scanner;

import javax.swing.JOptionPane;
public class Figuras {
    Scanner entrada = new Scanner(System.in);
    double resultado;
    double perimetro;
    int base, altura, opcion;
    
    public void Figuras(){
       
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Que quieres calcular?\n1.-Calcular el area y el perimetro de un cuadrado y perimetro\n2.- Calcular el area y el perimetro de un triangulo isoseles y perimetro\n3.- Calcular el area y el perimetro de un circulo y perimetro\n4.- Calcular el area y el perimetro de un rectangulo y perimetro"));
             
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
        base = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor del radio"));
        Circal();
        JOptionPane.showMessageDialog(null, "El area del circulo es de: "+resultado+"\nEl perimetro del circulo es de: "+perimetro);
        



    }
    public void Circal(){
        resultado = 3.1416*base*base;
        perimetro = 3.1416 * (2*base);

            
        
    }
    public void Rectangulo(){
        base = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la base"));

        altura = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la altura"));
        Recal();
        JOptionPane.showMessageDialog(null, "El area del rectangulo es de: "+resultado+"\nEl perimetro del rectangulo es de: "+perimetro);
           

    }
    public void Recal(){
        resultado = (base*altura);
        perimetro = (2*base)+(2*altura);
       
    }
    public void Cuadrado(){
        base = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor del lado"));
        Cuadcal();
        JOptionPane.showMessageDialog(null, "El area del cuadrado es de: "+resultado+"\nEl perimetro del cuadrado es de: "+perimetro);

    }
    public void Cuadcal(){
        resultado = base*base;
        perimetro = base * 4;
        

    }
    public void Triangulo(){
        base = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la base"));

        altura = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la altura"));
        Triancal();
        JOptionPane.showMessageDialog(null, "El area del triangulo es de: "+resultado+"\nEl perimetro del triangulo es de: "+perimetro);
    }
    public void Triancal(){
        resultado = (base*altura)/2;
        perimetro = (altura*2)+base;
    }
    
}

