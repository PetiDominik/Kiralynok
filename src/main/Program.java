
package main;

import java.awt.Desktop;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import model.Tabla;
import view.GUIView;


public class Program {


    public static void main(String[] args) {
        
        new Program().program();
        
    }
    
    public void program() {
        if (Files.exists(Path.of("tablak64.txt"))) {
            try {
                Files.delete(Path.of("tablak64.txt"));
            } catch (IOException ex) {
                Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
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
        
        JButton btnUresDb = view.getBtnUresDb();
        
        btnUresDb.addActionListener((e) -> {
            view.setSorDbEredmeny(Integer.toString(tabla.uresSorokSzama()));
            view.setOszlopDbEredmeny(Integer.toString(tabla.uresOszlopokSzama()));
        });
        
        
        JMenuItem mentMenu = view.getmenuItemFileMentes();
        
        mentMenu.addActionListener((e) -> {
            
            try {
                Files.createFile(Path.of("tablak64.txt"));
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(view, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            for (int i = 1; i <= 64; i++) {
                Tabla t = new Tabla('*');
                t.elhelyez(i);
                try {
                    t.fajlbaIr();
                } catch (IOException ex) {
                    Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            JOptionPane.showMessageDialog(view, "File írása sikeresen megtörtént!", "Kész", JOptionPane.INFORMATION_MESSAGE);
            
        });
    }
    
}
