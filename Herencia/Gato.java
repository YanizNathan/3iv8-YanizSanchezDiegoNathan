public class Gato extends Animal {

    private int num_vidas;
    public Gato(){

    }
  
    public Gato(String nombre, String raza, String tipo_alimento, int edad, int num_vidas){
        super(nombre, raza, tipo_alimento, edad);
        this.num_vidas = num_vidas;
    }
    public int getNumvidas(){
        return num_vidas;
    }
    //envia u establece 
    public void setNumvidas(int num_vidas){

        this.num_vidas = num_vidas;

    }

    public void mostrarGato(){
        System.out.println("El nombre del perro es: "+getNombre()
                            + "su raza es: "+ getRaza()
                            + "come: "+ getTipoAlimento()
                            + "su edad es de: "+getEdad()
                            + "su ladrido es" + getNumvidas());

    }
}
