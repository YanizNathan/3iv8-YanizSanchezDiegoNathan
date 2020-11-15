import java.util.Scanner;


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
    

   System.out.println("Porfavor digite su numero telefonico de 8 digitos");
   numero = entrada.nextInt();
   
   if(9999999<=numero && numero>=99999999){
   do{
    System.out.println("pls escriba un numero de 8 digitos");
    numero = entrada.nextInt();
   }while(9999999<=numero && numero>=99999999);
}
          
do{
   System.out.println("su numero es "+numero);
   System.out.println("Que desea hacer?");
   System.out.println("1.-Realizar llamadas"); 
   System.out.println("2.-Checar credito");
   opcion = entrada.nextInt();
   
   switch(opcion){
        case 1:
            llamnum();
        break;
        case 2:
            credito();
            break;


   }
   System.out.println("Deseas seguir ocupando este numero? dale s si es asi.");
   letra = entrada.next().charAt(0);
}while(letra == 's');

    }
    public void llamnum(){
        System.out.println("Cuantas llamadas Locales nacionales quiere hacer?");
        llamadasnac = entrada.nextDouble();
        System.out.println("Cuantas llamadas Locales internacionales quiere hacer?");
        llamadasint = entrada.nextDouble();
        System.out.println("Cuantas llamadas a celulares quiere hacer?");
        celulares = entrada.nextDouble();
        sumllam();
        System.out.println("De "+llamadasnac+" llamadas nacionales debera pagar "+llamadasnacs);
        System.out.println("De "+llamadasint+" llamadas internacionales debera pagar "+llamadasints);
        System.out.println("De "+celulares+" llamadas a celulares debera pagar "+celularess);
        System.out.println("Su monto a pagar por "+total+" llamadas en total es de "+totals);
    
    
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
        System.out.println("su credito es de "+credito);
    }

}

