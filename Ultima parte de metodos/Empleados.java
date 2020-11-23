
 import javax.swing.JOptionPane;
public class Empleados {
    
    private String puesto;
    private String nombre;
    int id; 
    
    private double quin = 0;
    int opcion;
    char letra;





   
    public void Empleados(){
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Cual es tu puesto:\n1.-Empleado general\n2.-Supervisor"));
        switch(opcion){
            case 1:
                          
                Empleadogen Eg =new Empleadogen("", "Empleado", 5000, 0, 0,0); 
       
                Eg.mostrarEg();
          
           
               
            break;
            case 2:
             id = Integer.parseInt(JOptionPane.showInputDialog("Porfavor escriba su id"));
             if(id==484848){
                Supervisor su =new Supervisor("", "Supervisor", 8000,484848, 0.00, 0.00,0.00,0.00); 
       
                 su.mostrarSu();
             }
             else{
                 JOptionPane.showMessageDialog(null, "Esa Id no pertenece al Supervisor");

             }
            break;
        }

        
    
    
    
    
    }   
    public Empleados(String nombre, String puesto, double quin){
        this.nombre = nombre;
        this.puesto = puesto;
        this.quin = quin;


    }

    
	
	public Empleados() {
	}
    public String getNombre(){
        nombre = JOptionPane.showInputDialog("ingrese Su nombre: ");
        
        return nombre;
    }
    //envia u establece 
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getPuesto(){

        return puesto;
    }
    //envia u establece 
    public void setRaza(String raza){
        this.puesto = puesto;
    }
    public double getQuincena() {
       
        return quin;
    }
    //envia u establece 
    public void setQuincena(double quin){
        this.quin = quin;
    }
}
    

