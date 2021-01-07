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
import java.util.ArrayList;
public class ControladorPersona {
    /* 
    un controlador es una clase que nos va ayudar a
    direccionar metodos que serviran para un proposito
    
    ejemplo
    
    Listar todas las personas regustradas el el proyecto
    Agregar una nueva persona
    Buscar una persona por id
    Actualizar los datos de una persona
    Eliminar el registro de una persona
    
    CRUD Consult Register Update Delete
    */
    
    public ArrayList<Persona> listaPersona = new ArrayList<Persona>();
    //estoy creando un objeto que va a tomar las propiedades de persona
    //transformandolo en un arraylist, para agregar a ese arreglo 
    //n cantidad de personas y con ello puede aumentar o disminuir su tamaño
    //y realizar diferentes operaciones
    
    //metodo agregarpersona           clase   objeto
    public void agregarPersona(Persona p){
        //mando a llamar a mi objeto de la lista de personas
        // y lo agrego 
        listaPersona.add(p);
              
        
    }
    //buscar una persona por id
    public Persona buscarPersona(int id){
        //necesito un objeto de persona
        Persona encontrada = new Persona();
        //recorrer todos los registros hasta que el id = al que buscando
        for(Persona p: listaPersona){
            if(id == p.getId()){
                encontrada = p;
            }else{
                System.out.println("No existe el reguistro");
                
            }
            
        }
        return encontrada;
    }
    //actualizar los daatos de la persona
    public void actualizarPersona(Persona actualizada){
        Persona actulizar = buscarPersona(actualizada.getId());
        //ya lo busco y lo encontro
        
        //primero debo de removerlo
        listaPersona.remove(actulizar);
        //lo volvemos a meter
        listaPersona.add(actualizada);
        
        
    }
    //eliminar una persona
    public void eliminarPersona(Persona eliminar){
        listaPersona.remove(eliminar);
        
    }
    
    public ArrayList<Persona> mostrarPersonas(){
        return listaPersona;
    }    
    
    
    
}
