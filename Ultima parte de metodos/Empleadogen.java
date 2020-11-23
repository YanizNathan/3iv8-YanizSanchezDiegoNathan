import javax.swing.JOptionPane;
public class Empleadogen extends Empleados{
    
    private double sueldo, horasn, horasd;


    public Empleadogen(String nombre, String puesto, double quin, double horasn, double horasd,double sueldo){
        super(nombre, puesto, quin);
        this.horasd = horasd;
        this.horasn = horasn;
        this.sueldo = sueldo;

    }

  

    //recibe obtiene
    public double gethorasn(){
        horasn = Double.parseDouble(JOptionPane.showInputDialog("ingrese las horas nocturnas trabajadas"));
        return horasn;
    }
    //envia u establecer
    public void sethorasn(double horasn){
        this.horasn = horasn;
    }
    public double gethorasd(){
        horasd = Double.parseDouble(JOptionPane.showInputDialog("ingrese las horas diurnas trabajadas"));
        return horasd;
    }
    //envia u establecer
    public void sethorasd(double horasd){
       
        this.horasd = horasd;
    }
    public double getSueldo(){
        sueldo += horasd*50;
        sueldo += horasn*60+5000;
        return sueldo;
    }
    //envia u establecer
    public void setSueldo(double sueldo){

        this.horasn = sueldo;
    }

    public void mostrarEg(){
        JOptionPane.showMessageDialog(null, "Su nombre es: "+getNombre()+"\nSu puesto es: "+ getPuesto()+"\nSu pago quincenal es de :"+getQuincena()+"\nLas horas extras diurnas trabajadas son: "+gethorasd()+"\nLas horas extras Nocturnas trabajadas son: "+gethorasn()+"\nSu sueldo es de: "+getSueldo());
        
    }
    
    
}
