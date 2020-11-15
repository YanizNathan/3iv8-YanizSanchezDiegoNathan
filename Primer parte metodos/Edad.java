
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Edad{
		double ano=0;
		double edad=0;
		Scanner entrada = new Scanner(System.in);
		

	public void Edad(){
		
		ano = Double.parseDouble(JOptionPane.showInputDialog("En que anio naciste?"));
        

        if(ano > 2020 || ano <= 1930){
            
			ano = Double.parseDouble(JOptionPane.showInputDialog("Pls ponga un anio entre 2020 y 1930 Owo:"));
        }
        else{
		calcular();
		
		}
		
    }

    //Este método se encarga de imprimir la edad actual tomando el método anterior como base.
    public void calcular(){
		edad = 2020 - ano;
		JOptionPane.showMessageDialog(null, "Tienes"+edad+"anios");
		     
    }
    
}
