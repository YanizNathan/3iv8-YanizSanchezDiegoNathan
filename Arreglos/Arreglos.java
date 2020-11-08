import java.util.*;
public class Arreglos {
    int m;
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        char letra;
        int opcion;
                   
      do{
      
       System.out.println("que programa desea ejecutar");
       System.out.println("1.-Negativos, positivos y promedio");
       System.out.println("2.-Leer 10 numeros en posiciones pares");
       System.out.println("3.-Leer calificaciones");
       System.out.println("4.-leer matriz a,b y sumarla a s");

       
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
            Arreglos np = new Arreglos();
            do{
                 
                np.neg();
                System.out.println("Deseas empezar el programa de nuez? escriba s si es asi");

                letra = entrada.next().charAt(0);
            }while(letra == 's');
            break;
            case 2:
            Arreglos pares = new Arreglos();
            do{
                
                pares.pares();
                System.out.println("Deseas empezar el programa de nuez? escriba s si es asi");

                letra = entrada.next().charAt(0);
            }while(letra == 's');
            break;
           
            case 3:
            Arreglos calif = new Arreglos();
            do{
                
                calif.calificacion();
                System.out.println("Deseas empezar el programa de nuez? escriba s si es asi");

                letra = entrada.next().charAt(0);
            }while(letra == 's');
            break;

            case 4:
            Arreglos matriz = new Arreglos();
            do{
                
                matriz.matriz();
                System.out.println("Deseas empezar el programa de nuez? escriba s si es asi");

                letra = entrada.next().charAt(0);
            }while(letra == 's');
            break;

        }

            System.out.println("Deseas volver al menu? si es asi dale a la s pls");

            letra = entrada.next().charAt(0);
            }while(letra == 's');





    

    }

            public void neg(){
            
                 Scanner entrada = new Scanner(System.in);
                    int i;
                    int pos = 0, neg = 0; 
                    int[] numeros = new int[10]; 
                    double sumaPos = 0, sumaNeg = 0;               
                    
                   
                    System.out.println("Escriba los numeros de su arreglo: ");
                    for (i = 0; i < 10; i++) {
                        System.out.print("numeros[" + i + "]= ");
                        numeros[i]=entrada.nextInt();
                    }
            
                    
                    for (i = 0; i < 10; i++) {
                        if (numeros[i] > 0){ 
                            sumaPos += numeros[i];
                            pos++;
                        } else if (numeros[i] < 0){ 
                            sumaNeg += numeros[i];
                            neg++;
                        }
                    }
            
                   
                    if (pos != 0) {
                        System.out.println("Media de los valores positivos: " + sumaPos / pos);                
                    } else {
                        System.out.println("No ha introducido numeros positivos");
                    }
                    if (neg != 0) {
                        System.out.println("Media de los valores negativos: " + sumaNeg / neg);
                    } else {
                        System.out.println("No ha introducido numeros negativos");
                    }
                }
                
                
                public void pares(){
                    Scanner entrada = new Scanner(System.in);
                    int i;
                    int[] numeros = new int[10];
                    double media = 0;
            
                   
                    System.out.println("Porfi llene su array Owo: ");
                    for (i = 0; i < 10; i++) {
                        System.out.print("numero [" + i + "]= ");
                        numeros[i] = entrada.nextInt();
                    }
                    
                   
                    for (i = 0; i < 10; i++) {
                        if (i % 2 == 0){ 
                            media = media + numeros[i];
                        }
                    }
                   
                    System.out.println("Media de los valores que se encuentran en posiciones pares: "+ media/5);              
                }

                public void calificacion(){
                    Scanner entrada = new Scanner(System.in);
                    int i;
                    int aprobados = 0;
                    int reprobados = 10;
                    double suma = 0, media;
                    
                  
                    double[] notas = new double[10]; 
                    
                    // Entrada de datos. Se lee la nota de cada alummo y se guarda
                    // en cada elemento del array
                    for (i = 0; i < notas.length; i++) {
                        System.out.print("Alumno " + (i + 1) + " Nota final: ");
                        notas[i] = entrada.nextDouble();
                    }
            
                    // Sumar todas las notas
                    for (i = 0; i < notas.length; i++) {
                        suma = suma + notas[i];
                    }
            
                    // Calcular la media
                    media = suma / notas.length;
            
                    System.out.println("Listado de todas las calificaciones ");
                    for (i = 0; i < notas.length; i++) {
                       
                            System.out.println("Alumno numero " + (i + 1)+ " Nota final: " + notas[i]);
                    }
                    System.out.printf("Nota media del curso: %.2f %n", media);
                    
                   
                    System.out.println("Listado de notas superiores a la media: ");
                    for (i = 0; i < notas.length; i++) {
                        if (notas[i] > media) {
                            System.out.println("Alumno numero " + (i + 1)+ " Nota final: " + notas[i]);
                        }
                    }
                    
                    for (i = 0; i < notas.length; i++) {
                        if (notas[i] >= 6 ) {
                            aprobados= aprobados + 1;
                            
                }
                
            
            }
                reprobados = reprobados - aprobados;   
                System.out.println("alumnos aprobados: "+aprobados);
                    System.out.println("Alumnos reprobados"+reprobados);
                }





                public void matriz(){
                    Scanner entrada = new Scanner(System.in);
                    int arregloa[][] = new int [3][3];
                    int arreglob[][] = new int [3][3];
                    int sumas [][] = new int[arregloa.length][arregloa.length];

                    float arreglos=0;
                    //filas
                    for(int i=0; i<arregloa.length; i++){
                        //columnas
                        for(int j=0; j<arregloa.length; j++){
                            System.out.println("Ingresa el numero de la fila del"
                            + i + " columna " + j + " del arreglo a: ");
                            arregloa[i][j] = entrada.nextInt();
                            
                }
            }
            for(int i=0; i<arreglob.length; i++){
                //columnas
                for(int j=0; j<arreglob.length; j++){
                    System.out.println("Ingresa el numero de la fila "
                    + i + " columna " + j + " del arreglo b: ");
                    arreglob[i][j] = entrada.nextInt();
                }
                    
        }
        int[][] suma = new int[arregloa.length][arregloa[0].length];
        for (int i=0; i < arregloa.length; i++) {
            for (int j=0; j < arregloa[i].length; j++) {				
              suma[i][j]=arregloa[i][j]+arreglob[i][j];		

        }

        }
        for (int i=0; i < sumas.length; i++) {
            System.out.print("|");
            for (int j=0; j < suma[i].length; j++) {
              System.out.print (suma[i][j]);
              if (j!=suma[i].length-1) System.out.print("\t");
            }
            System.out.println("|");
          }
                        }
                    
            } 
                
            
            
            