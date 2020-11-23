import java.util.Scanner;

import javax.swing.JOptionPane;
public class Libroprin {
    Scanner sc = new Scanner(System.in);
        String titulo, autor;
        int ejemplares;
        int opcion;
        char letra;

        //se crea el objeto libro1 utilizando el constructor con parámetros
        Libro libro1 = new Libro("El quijote", "Cervantes", 11, 0);
        //se crea el objeto libro2 utilizando el constructor por defecto
        Libro libro2 = new Libro();
        public void Libroprin() {

            titulo = JOptionPane.showInputDialog("Introduce el titulo");
          
       
        
            autor = JOptionPane.showInputDialog("Introduce el autor");
       
            ejemplares = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de ejemplares"));

       
        libro2.setTitulo(titulo);
        libro2.setAutor(autor);
        libro2.setEjemplares(ejemplares);


        do{
        JOptionPane.showMessageDialog(null, "Libro 1:\nTitulo: " + libro1.getTitulo()+"\nAutor: " + libro1.getAutor()+"\nEjemplares: " + libro1.getEjemplares()+"\nPrestados: " + libro1.getPrestados());
        JOptionPane.showMessageDialog(null, "Libro 2:\nTitulo: " + libro2.getTitulo()+"\nAutor: " + libro2.getAutor()+"\nEjemplares: " + libro2.getEjemplares()+"\nPrestados: " + libro2.getPrestados());
            desicion();
            letra = JOptionPane.showInputDialog("Deseas hacer otra accion?\ndale s si es asi:").charAt(0);
        }while(letra == 's');
        }

        public void desicion(){
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Escoja que quiere hacer\n1.-Prestamos de libro 1\n2.-Prestamos de libro 2\n3.-Devolucion de libro 1\n4.-Devolucion de libro 2"));
           switch (opcion){
            case 1:
            prestamo1();
            break;
            case 2:
            prestamo2();
            break;
            case 3:
            devolucion1();
            break;
            case 4:
            devolucion2();

            }

        }

        public void prestamo1(){
        //se realiza un préstamo de libro1. El método devuelve true si se ha podido
        //realizar el préstamo y false en caso contrario
        if (libro1.prestamo()) {
            JOptionPane.showMessageDialog(null,"Se ha prestado el libro " + libro1.getTitulo());
            
        } else {
            JOptionPane.showMessageDialog(null,"No quedan ejemplares del libro " + libro1.getTitulo()+" para prestar");
                     
        }
    }
        public void devolucion1(){
        
        if (libro1.devolucion()) {
            JOptionPane.showMessageDialog(null,"Se ha devuelto el libro " + libro1.getTitulo());
            
        } else {
            JOptionPane.showMessageDialog(null,"No hay ejemplares del libro " + libro1.getTitulo() + " prestados");
           
        }
    }

        public void prestamo2(){
        if (libro2.prestamo()) {
            JOptionPane.showMessageDialog(null,"Se ha prestado el libro " + libro2.getTitulo());
            
        } else {
            JOptionPane.showMessageDialog(null,"No quedan ejemplares del libro " + libro2.getTitulo()+" para prestar");
                     
        }
    }
    public void devolucion2(){
        
        if (libro2.devolucion()) {
            JOptionPane.showMessageDialog(null,"Se ha devuelto el libro " + libro2.getTitulo());
            
        } else {
            JOptionPane.showMessageDialog(null,"No hay ejemplares del libro " + libro2.getTitulo() + " prestados");
           
        }
    }



       
        
    }
    

    

