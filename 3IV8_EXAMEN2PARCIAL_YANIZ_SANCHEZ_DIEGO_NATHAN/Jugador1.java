import javax.swing.JOptionPane;
public class Jugador1 extends Juego{
    
    private String nombrej1;
    private char fichaj1;
    char fichaj11;
    String nombrej11;


    public Jugador1(String nombrej1, char fichaj1){
        
        this.nombrej1 = nombrej1;
        this.fichaj1 = fichaj1;
        

    }

  

    public String getNombrej1(){
        nombrej1 = JOptionPane.showInputDialog("ingrese Su nombre: ");
        
        return nombrej1;
    }
    //envia u establece 
    public void setNombrej1(String nombrej1){
        this.nombrej1 = nombrej1;
    }
    public char getFichaj1() {
    fichaj1= JOptionPane.showInputDialog(null,"Ingrese la letra la cual sera su ficha").charAt(0);
        
        return fichaj1;
    }
    public char getFichaj11() {
    fichaj11 = fichaj1;
            
            return fichaj1;
        }
    public String getNombrej11(){
        nombrej11 = nombrej1;
        return nombrej11;
    }
    //envia u establece 
    public void setfichaj1(char fichaj1){
        this.fichaj1 = fichaj1;
    }
    public void mostrarJ1(){
        JOptionPane.showMessageDialog(null, "Tu nombre J1: "+getNombrej1()+
                                            "\nTu ficha es: "+getFichaj1());



    }
}