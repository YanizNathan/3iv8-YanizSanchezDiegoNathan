package ove;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class procesos implements Serializable{
    
    private ArrayList<ingresar> listalibros;
    
    private leer objarchivo = new leer();
    
    
    public procesos(){
        listalibros = new ArrayList<ingresar>();
        listalibros = objarchivo.leer();
    }
    
    public void agregarLibro(){
        Scanner entrada = new Scanner(System.in);
        char resp = 's';
        
        while(resp == 's'){
            ingresar objlibro = new ingresar();
            objlibro.aceptaDatos();
            listalibros.add(objlibro);
            System.out.println("\nSe ha agregado el producto.");
            System.out.println("¿Desea agregar otro producto? («s»/«n»).");
            resp = entrada.next().charAt(0);
        }
    }
    
    public void consultaGral(){
        if(listalibros.isEmpty()){
            System.out.println("\nNo hay productos registrados.");
        }else{
            System.out.println("Los productos son:\n");
            for(int i = 0; i<listalibros.size(); i++){
                System.out.println("Producto: " + listalibros.get(i).getNombre()+ ".\n"
                                 + "Tipo: " + listalibros.get(i).getTipo()+ ".\n"
                                 + "Cantidad: " + listalibros.get(i).getCantidad()+ ".\n"
                                 + "Precio: " + listalibros.get(i).getPrecio()+ ".\n");
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
                System.out.println("\nEl producto no se ha localizado.");
            }
        }
        if(!existe){
            System.out.println("No hay registros del producto introducido.");
            pos = -1;
        }
        return pos;
    }
    
    public int buscar(){
        int posBuscando = 0;
        String nombreBusca;
        Scanner entrada = new Scanner(System.in);
        
        if(listalibros.isEmpty()){
            System.out.println("\nNo hay productos registrados.");
        }
        else{
        System.out.println("\nIngrese el nombre del producto:");
        nombreBusca = entrada.nextLine();
        
        posBuscando = traePosicion(nombreBusca);
        
        System.out.println("\nProducto: " + listalibros.get(posBuscando).getNombre());
        System.out.println("Tipo: " + listalibros.get(posBuscando).getTipo());
        System.out.println("Cantidad: " + listalibros.get(posBuscando).getCantidad());
        System.out.println("Precio: " + listalibros.get(posBuscando).getPrecio());
        System.out.println("ID: " + listalibros.get(posBuscando));
        }
        return posBuscando;
    }
    
    public void borrar(){
        Scanner entrada = new Scanner(System.in);
        String libroBorrar;
        int posBorrar;
        
        if(listalibros.isEmpty()){
            System.out.println("\nNo hay productos registrados.");
        }else{
            posBorrar = buscar();
            if(posBorrar < listalibros.size()){
                listalibros.remove(posBorrar);
                System.out.println("Producto eliminado con éxito.");
            }
        }
    }
    
    public void modificar(){
        int posModificar = 0;
        int resMods = 0;
        String nombreModificar;
        String opcion = "s";
        Scanner entrada = new Scanner(System.in);
        
        if(listalibros.isEmpty()){
            System.out.println("\nNo hay productos registrados.");
        }
        else{
        System.out.println("\nDigite el nombre del producto que se modificará:");
            nombreModificar = entrada.nextLine();
        
        while("s".equals(opcion)){
            posModificar = traePosicion(nombreModificar);
            if(posModificar <= 0);
            
                System.out.println("\nSeleccione el dato que desea modificar:");
                System.out.println("— tipo de producto (1);");
                System.out.println("— cantidad (2);");
                System.out.println("— precio (3).");
                
                resMods = entrada.nextInt();
                
                switch (resMods) {
                    case 1:
                        System.out.println("\nEl tipo de producto es: ");
                        System.out.println(listalibros.get(posModificar).getTipo() + "\n");
                        System.out.println("Actualice el tipo de producto: ");
                        listalibros.get(posModificar).setTipo(entrada.next());
                        System.out.println("Modificación realizada con éxito");
                        System.out.println("Tipo de producto: " + listalibros.get(posModificar).getTipo());
                    break;
                        
                    case 2:
                        System.out.println("\nLas existencias son: ");
                        System.out.println(listalibros.get(posModificar).getCantidad()+ "\n");
                        System.out.println("Ingrese las nuevas existencias: ");
                        listalibros.get(posModificar).setCantidad(entrada.nextInt());
                        System.out.println("El dato a sido modificado");
                        System.out.println("Cantidad: " + listalibros.get(posModificar).getCantidad());
                    break;
                        
                    case 3:
                        System.out.println("\nEl precio es: ");
                        System.out.println(listalibros.get(posModificar).getPrecio()+ "\n");
                        System.out.println("Ingresa el nuevo precio: ");
                        listalibros.get(posModificar).setPrecio(entrada.nextFloat());
                        System.out.println("El dato a sido modificado");
                        System.out.println("Precio: " + listalibros.get(posModificar).getPrecio());
                    break;                
                }
            opcion = entrada.nextLine();        
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