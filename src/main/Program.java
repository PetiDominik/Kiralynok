
package main;

import javax.swing.JButton;
import model.Tabla;
import view.GUIView;


public class Program {


    public static void main(String[] args) {
        
        new Program().program();
        
    }
    
    public void program() {
        Tabla tabla = new Tabla('#');
        
        GUIView view = new GUIView();
        view.setVisible(true);
        
        view.megjelenit(tabla.megjelenit());
        
        JButton btnElhelyez = view.getBtnElhelyez();
        
        btnElhelyez.addActionListener((e) -> {
            tabla.elhelyez(view.getKiralynoCount());
            view.megjelenit(tabla.megjelenit());
        });
        
        JButton btnSorOszlop = view.getBtnSorOszlop();
        
        btnSorOszlop.addActionListener((e) -> {
            String vanTxt = "Van királynő";
            String nincsTxt = "Nincs királynő";
            
            int sorVizsgal = view.getVizsgalSor();
            int oszlopVizsgal = view.getVizsgalOszlop();

            view.setVizslagSorEredmeny(tabla.uresSor(sorVizsgal) ? nincsTxt : vanTxt);
            view.setVizslagOszlopEredmeny(tabla.uresOszlop(oszlopVizsgal) ? nincsTxt : vanTxt);
        });
    }
    
}
