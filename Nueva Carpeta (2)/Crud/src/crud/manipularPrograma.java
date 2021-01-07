/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

/**
 *
 * @author die_w
 */
import java.util.*;
public class manipularPrograma {
    
    public void principal(){
        Scanner entrada = new Scanner(System.in);
        
        ControladorPersona crudos = new ControladorPersona();
        
        System.out.println("Elija la opcion que desee:"
                            +"\n1.- MostrarPersonas"
                            +"\n2.- Registrar una nueva persona"
                            +"\n3.- Editar registro de persona"
                + "\n4.- borrar el registro de persona"
                + "\n5.- Salir");
        
        int opcion = Integer.parseInt(entrada.nextLine());
        
        switch (opcion){
            case 1:
                ArrayList<Persona> listaPersona = crudos.mostrarPersonas();
                //me hace falta recorrer ese array
                for(Persona objeto : listaPersona){
                    //mando imprimir los resgistros
                    System.out.println("El id: "+objeto.getId()
                    + "\n El nombre : "+objeto.getNombre()
                    + "\n La edad:0000 "+objeto.getEdad());
                }
                break;
            case 2:
                System.out.println("Profavor ingrese el id de la persona");
                int idpersona = Integer.parseInt(entrada.nextLine());
                System.out.println("Profavor ingrese el nombre de la persona");
                String nompersona = entrada.nextLine();
                
                System.out.println("Profavor ingrese la edad de la persona");
                int edadpersona = Integer.parseInt(entrada.nextLine());
                
                Persona personaNueva = new Persona (idpersona, nompersona, edadpersona);
                
                crudos.agregarPersona(personaNueva);
                break;
            case 3:
                System.out.println("Digita el Id de la persona que vas a a actualizar sus datos");
                
                int id = Integer.parseInt(entrada.nextLine());
                
                Persona personaBuscar = crudos.buscarPersona(id);
                
                //visualizar la informacion de esa persona
                
                System.out.println("La informacion de la persona es:\n"
                        + "ID"+personaBuscar.getId()
                        + "\nNombre: "+personaBuscar.getNombre()
                        +"\n\n Edad:"+personaBuscar.getEdad());
                
                //ahora vamos a cambiar los datos
                System.out.println("Ingresa el nuevo nombre: ");
                String nuevonombre = entrada.nextLine();
                System.out.println("Ingresa la nueva edad: ");
                int nuevaedad = Integer.parseInt(entrada.nextLine());
                
                //con set esos nuevos parametros
                personaBuscar.setNombre(nuevonombre);
                personaBuscar.setEdad(nuevaedad);
                
                //actualizo mi lista
                crudos.actualizarPersona(personaBuscar);
                
                break;
                
            case 4:
                System.out.println("Digite el ID de la persona que desea eliminar");
                int ideliminar = Integer.parseInt(entrada.nextLine());
                
                Persona personaeliminar = crudos.buscarPersona(ideliminar);
                
                crudos.eliminarPersona(personaeliminar);
                
                System.out.println("El registro se borro correctamente");
                break;
            
            case 5:
                System.out.println("Uwu");
                System.exit(0);
            
            default:
                System.out.println("Porfa digite un numero cool");
        }
                
        
    }
    
}
