import javax.swing.JOptionPane;



import java.io.*;
import java.util.Scanner;


public class Juego{
    public char [] [] tablero = new char [3][3];
    int[] numeros = new int[10]; 
    String nombre1, nombre2;
    char ficha2, ficha1, regresa1, regresa2;
    int i,j;
    Scanner entrada = new Scanner(System.in);
    int opcion = 0;
    int ganador = 0;
    String cambiar1;
    
    
    
    public Juego(){
    

    }

    public void Empezar(){
        JOptionPane.showMessageDialog(null,"Listos para la batalla mas dura de sus vidas?");
        JOptionPane.showMessageDialog(null,"Empezaremos por saber quien eres Jugador 1");
    
        Jugador1 J1 =new Jugador1("",'s'); 
        J1.mostrarJ1();


        JOptionPane.showMessageDialog(null,"Seguiremos contigo Jugador 2");
        Jugador2 J2 =new Jugador2("",'s'); 
        J2.mostrarJ2();
        ficha2 = J2.getFichaj22();
        ficha1 = J1.getFichaj11();
        nombre1 = J1.getNombrej11();
        nombre2 = J2.getNombrej22();


        juego();
         
       
    }
    
    public void juego(){
        Posiciontablero();
       
        
        do{
        
        imprimirgato();
        System.out.println("Elija el numero de su casilla jugador "+nombre1);
        Eleccioncasillaj1();
        Ganador1();
       
        if(ganador ==0){
        imprimirgato();
        System.out.println("Elija el numero de su casilla jugador "+nombre2);
        Eleccioncasillaj2();
        Ganador2();
        
        }
       

        }while(ganador == 0);
       
        if(ganador == 1){
            JOptionPane.showMessageDialog(null,"Felicidades kamarada"+nombre1+"\nUsted ha ganado esta guerra y \n ha puesto en alto el nombre de su nacion");
        }
        if(ganador == 2){
            JOptionPane.showMessageDialog(null,"Hoy se demostro que los jugadores 2, no son unos segundones\n y todo gracias a usted, señor"+nombre2+"\n gracias por poner en alto nuestros nombres");

        }


        
        
        
    }
    public void Ganavertical1(){
         //ganar vertical

         if(tablero[0][0]==tablero[0][1]&&tablero[0][0]==tablero[0][2]){
            ganador = 1;
        }
        if (tablero[1][0]==tablero[1][1]&&tablero[1][0]==tablero[1][2]){
            ganador = 1;
        }
        if (tablero[2][0]==tablero[2][1]&&tablero[2][0]==tablero[2][2]){
            ganador = 1;
        }

    }
    public void Ganahorizontal1(){
         //ganar horizontal
         if (tablero[0][0]==tablero[1][0]&&tablero[0][0]==tablero[2][0]){
            ganador = 1;
        }
        if (tablero[0][1]==tablero[1][1]&&tablero[0][1]==tablero[2][1]){
            ganador = 1;
        }
        if (tablero[0][2]==tablero[1][2]&&tablero[0][2]==tablero[2][2]){
            ganador = 1;
        }

    }
    public void GanarDiagonal1(){
         //ganar diagonal
         if(tablero[1][1]==tablero[0][0]&&tablero[1][1]==tablero[2][2]){
            ganador = 1;
           
       }  
       if(tablero[1][1]==tablero[0][2]&&tablero[1][1]==tablero[2][0]){
           ganador =1;
       }
    }



    public void Ganador1(){
        GanarDiagonal1();
        Ganahorizontal1();
        Ganavertical1();
    }
    public void Ganavertical2(){
        //ganar vertical

        if(tablero[0][0]==tablero[0][1]&&tablero[0][0]==tablero[0][2]){
           ganador = 2;
       }
       if (tablero[1][0]==tablero[1][1]&&tablero[1][0]==tablero[1][2]){
           ganador = 2;
       }
       if (tablero[2][0]==tablero[2][1]&&tablero[2][0]==tablero[2][2]){
           ganador = 2;
       }

   }
   public void Ganahorizontal2(){
        //ganar horizontal
        if (tablero[0][0]==tablero[1][0]&&tablero[0][0]==tablero[2][0]){
           ganador = 2;
       }
       if (tablero[0][1]==tablero[1][1]&&tablero[0][1]==tablero[2][1]){
           ganador = 2;
       }
       if (tablero[0][2]==tablero[1][2]&&tablero[0][2]==tablero[2][2]){
           ganador = 2;
       }

   }
   public void GanarDiagonal2(){
        //ganar diagonal
        if(tablero[1][1]==tablero[0][0]&&tablero[1][1]==tablero[2][2]){
           ganador = 2;
          
      }  
      if(tablero[1][1]==tablero[0][2]&&tablero[1][1]==tablero[2][0]){
          ganador =2;
      }
   }



   public void Ganador2(){
       GanarDiagonal2();
       Ganahorizontal2();
       Ganavertical2();
   }

    public void Eleccioncasillaj1(){
               
        opcion = entrada.nextInt();
        if(opcion<1){
            System.out.println("porfavor escoja un numero entre el 1 y el 9");
            imprimirgato();
            Eleccioncasillaj1();
        }    

        switch(opcion){
            case 1:
            Elegircasilla1j1();
            break;
            case 2:
            Elegircasilla2j1();
            break;
            case 3:
            Elegircasilla3j1();
            break;
            case 4:
            Elegircasilla4j1();
            break;
            case 5:
            Elegircasilla5j1();
            break;
            case 6:
            Elegircasilla6j1();
            break;
            case 7:
            Elegircasilla7j1();
            break;
            case 8:
            Elegircasilla8j1();
            break;
            case 9:
            Elegircasilla9j1();
            break;

            default:
            System.out.println("porfavor escoja un numero entre el 1 y el 9");
            imprimirgato();
            Eleccioncasillaj1();
            break;
            
          
          
            

        }

            
      }

    
    
      public void Elegircasilla1j1(){
     
            if(tablero[0][0]==ficha1){
                System.out.println("Esa casilla ya es tuya, no seas avorazado");
               
                Eleccioncasillaj1();

            }else{ 
               
                if(tablero[0][0]==ficha2){
                    System.out.println("Esa casilla ya le pertenece a tu compa, respetalo");
                    
                    Eleccioncasillaj1();
                }
            }
                            
                    
            tablero[0][0]= ficha1;

      }
      public void Elegircasilla2j1(){

            if(tablero[0][1]==ficha1){
                System.out.println("Esa casilla ya es tuya, no seas avorazado");
                
                Eleccioncasillaj1();

            }else{ 
             
                if(tablero[0][1]==ficha2){
                    System.out.println("Esa casilla ya le pertenece a tu compa, respetalo");
                   
                    Eleccioncasillaj1();
                }
            }
                

                
                    
         
        tablero[0][1]= ficha1;

      }
      public void Elegircasilla3j1(){
  
            if(tablero[0][2]==ficha1){
                System.out.println("Esa casilla ya es tuya, no seas avorazado");
            
                Eleccioncasillaj1();
            }else{ 
               
                if(tablero[0][2]==ficha2){
                    System.out.println("Esa casilla ya le pertenece a tu compa, respetalo");
                   
                    Eleccioncasillaj1();
                }
                

                
                    
            }
        tablero[0][2]= ficha1;

      }
      public void Elegircasilla4j1(){
      
            if(tablero[1][0]==ficha1){
                System.out.println("Esa casilla ya es tuya, no seas avorazado");
                Eleccioncasillaj1();

            }else{ 
            
                if(tablero[1][0]==ficha2){
                    System.out.println("Esa casilla ya le pertenece a tu compa, respetalo");
                    Eleccioncasillaj1();
                }
            }
                

                
                    
          
        tablero[1][0]= ficha1;

      }
      public void Elegircasilla5j1(){
        
            if(tablero[1][1]==ficha1){
                System.out.println("Esa casilla ya es tuya, no seas avorazado");
                Eleccioncasillaj1();

            }else{ 
           
                if(tablero[1][1]==ficha2){
                    System.out.println("Esa casilla ya le pertenece a tu compa, respetalo");
                    Eleccioncasillaj1();
                }
                

                
                    
            
                
            }
        
        tablero[1][1]= ficha1;

      }
      public void Elegircasilla6j1(){
        
            if(tablero[1][2]==ficha1){
                System.out.println("Esa casilla ya es tuya, no seas avorazado");
                Eleccioncasillaj1();

            }else{ 
               
                if(tablero[1][2]==ficha2){
                    System.out.println("Esa casilla ya le pertenece a tu compa, respetalo");
                    Eleccioncasillaj1();
                }
                

                
                    
            }
        tablero[1][2]= ficha1;

      }
      public void Elegircasilla7j1(){
       
            if(tablero[2][0]==ficha1){
                System.out.println("Esa casilla ya es tuya, no seas avorazado");
                Eleccioncasillaj1();

            }else{ 
               
                if(tablero[2][0]==ficha2){
                    System.out.println("Esa casilla ya le pertenece a tu compa, respetalo");
                    Eleccioncasillaj1();
                }
                

                
                    
            }
        tablero[2][0]= ficha1;

      }
      public void Elegircasilla8j1(){
       
            if(tablero[2][1]==ficha1){
                System.out.println("Esa casilla ya es tuya, no seas avorazado");
                Eleccioncasillaj1();

            }else{ 
               
                if(tablero[2][1]==ficha2){
                    System.out.println("Esa casilla ya le pertenece a tu compa, respetalo");
                    Eleccioncasillaj1();
                }
                

                
                    
            }
        tablero[2][1]= ficha1;

      }
      public void Elegircasilla9j1(){
       
            if(tablero[2][2]==ficha1){
                System.out.println("Esa casilla ya es tuya, no seas avorazado");
                Eleccioncasillaj1();

            }else{ 
               
                if(tablero[2][2]==ficha2){
                    System.out.println("Esa casilla ya le pertenece a tu compa, respetalo");
                    Eleccioncasillaj1();
                }
                

                
                    
            }
        tablero[2][2]= ficha1;

      }
      public void Eleccioncasillaj2(){
        
        opcion = entrada.nextInt();
        if(opcion<1){
            System.out.println("porfavor escoja un numero entre el 1 y el 9");
            imprimirgato();
            Eleccioncasillaj2();
        }    

        switch(opcion){
            case 1:
            Elegircasilla1j2();
            break;
            case 2:
            Elegircasilla2j2();
            break;
            case 3:
            Elegircasilla3j2();
            break;
            case 4:
            Elegircasilla4j2();
            break;
            case 5:
            Elegircasilla5j2();
            break;
            case 6:
            Elegircasilla6j2();
            break;
            case 7:
            Elegircasilla7j2();
            break;
            case 8:
            Elegircasilla8j2();
            break;
            case 9:
            Elegircasilla9j2();
            break;

            default:
            System.out.println("porfavor escoja un numero entre el 1 y el 9");
            imprimirgato();
            Eleccioncasillaj2();
            break;
            
          
          
            

        }

            
      }

    
    
      public void Elegircasilla1j2(){
    
            if(tablero[0][0]==ficha2){
                System.out.println("Esa casilla ya es tuya, no seas avorazado");
                Eleccioncasillaj2();

            }else{ 
              
                if(tablero[0][0]==ficha1){
                    System.out.println("Esa casilla ya le pertenece a tu compa, respetalo");
                    Eleccioncasillaj2();
                }
                

                
                    
            }
        tablero[0][0]= ficha2;

      }
      public void Elegircasilla2j2(){
        
            if(tablero[0][1]==ficha2){
                System.out.println("Esa casilla ya es tuya, no seas avorazado");
                Eleccioncasillaj2();

            }else{ 
              
                if(tablero[0][1]==ficha1){
                    System.out.println("Esa casilla ya le pertenece a tu compa, respetalo");
                    Eleccioncasillaj2();
                }
                

                
                    
            }
        tablero[0][1]= ficha2;

      }
      public void Elegircasilla3j2(){
      
            if(tablero[0][2]==ficha2){
                System.out.println("Esa casilla ya es tuya, no seas avorazado");
                Eleccioncasillaj2();

            }else{ 
              
                if(tablero[0][2]==ficha1){
                    System.out.println("Esa casilla ya le pertenece a tu compa, respetalo");
                    Eleccioncasillaj2();
                }
                

                
                    
            }
        tablero[0][2]= ficha2;

      }
      public void Elegircasilla4j2(){
        
            if(tablero[1][0]==ficha2){
                System.out.println("Esa casilla ya es tuya, no seas avorazado");
                Eleccioncasillaj2();

            }else{ 
              
                if(tablero[1][0]==ficha1){
                    System.out.println("Esa casilla ya le pertenece a tu compa, respetalo");
                    Eleccioncasillaj2();
                }
                

                
                    
            }
        tablero[1][0]= ficha2;

      }
      public void Elegircasilla5j2(){
  
            if(tablero[1][1]==ficha2){
                System.out.println("Esa casilla ya es tuya, no seas avorazado");
                Eleccioncasillaj2();

            }else{ 
               
                if(tablero[1][1]==ficha1){
                    System.out.println("Esa casilla ya le pertenece a tu compa, respetalo");
                    Eleccioncasillaj2();
                }
                

                
                    
            }
        tablero[1][1]= ficha2;

      }
      public void Elegircasilla6j2(){
        
            if(tablero[1][2]==ficha2){
                System.out.println("Esa casilla ya es tuya, no seas avorazado");
                Eleccioncasillaj2();

            }else{ 
           
                if(tablero[1][2]==ficha1){
                    System.out.println("Esa casilla ya le pertenece a tu compa, respetalo");
                    Eleccioncasillaj2();
                }
                

                
                    
            }
        tablero[1][2]= ficha2;

      }
      public void Elegircasilla7j2(){
       
            if(tablero[2][0]==ficha2){
                System.out.println("Esa casilla ya es tuya, no seas avorazado");
                Eleccioncasillaj2();

            }else{ 
              
                if(tablero[2][0]==ficha1){
                    System.out.println("Esa casilla ya le pertenece a tu compa, respetalo");
                    Eleccioncasillaj2();
                }
                

                
                    
            }
        tablero[2][0]= ficha2;

      }
      public void Elegircasilla8j2(){
      
            if(tablero[2][1]==ficha2){
                System.out.println("Esa casilla ya es tuya, no seas avorazado");
                Eleccioncasillaj2();

            }else{ 
             
                if(tablero[2][1]==ficha1){
                    System.out.println("Esa casilla ya le pertenece a tu compa, respetalo");
                    Eleccioncasillaj2();
                }
                

                
                    
            }
        tablero[2][1]= ficha2;

      }
      public void Elegircasilla9j2(){
        
            if(tablero[2][2]==ficha2){
                System.out.println("Esa casilla ya es tuya, no seas avorazado");
                Eleccioncasillaj2();
            }else{ 
              
                if(tablero[2][2]==ficha1){
                    System.out.println("Esa casilla ya le pertenece a tu compa, respetalo");
                    Eleccioncasillaj2();
                }
                

                
                    
            }
        tablero[2][2]= ficha2;

      }
    
        

    

    public void Posiciontablero(){
        int posicion=1; 
        for (int i=0; i < tablero.length; i++) {
            for (int j=0; j < tablero[i].length; j++) {
                
                tablero[i][j] = Integer.toString(posicion).charAt(0);
                posicion = posicion+1;
                


            }
        }

    }




    public void imprimirgato(){    
    for (int i=0; i < tablero.length; i++) {
            System.out.print("|");
            for (int j=0; j < tablero[i].length; j++) {
              System.out.print (tablero[i][j]);
              if (j!=tablero[i].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }
          }
        
   
   

    


    
}
