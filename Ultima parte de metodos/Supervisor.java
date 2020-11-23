import javax.swing.JOptionPane;
public class Supervisor extends Empleados{
    private double infonavit = 0;
    private double gastosm = 0;
    private double isr = 0;
    private double id = 0;
    private double sueldo = 0;


    public Supervisor(String nombre, String puesto, double quin, long id, double infonavit, double gastosm, double isr,double sueldo){
        super(nombre, puesto, quin);
        this.infonavit = infonavit;
        this.gastosm= gastosm;
        this.isr = isr;
        this.sueldo = sueldo;
        this.id = id;
        

    }

  

    //recibe obtiene
    public double getInfonavit(){
        infonavit = 8000*0.002;
        return infonavit;
    }
    //envia u establecer
    public void setInfonavit(double infonavit){
        this.infonavit = infonavit;
    }
    public double getGastosm(){
        gastosm = 8000 * 0.001;
        return gastosm;
    }
    //envia u establecer
    public void setGastosm(double gastosm){
       
        this.gastosm = gastosm;
    }
    public double getIsr(){
        isr = 8000 * 0.0016;
        return isr;
    }
    //envia u establecer
    public void setIsr(double isr){
       
        this.isr = isr;
    }
    public double getSueldo(){
        sueldo = 8000-isr-gastosm-infonavit;
        return sueldo;
    }
    //envia u establecer
    public void setSueldo(double sueldo){
       
        this.sueldo = sueldo;
    }
    public double getId(){
        
        return sueldo;
    }
    //envia u establecer
    public void setId(double id){
       
        this.id = id;
    }
    public void mostrarSu(){
        JOptionPane.showMessageDialog(null, "Su nombre es: "+getNombre()+"\nSu puesto es: "+ getPuesto()+"\nSu id es: "+getId()+"Su pago quincenal es de :"+getQuincena()+"\nlo que paga de infonavit es :"+getInfonavit()+"\nlo que paga de Seguro de gastos medicos es: "+getGastosm()+"\nLo que paga de Isr:"+getIsr()+"\nsu sueldo total es de: "+getSueldo());
        
    }
    
}