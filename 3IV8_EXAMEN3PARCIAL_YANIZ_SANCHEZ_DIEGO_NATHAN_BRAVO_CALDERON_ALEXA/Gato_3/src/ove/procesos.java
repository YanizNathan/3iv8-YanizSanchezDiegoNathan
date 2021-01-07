package ove;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class procesos implements Serializable{
    
    private ArrayList<ingresar> listalibros;
    
    private leer objarchivo = new leer();
    
    
    public procesos(){
        listalibros = new ArrayList<ingresar>();
        listalibros = objarchivo.leer();
    }
    
    public void agregarLibro(){
        String resp = "s";
        
        while(resp == "s"){
            ingresar objlibro = new ingresar();
            objlibro.aceptaDatos();
            listalibros.add(objlibro);
            resp = JOptionPane.showInputDialog("Se ha agregado el jugador.\n"
                    + "¿Desea agregar otro jugador?si es asi dale a la s, si no a la n.");
        }
    }
    
    public void consultaGral(){
        if(listalibros.isEmpty()){
            JOptionPane.showMessageDialog(null,"No hay nadie aquí :/.");
        }else{
            JOptionPane.showMessageDialog(null,"Aqui estan los jugadores:\n");
            for(int i = 0; i<listalibros.size(); i++){
                JOptionPane.showMessageDialog(null,"Nombre: " + listalibros.get(i).getNombre()+ ".\n"
                                 + "Edad: " + listalibros.get(i).getEdad()+ ".\n"
                                 + "Puntaje: " + listalibros.get(i).getPrecio()+ ".\n");
            }
            
        }
    }
    
    private int traePosicion(String nombreBuscar){
        int pos = 0;
        boolean existe = false;
        
        for(int i = 0; i < listalibros.size(); i++){
            if(nombreBuscar.equals(listalibros.get(i).getNombre())){
                pos = i;
                existe = true;
            }else{
            }
        }
        if(!existe){
            JOptionPane.showMessageDialog(null,"No encontramos a nadie llamado asi unu.");
            pos = -1;
        }
        return pos;
    }
    
    public int buscar(){
        int posBuscando = 0;
        String nombreBusca;
        
        if(listalibros.isEmpty()){
            JOptionPane.showMessageDialog(null,"Aqui no hay nadie que se llame asi.");
        }
        else{
        nombreBusca = JOptionPane.showInputDialog("Ingresa tu gamertag Owo:");
        
        posBuscando = traePosicion(nombreBusca);
        
        JOptionPane.showMessageDialog(null,"Nombre: " + listalibros.get(posBuscando).getNombre()
                + "Edad: " + listalibros.get(posBuscando).getEdad()
                + "Puntaje: " + listalibros.get(posBuscando).getPrecio()
                + "ID: " + listalibros.get(posBuscando));
        }
        return posBuscando;
    }
    
    public void borrar(){
        String libroBorrar;
        int posBorrar;
        
        if(listalibros.isEmpty()){
            JOptionPane.showMessageDialog(null,"Aqui no hay nadie que se llame asi.");
        }else{
            posBorrar = buscar();
            if(posBorrar < listalibros.size()){
                listalibros.remove(posBorrar);
                JOptionPane.showMessageDialog(null,"Hemos mandado a la basura a ese Jugador.");
            }
        }
    }
    
    public void modificar(){
        int posModificar = 0;
        int resMods = 0;
        String nombreModificar;
        String opcion = "s";
        
        if(listalibros.isEmpty()){
            JOptionPane.showMessageDialog(null,"Aqui no hay nadie que se llame asi.");
        }
        else{
            nombreModificar = JOptionPane.showInputDialog("A quien quieres modificar?:");
        
        while("s".equals(opcion)){
            posModificar = traePosicion(nombreModificar);
            if(posModificar <= 0);
            resMods = Integer.parseInt(JOptionPane.showInputDialog("\nQue es lo que quieres cambiar?:"
                        + "\n— 1.- Nombre "
                        + "\n— 2.- Edad ."));
                
                switch (resMods) {
                    case 1:
                        JOptionPane.showMessageDialog(null,"Su nombre es: "
                                + listalibros.get(posModificar).getNombre());
                        listalibros.get(posModificar).setNombre(JOptionPane.showInputDialog("Como te quieres llamar?:"));
                        JOptionPane.showMessageDialog(null,"Tu nombre se ha cambiado."
                                + "\nGamertag: " + listalibros.get(posModificar).getNombre());
                    break;
                    
                    case 2:
                        JOptionPane.showMessageDialog(null,"Los años que tiene son: "
                                + listalibros.get(posModificar).getEdad());
                        listalibros.get(posModificar).setEdad(Integer.parseInt(JOptionPane.showInputDialog("Cual es tu edad?:")));
                        JOptionPane.showMessageDialog(null,"Hemos cambiado tu edad."
                                + "\nEdad: " + listalibros.get(posModificar).getEdad());
                    break;                
                }
            opcion = JOptionPane.showInputDialog("¿Desea cambiar otro usuario?dale a la s si es asi, si no a la n.");        
        }
        }
    }

    public ArrayList<ingresar> getListalibros() {
        return listalibros;
    }

    public void setListalibros(ArrayList<ingresar> listalibros) {
        this.listalibros = listalibros;
    }

    public leer getObjarchivo() {
        return objarchivo;
    }

    public void setObjarchivo(leer objarchivo) {
        this.objarchivo = objarchivo;
    }
    
    public void grabar(){
        getObjarchivo().serializar(listalibros);
    }
}