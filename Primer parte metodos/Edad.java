
import java.util.Scanner;
public class Edad{
		double ano=0;
		double edad=0;
		Scanner entrada = new Scanner(System.in);

	public void Edad(){
		
        System.out.println("En que anio naciste?.");
        ano = entrada.nextDouble();

        if(ano > 2020 || ano <= 1930){
            System.out.println("Pls ponga un anio entre 2020 y 1930 Owo:");
            ano = entrada.nextDouble();   
        }
        else{
		calcular();
		
        }
    }

    //Este método se encarga de imprimir la edad actual tomando el método anterior como base.
    public void calcular(){
		edad = 2020 - ano;
		        System.out.println("Tienes "+edad+"anios");
    }
    
}
