public class Perro extends Animal {
    //para caracterizar a un perro es su ladrido
   
   
    /*
    para poder heredar de la clase animal,
    es necesario utilizar la palabra reservada
    "extends"
    que significa que se extiende de una clase 
    padre o una superclase
     */

     private String ladrido;

     public Perro(){
         //constructor
     }
     
     
     //metodo para acceder a la clase principal y al ladrido
     public Perro(String nombre, String raza, String tipo_alimento, int edad, String ladrido){
     
          // tenemos que utilizar la palabra reservada 
          //"super", para poder acceder a 
          //los atributos de la clase padre

          super(nombre, raza, tipo_alimento, edad);
          //acceso a la variable porpia de la clase
          this.ladrido=ladrido;
     }
          public String getLadrido(){
            return ladrido;
        }
        //envia u establece 
        public void setLadrido(String ladrido){

            this.ladrido = ladrido;

        }

        public void mostrarPerro(){
            System.out.println("El nombre del perro es: "+getNombre()
                                + "su raza es: "+ getRaza()
                                + "come: "+ getTipoAlimento()
                                + "su edad es de: "+getEdad()
                                + "su ladrido es" + getLadrido());
        }


     }

    

