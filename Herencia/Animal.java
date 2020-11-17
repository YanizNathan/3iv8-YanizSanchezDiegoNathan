public class Animal {

    //vamos a utilizar el principio de encapsulamiento 
    //para poder proteger el acceso a las variables de la clase
    private String nombre, raza, tipo_alimento;
    private int edad;

    //Ahora vamos a crear el constructor
    public Animal(){ //este es el constructor, se llama igual que la clase y es bien chingon
        /* 
        y los constructores se crean automaticamente en java, si es que no son
        invocados y sirven oara la inicializacion de variables y poder crear objetos 
        de la clase

        */

    }

    public Animal(String nombre, String raza, String tipo_alimento){
        //este es el metodo y lo sabemos gracias a que tiene parametros
        /*
        para poder acceder a las variables porque son privadas es necesario
        utilizar la plabra reservada "this"
        
        */
        //esto es para poder llevar esto a otras clases
        this.nombre = nombre;
        this.raza = raza;
        this.tipo_alimento = tipo_alimento;
        this.edad = edad;



    }
    //para poder enviar y obtener las variables necesitamos los metodos get y set
    //recibe
    public String getNombre(){
        return nombre;
    }
    //envia u establece 
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getrRaza(){
        return raza;
    }
    //envia u establece 
    public void setRaza(String raza){
        this.nombre = raza;
    }
    public String getTipoAlimento(){
        return nombre;
    }
    //envia u establece 
    public void setTipoAlimento(String tipo_alimento){
        this.nombre = tipo_alimento;
    }
    public int getEdad(){
        return edad;

    }
    public void serEdad(int edad){
        this.edad = edad;
    }
    
}
