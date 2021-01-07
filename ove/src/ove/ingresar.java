package ove;

import java.io.Serializable;
import java.util.Scanner;

public class ingresar implements Serializable {
    
    private String nombre;
    private String tipo;
    private int cantidad;
    private float precio;
    
    public ingresar(){
    }

    public ingresar(String nombre, String tipo, int cantidad, float precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public void aceptaDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nIngrese el nombre del producto.");
        nombre = entrada.nextLine();
        
        System.out.println("\nIngrese el tipo de producto.");
        tipo = entrada.nextLine();
        
        System.out.println("\nIngrese las existencias del producto.");
        cantidad = entrada.nextInt();
        
        System.out.println("\nIngrese el precio del producto.");
        precio = entrada.nextFloat();
    }   
}