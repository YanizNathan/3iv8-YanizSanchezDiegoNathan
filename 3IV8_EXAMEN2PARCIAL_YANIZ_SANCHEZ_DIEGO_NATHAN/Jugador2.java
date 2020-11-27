import javax.swing.JOptionPane;
public class Jugador2 extends Juego{
    
    private String nombrej2;
    private char fichaj2;
    char fichaj22;
    String nombrej22;


    public Jugador2(String nombrej2, char fichaj2){
        
        this.nombrej2 = nombrej2;
        this.fichaj2 = fichaj2;
        

    }

  

    public String getNombrej2(){
        nombrej2 = JOptionPane.showInputDialog("ingrese Su nombre: ");
        
        return nombrej2;
    }
    //envia u establece 
    public void setNombrej2(String nombrej2){
        this.nombrej2 = nombrej2;
    }
    public char getFichaj2() {
        fichaj2= JOptionPane.showInputDialog(null,"Ingrese la letra la cual sera tu ficha").charAt(0);
        
        return fichaj2;
    }
    public String getNombrej22(){
        nombrej22 = nombrej2;
        return nombrej22;

    }
    public char getFichaj22() {
        fichaj22 = fichaj2;
        
        return fichaj22;
    }
    //envia u establece 
    public void setfichaj2(char fichaj2){
        this.fichaj2 = fichaj2;
    }
    public void mostrarJ2(){
        JOptionPane.showMessageDialog(null, "Tu nombre J1: "+getNombrej2()+
                                            "\nTu ficha es: "+getFichaj2());



    }
}