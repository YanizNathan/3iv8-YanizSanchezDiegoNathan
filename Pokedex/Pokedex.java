import java.util.Random;
import java.util.Scanner;

class estructura4{

    public static void main(String[] args){
      Scanner entrada = new Scanner(System.in);
      char letra;
        int squar=38;
        int bulba = 25;
        int charm = 40;
        int enemigov= 30;
        int ganador= 0;
        int prueba = 1;
        int arseus = 151984;
       ;
        int aleatorio = (int)(Math.random()*3+1);
    //hacemos el menu de opciones
        int opcion;
        do{
            //el cuerpo del programa
                 System.out.println("3IV8_Yaniz_Sanchez_DiegoNathan");
                 System.out.println("Entrenador, estos son sus pokemos, elija alguno ");
                 System.out.println("de ellos, llevar a  salir de la pokedex: ");
                 System.out.println("1.- Charmander");
                 System.out.println("2.- Bulbasaur");
                 System.out.println("3.- squartle");
                 System.out.println("4.- Modo de batalla");
                 System.out.println("5.- Salir de la pokedex ");

                //damos a acada opcion lo que debe de hacer cada una
                 opcion = entrada.nextInt();
                 switch (opcion) {
                  case 1:
                 if(charm==0){System.out.println("Pokemon debilitado: ");}
                  else {System.out.println("Usted ha elejido a Charmander");
                  System.out.println("Id: ");
                  System.out.println("Nombre: Charmander");
                  System.out.println("Fuerza: 14 ");
                  System.out.println("Defensa: 5 ");
                  System.out.println("Vida:"+charm);
                  System.out.println("Ataque principal: Lanzallamas");
                  System.out.println("Ataque Secundario: Colmillo ingneo");
                 }
                 break;
                  
                  
                  
                  case 2:
                  System.out.println("Usted ha elejido Squartle");
                  if(bulba==0){System.out.println("Pokemon debilitado: ");}
                  else {System.out.println("Usted ha elejido a Charmander");
                  System.out.println("Id: 2");
                  System.out.println("Nombre: Bulbasaur");
                  System.out.println("Fuerza: 10 ");
                  System.out.println("Defensa: 4 ");
                  System.out.println("Vida: "+ bulba);
                  System.out.println("Ataque principal: Latigo Zepa");
                  System.out.println("Ataque Secundario: Hoja afilada");
                 }
                  break;




                  case 3: 
                  System.out.println("Usted ha elejido Bulbasaur");
                  if(squar==0){System.out.println("Pokemon debilitado: ");}
                  else {System.out.println("Usted ha elejido a Charmander");
                  System.out.println("Id: 3");
                  System.out.println("Nombre: Squartle");
                  System.out.println("Fuerza: 15");
                  System.out.println("Defensa: 7 pts");
                  System.out.println("Vida: "+squar);
                  System.out.println("Ataque principal: Chorro de agua ");
                  System.out.println("Ataque Secundario: Hidro bomba");
                    }
                  break;
                 //empezamos las batallas, damos la opcion de escojer los pokemos
                  case 4:
                  System.out.println("okey entrenador, elija a su pokemon, de 4 para salir");
                  System.out.println("1.- Charmander");
                 System.out.println("2.- Bulbasaur");
                 System.out.println("3.- squartle");
                 System.out.println("4.- salir");
                // repetimos el codigo si esta es menor de 1
                 opcion = entrada.nextInt();
                 if(opcion<0){
                 do{
                    System.out.println("porfavor ingrese un numero mayor a 1");
                    System.out.println("1.- Charmander");
                    System.out.println("2.- Bulbasaur");
                    System.out.println("3.- squartle");
                    System.out.println("4.- salir");
                 }while(opcion<=0);
                }
                 
                 //batalla de charmander


                    
                        switch (opcion) {
                         case 1:
                         System.out.println("Charmander yo te elijo:");
                         System.out.println("Fuera: 25pts");
                         System.out.println("Defensa: 16 pts");
                         System.out.println("Vida: "+charm);
                         
                         
                         
                        switch (aleatorio) {
                            case 1: 
                            System.out.println(" tu enemigo sera: pidgey ");
                           
                           //repetimos hasta que la vida de alguno de los dos llegue a 0
                            do{
                                System.out.println(" tu vida: "+charm);
                                System.out.println(" Vida de pidgey :"+enemigov);
                                System.out.println(" daño del enemigo :12");
                                System.out.println("defensa del enemigo: 3");
                                System.out.println(" que ataque haras?");
                                System.out.println("1.-principal");
                                System.out.println("2.-secundario");
                                System.out.println("3.- Escapar");
                                opcion = entrada.nextInt();
                                switch (opcion) {
                                    case 1:
                                    System.out.println("Usas Lanzallamas ");
                                    enemigov = enemigov-(14*5)/3 ;
                                    System.out.println("Vida de pidgey: "+enemigov);
                                    System.out.println("pidgey usa picotazo");
                                    charm=(12*3)/3;
                                    if(enemigov<=0){
                                        System.out.println("El ganador es charmander");
                                        ganador = 1;
                                         }
                                    if(charm<=0){
                                        System.out.println("El ganador es charmander");
                                        ganador = 2;}
                                    break;

                                    case 2:
                                    System.out.println("Usas colmillo igneo ");
                                    enemigov=enemigov-(14*5/3);
                                    System.out.println("Vida de pidgey: "+enemigov);
                                    
                                    System.out.println("Pidgey usa picotazo");
                                    charm=(12*3)/3;
                                    if(enemigov<=0){
                                        System.out.println("El ganador es charmander");
                                        ganador = 1;
                                         }
                                    if(charm<=0){
                                        System.out.println("El ganador es pidgey");
                                        ganador = 2;}

                                    break;


                                  
                                    
                                    

                                }
                               
                                 //Hacemos una forma de detener el while o de que se repita                         
                            }while(ganador == 0);
                            break;
                            case 2:
                            System.out.println(" tu enemigo sera: rocanrolla ");
                           
                            //repetimos hasta que la vida de alguno de los dos llegue a 0
                             do{
                                 System.out.println(" tu vida: "+charm);
                                 System.out.println(" Vida de arseus :"+enemigov);
                                 System.out.println(" daño del enemigo :10");
                                 System.out.println("defensa del enemigo: 6");
                                 System.out.println(" que ataque haras?");
                                 System.out.println("1.-principal");
                                 System.out.println("2.-secundario");
                                 System.out.println("3.- Escapar");
                                 opcion = entrada.nextInt();
                                 switch (opcion) {
                                     case 1:
                                     System.out.println("Usas Lanzallamas ");
                                     enemigov = enemigov-(14*5)/3 ;
                                     System.out.println("Vida de rocanrolla: "+enemigov);
                                     System.out.println("rocanrolla ocupa girbola");
                                     charm=(10*6)/3;
                                     if(enemigov<=0){
                                         System.out.println("El ganador es charmander");
                                         ganador = 1;
                                          }
                                     if(charm<=0){
                                         System.out.println("El ganador es rocanrolla");
                                         ganador = 2;}
                                     break;
 
                                     case 2:
                                     System.out.println("Usas colmillo igneo ");
                                     enemigov=enemigov-(14*5/3);
                                     System.out.println("Vida de rocanrolla: "+enemigov);
                                     
                                     System.out.println("rocanrolla ocupa girbola");
                                     charm=(10*6)/3;
                                     if(enemigov<=0){
                                         System.out.println("El ganador es charmander");
                                         ganador = 1;
                                          }
                                     if(charm<=0){
                                         System.out.println("El ganador es rocanrolla");
                                         ganador = 2;}
 
                                     break;
                                       }
                                
                                  //Hacemos una forma de detener el while o de que se repita                         
                             }while(ganador == 0);
                             break;

                        
                        case 3:
                        System.out.println(" tu enemigo sera: arseus ");
                       
                        //repetimos hasta que la vida de alguno de los dos llegue a 0
                         do{
                             System.out.println(" tu vida: "+charm);
                             System.out.println(" Vida de arseus :"+arseus);
                             System.out.println(" daño del enemigo :454545");
                             System.out.println("defensa del enemigo: 4747");
                             System.out.println(" que ataque haras?");
                             System.out.println("1.-principal");
                             System.out.println("2.-secundario");
                             System.out.println("3.- Escapar");
                             opcion = entrada.nextInt();
                             switch (opcion) {
                                 case 1:
                                 System.out.println("Usas Lanzallamas ");
                                 arseus = arseus-(14*5)/3 ;
                                 System.out.println("Vida de arseus: "+arseus);
                                 System.out.println("arseus ocupa te vas pa rriba");
                                 charm=(454545*4747)/3;
                                 if(arseus<=0){
                                     System.out.println("El ganador es charmander");
                                     ganador = 1;
                                      }
                                 if(charm<=0){
                                     System.out.println("El ganador es rocanrolla");
                                     ganador = 2;}
                                 break;

                                 case 2:
                                 System.out.println("Usas colmillo igneo ");
                                 arseus = arseus-(14*5/3);
                                 System.out.println("Vida de arseus: "+arseus);
                                 
                                 System.out.println("arseus ocupa dios te pega");
                                 charm=(454545*4747)/3;
                                 if(arseus<=0){
                                     System.out.println("El ganador es arseus");
                                     ganador = 1;
                                      }
                                 if(charm<=0){
                                     System.out.println("El ganador es rocanrolla");
                                     ganador = 2;}

                                 break;
                                   }
                            
                              //Hacemos una forma de detener el while o de que se repita                         
                         }while(ganador == 0);
                         break;

                        }
                         }
                  


                    default:
                 }
                 
                 System.out.println("Deseas empezar el programa de pokedex? escriba s si es asi");
                 
                 letra = entrada.next().charAt(0);
             }while(letra == 's');

    }

}