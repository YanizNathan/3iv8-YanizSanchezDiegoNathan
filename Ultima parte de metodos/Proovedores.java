import javax.swing.JOptionPane;
public class Proovedores {
      
      
    String nombre_cliente;
   
    int[] costo = new int[10];
    int[] proex = new int[10];
    String[] producto = new String[10];
    double suma_costo, max, min, pro;
    int i, j;
    public void Proovedores(){
        nombre_cliente = JOptionPane.showInputDialog("Quin es su cliente?:");

        JOptionPane.showMessageDialog(null, "Escriba el costo y el nombre del porducto respectivamente");
        for(i = 0; i < costo.length; i++){
            costo[i] = Integer.parseInt(JOptionPane.showInputDialog("Costo " + (i + 1) + ":"));
            suma_costo += costo[i];
            producto[i] = JOptionPane.showInputDialog("Nombre del producto Producto " + (i + 1) + ":");
        }
        Operaciones();
        

        JOptionPane.showMessageDialog(null, "Digite las existencias de sus productos uno a uno."); 
        for(j = 0; j < proex.length; j++){
            proex[j] = Integer.parseInt(JOptionPane.showInputDialog("Existencia " + (j + 1) + ":"));
        }
        Mostrar();
    }

    public void Mostrar(){
        pro = suma_costo/costo.length;
        JOptionPane.showMessageDialog(null, "El total de costos es de: " + suma_costo+"\nCosto mayor: " + max +"\nCosto menor: " + min + "\nEl promedio de los costos es de: " + pro);
       
       
        
       
        JOptionPane.showMessageDialog(null, "El cliente es: "+nombre_cliente+"\nDe " + proex[0] + " existencias del producto " + producto[0] + " su costo es" + (costo[0] * proex[0]) +"\nDe " + proex[1] + " existencias del producto " + producto[1] + " su costo es" + (costo[1] * proex[1]) +"\nDe " + proex[2] + " existencias del producto " + producto[2] + " su costo es " + (costo[2] * proex[2]) +"\nDe " + proex[3] + " existencias del producto " + producto[3] + " su costo es " + (costo[3] * proex[3]) +"\nDe " + proex[4] + " existencias del producto " + producto[4] + " su costo es " + (costo[4] * proex[4]) +"\nDe " + proex[5] + " existencias del producto " + producto[5] + " su costo es " + (costo[5] * proex[5]) +"\nDe " + proex[6] + " existencias del producto " + producto[6] + " su costo es " + (costo[6] * proex[6]) +"\nDe " + proex[7] + " existencias del producto " + producto[7] + " su costo es " + (costo[7] * proex[7]) +"\nDe " + proex[8] + " existencias del producto " + producto[8] + " su costo es " + (costo[8] * proex[8]) +"\nDe" + proex[9] + " existencias del producto " + producto[9] + " su costo es  " + (costo[9] * proex[9]) +"\n");
        
    }
    public void Operaciones(){
        min = max = costo[0];
        for (i = 0; i < costo.length; i++){
            if(costo[i] > max){
                max = costo[i];
            }
            else if(costo [i] < min){
                min = costo[i];
            }
        }



    }
}