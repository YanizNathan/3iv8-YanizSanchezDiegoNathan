/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author die_w
 */
public class Pizza {
    private String masa;
    private String salsa;
    protected String[] ingredientes;

    public Pizza(String masa, String salsa, String[] ingrdientes) {
        this.masa = masa;
        this.salsa = salsa;
        this.ingredientes = ingrdientes;
    }

    public String getMasa() {
        return masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public String[] getIngrdientes() {
        return ingredientes;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public void setIngrdientes(String[] ingrdientes) {
        this.ingredientes = ingrdientes;
    }
    
    public void hornear(){
        
    }
    public void preparar(){
        
    }
    public void cortar(){
        
    }
    
}
