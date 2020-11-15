import java.util.Scanner;


import javax.swing.JOptionPane;


public class Llamadas {
    char letra;
    int numero =0;
    double credito = 100.00;
    int opcion;
    double llamadasint=0.00;
    double llamadasnac=0.00;
    double celulares=0.00;
    double llamadasints=0.00;
    double llamadasnacs=0.00;
    double celularess=0.00;
    double totals=0.00;
    double total=0.00;
    Scanner entrada = new Scanner(System.in);
    public void Llamadas(){
    
        numero = Integer.parseInt(JOptionPane.showInputDialog("Porfavor digite su numero telefonico de 8 digitos"));
   
     
   if(9999999>=numero || numero>=99999999){
   do{
    numero = Integer.parseInt(JOptionPane.showInputDialog("Porfavor escriba un numero de 8 digitos"));
   }while(9999999>=numero || numero>=99999999);
}
          
do{
    JOptionPane.showMessageDialog(null, "Su numero es "+numero);
    opcion = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer?\n1.- Realizar llamadas\n2.-Checar credito"));
  
      
   switch(opcion){
        case 1:
            llamnum();
        break;
        case 2:
            credito();
            break;


   }
   letra = JOptionPane.showInputDialog("Deseas seguir ocupando este numero?\ndale s si es asi:").charAt(0);
 
}while(letra == 's');

    }
    public void llamnum(){
        llamadasnac = Double.parseDouble(JOptionPane.showInputDialog("Cuantas llamadas locales nacionales\nquiere hacer?"));
        llamadasint = Double.parseDouble(JOptionPane.showInputDialog("Cuantas llamadas locales internacionales\nquiere hacer? "));
        celulares = Double.parseDouble(JOptionPane.showInputDialog("Cuantas llamadas a celulares quiere hacer?"));
        System.out.println("Cuantas llamadas Locales nacionales quiere hacer?");
        
        sumllam();
    JOptionPane.showMessageDialog(null, "De "+llamadasnac+" llamadas nacionales debera pagar "+llamadasnacs+"\nDe "+celulares+" llamadas a celulares debera pagar "+celularess+"\nDe "+llamadasint+" llamadas internacionales debera pagar "+llamadasints+"\nSu monto a pagar por "+total+" llamadas en total es de "+totals);
       
      
    
    
    }
    public void sumllam(){
        llamadasnacs = llamadasnac*0.5;
        llamadasints = llamadasint*0.6;
        celularess = celulares*0.2;
        total = celulares+llamadasint+llamadasnac;
        totals=celularess+llamadasints+llamadasnacs;
        credito= credito - totals;

    }
    public void credito(){
        JOptionPane.showMessageDialog(null, "su credito es de "+credito);
        
    }

}

