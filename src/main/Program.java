
package main;

import model.Tabla;
import view.GUIView;


public class Program {


    public static void main(String[] args) {
        
        new Program().program();
        
    }
    
    public void program() {
        Tabla tabla = new Tabla('*');
        
        GUIView view = new GUIView();
        view.setVisible(true);
        
        view.megjelenit(tabla.megjelenit());
    }
    
}
