import java.util.Scanner;

class estructura4{

    public static void main(String[] args){
      Scanner entrada = new Scanner(System.in);

      int numero, exp, digito, opcion, abono, shampo, tacos, condones, mole, total, producto, factor;
      int arriba = 2;
      int abajo = 1;
      int negativo = 0;
      int positivo = 0;
      char socios, letra;
      int edad = 0;
      
      double binario, descuento, grados, perimetro, base, altura;
      double resultado = 0;
      
      do{
        //el cuerpo del programa
             System.out.println("3IV8_Yaniz_Sanchez_DiegoNathan");
             System.out.println("Elija la opcion deseada: ");
             System.out.println("1.- Compra de abono ");
             System.out.println("2.- Convertir decimal a Binario.");
             System.out.println("3.- Transformar tempertatura en Fahrenheit a otros. ");
             System.out.println("4.- Contar cuales numeros son positivos y cuantos negativos");
             System.out.println("5.- El total de su compra ");
             System.out.println("6.- areas y volumenes ");
             System.out.println("7.- Tabla de valores)");
             System.out.println("8.- Factorial de numero positivo");
             System.out.println("9.- Terminar el programa Owo");
             
                opcion = entrada.nextInt();
                switch (opcion) {
                 case 1:
                    do{
                    System.out.println("Ingrese su edad");
                    edad = entrada.nextInt();
                                

                    while(edad <= 4){
                        System.out.println("Elija un numero mayor de 4");
                     edad = entrada.nextInt();
                     
                    }
                    if(edad <22 ){
                         System.out.println("Sus padres son miembros? si lo son escriba s, si no, escriba cualquier otra letra");
                         socios = entrada.next().charAt(0);
                         if (socios == 's'){
                            System.out.println("tiene un descuento del 45% el abono cuesta $100, pero para usted cuesta $55");
                            System.out.println("¿cuanto quiere comprar?:");
                            abono = entrada.nextInt();;

                            descuento = abono * 55;
                            System.out.println("Lo que debera pagar sera:"+descuento);
                            
                            

                         }
                         else{ System.out.println("tiene un descuento del 25%, el abono cuesta $100, pero para usted cuesta $75");
                            System.out.println("¿cuanto quiere comprar?:");
                            abono = entrada.nextInt();

                             descuento = abono * 75;
                            System.out.println("Lo que debera pagar sera:"+descuento);
                        }
                            

                    }
                    else{if(edad<=64){System.out.println("Para usted mi amigo el abono esta en $100");
                    System.out.println("¿cuanto quiere comprar?:");
                    abono = entrada.nextInt();

                    descuento = abono*100;
                    System.out.println("Lo que debera pagar sera:"+descuento);}
                    else{
                        System.out.println("tiene un descuento del 40% el abono cuesta $100, pero para usted cuesta $60");
                        System.out.println("¿cuanto quiere comprar?:");
                        abono = entrada.nextInt();

                        descuento = abono*60;
                        System.out.println("Lo que debera pagar sera:"+descuento);
                 }}

                    
                 System.out.println("¿deseas repetir este programa?, si lo desea escriba s");
                
                   letra = entrada.next().charAt(0);
                  }while(letra == 's');
                  break; 
                      
                 case 2: 
                    do{
                        do{ 
                         System.out.print("Introduce un numero entero >= 0: ");                                                
                         numero = entrada.nextInt();
                         }     while(numero < 0);

                     exp=0;
                     binario=0;
                     while(numero!=0){
                     digito = numero % 2;           
                     binario = binario + digito * Math.pow(10, exp);                                                   
                      exp++;
                      numero = numero/2;
    
                     }

                     System.out.printf("Binario: %.0f %n", binario);
                     System.out.println("¿deseas repetir este programa?, si lo desea escriba s");
                
                     letra = entrada.next().charAt(0);
                    }while(letra == 's'); 
                     break;
                 case 3:
                 do{
                 System.out.println("Elija la opcion deseada: ");
                 System.out.println("1.- De FAHRENHEIT a Celsius ");
                 System.out.println("2.- De Fahrenheit a Kelvine.");
                 System.out.println("3.- De Fahrenheit a Rankine ");
                 opcion = entrada.nextInt();
                  switch (opcion) {
                     case 1:
                     System.out.println("ingrese los grados Fahrenheit");
                     grados = entrada.nextDouble();
                     System.out.println(grados);

                     resultado = (grados-32)*5/9;
                     System.out.println("los grados Celsius son:"+resultado);
                     break;
                     case 2:
                     System.out.println("ingrese los grados Fahrenheit");
                     grados = entrada.nextDouble();
                     System.out.println(grados);
                     resultado = (grados-32)*5/9+273.15;
                     
                     System.out.println("los grados Kelvin son:"+resultado);
                     break;
                     case 3:
                     System.out.println("ingrese los grados Fahrenheit");
                     grados = entrada.nextDouble();
                     System.out.println(grados);
                     resultado = grados+459.67;
                     
                     System.out.println("los grados Rankine son:"+resultado);
                     break;
                  }
                  System.out.println("¿deseas repetir este programa?, si lo desea escriba s");
                
                   letra = entrada.next().charAt(0);
                  }while(letra == 's'); 
                  break;
                 case 4:
                 do{
                  do{
                     System.out.println("Introduzca un numero negativo o positivo, para parar escriba 0");
                     numero = entrada.nextInt();
                     if(numero>0){
                        positivo = positivo + 1;
                     }
                     if(numero<0){
                        negativo = negativo + 1;
                     }
                  }while(numero!=0 );
                  System.out.println("la cantidad de numeros negativos son: "+negativo);
                  System.out.println("la cantidad de numeros positivos son: "+positivo);
                  positivo = 0;
                  negativo = 0;
                  System.out.println("¿deseas repetir este programa?, si lo desea escriba s");
                
                   letra = entrada.next().charAt(0);
                  }while(letra == 's');
                  break;
                 case 5:
                 do{
                  System.out.println("espero que haya encontrado lo necesario");
                  System.out.println("Cuantos shampoos compro? $20 cada shampoo");
                  shampo = entrada.nextInt();
                  total= 20*shampo;
                  System.out.println("Cuantos moles compro $10 cada mole");
                  mole = entrada.nextInt();
                  total= total + mole*10;
                  System.out.println("Cuantos tacos compro? $15 cada taco");
                  tacos = entrada.nextInt();
                  total= total+ tacos*15;
                  System.out.println("Cuantas cajas de condones compro? $60 cada caja de condondes");
                  condones = entrada.nextInt();
                  total= total+ condones*60;
                  System.out.println(shampo+" shampoo: $"+(shampo*20) );
                  System.out.println(mole+" mole: $"+(mole*10) );
                  System.out.println(tacos+" tacos: $"+(tacos*15) );
                  System.out.println(condones+" condones: $"+(condones*60) );
                  producto= condones+shampo+tacos+mole;
                  System.out.println(producto+" productos comprados");
                  System.out.println("Precio Total: $"+total );
                  System.out.println("¿deseas repetir este programa?, si lo desea escriba s");
                  
                   letra = entrada.next().charAt(0);
                       
                   }while(letra == 's'); 
                   break;
                  case 6:
                  do{
                  System.out.println("Elija la opcion deseada: ");
                  System.out.println("1.- Area y perimetro de un rectangulo");
                  System.out.println("2.- Area y perimetro de un triangulo");
                  System.out.println("3.- Volumen de una esfera");
                  System.out.println("4.- Volumen de un cilindro");
                  opcion = entrada.nextInt();
                   switch (opcion) {
                      case 1:
                      System.out.println("Ingresa el valor de la base");
                      base = entrada.nextInt();

                      System.out.println("Ingresa el valor de la altura");
                      altura = entrada.nextInt();

                      resultado = (base*altura);
                      perimetro = (2*base)+(2*altura);
                      System.out.println("El area del rectangulo es de: "+resultado);
                      System.out.println("El perimetro del rectangulo es de: "+perimetro);
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
                       resultado = (base*base*base)*4.188;
                       System.out.println("El area de la esfera es: "+resultado);
                       break;
                      case 4:
                      System.out.println("Ingresa el valor del radio");
                      base = entrada.nextInt();
                      System.out.println("Ingresa el valor de la altura");
                      altura = entrada.nextInt();
                      resultado = 3.1416*base*base;
                      resultado = resultado * altura;
                      
                      System.out.println("El volumen de cilindro es de: "+resultado);
                        break;
                     }
                   System.out.println("¿deseas repetir este programa?, si lo desea escriba s");
                
                   letra = entrada.next().charAt(0);
                  }while(letra == 's'); 
                  break;
                  case 7:
                 do{
                  System.out.println("\tN\t\t\t");
                  System.out.println("\t1\t10\t100\t1000");
                  System.out.println("\t2\t20\t200\t2000");
                  System.out.println("\t3\t30\t300\t3000");
                  System.out.println("\t4\t40\t400\t4000");
                  System.out.println("\t5\t50\t500\t5000");
                  System.out.println("\t6\t60\t600\t6000");
                  System.out.println("\t7\t70\t700\t7000");
                  System.out.println("\t8\t80\t800\t8000");
                  System.out.println("\t9\t90\t900\t9000");
                  System.out.println("\t10\t100\t1000\t1000");
                  System.out.println("¿deseas repetir este programa?, si lo desea escriba s");
                
                letra = entrada.next().charAt(0);
        
                }while(letra == 's'); 
               break;
                  case 8:
                  do{
                  System.out.println("Escriba el numero del cual quiere sacar la factorial");
                  numero = entrada.nextInt();
                  if(numero!=1){
                     if(numero!=2){
                     do{
                     abajo= abajo*arriba;
                     System.out.println("La factorial es: "+abajo);
                     
                     System.out.println(abajo);
                     
                     arriba= arriba + 1;
                     System.out.println(arriba);
                     
                     
                  }while(numero+1 != arriba);
                  System.out.println("La factorial es: "+abajo);
                } else{System.out.println("La factorial es: 2");}
                  ;
                }
                  else {System.out.println("La factorial es: 1");}
                  
                  System.out.println("¿deseas repetir este programa?, si lo desea escriba s");
                //recibir una respuesta de si o no
                //booleano o un char s
                letra = entrada.next().charAt(0);
        
                //si utilizamos char se usa '' 
                //si usamos string   se usa ""
                //char num = 1       1 + 1 = 11
        
                }while(letra == 's'); 
                break;
                  
                  default:
                 
                 
                 
                }
                System.out.println("¿deseas volver al menu uwu?, si lo desea escriba s");
                //recibir una respuesta de si o no
                //booleano o un char s
                letra = entrada.next().charAt(0);
        
                //si utilizamos char se usa '' 
                //si usamos string   se usa ""
                //char num = 1       1 + 1 = 11
        
            }while(letra == 's'); 
        }
     }
  
        
            

