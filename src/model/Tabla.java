
package model;

import java.util.Random;


public class Tabla {
    private static final Random RND = new Random();
    
    private char[][] T;
    private char uresCella;
    
    
    public Tabla(char uresCella) {
        this.uresCella = uresCella;
        this.T = new char[8][8];
        
        this.mezokInit();
    }
    
    public char[][] megjelenit() {
        return this.T.clone();
    }
    
    public void elhelyez(int N) {
        this.mezokInit();
        for (int i = 0; i < N; i++) {
            int x, y;
            
            do {
                x = RND.nextInt(0, this.T.length);
                y = RND.nextInt(0, this.T[x].length);
            } while(this.T[x][y] != this.uresCella);
            
            this.T[x][y] = 'K';
        }
    }
    
    private void mezokInit() {
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                this.T[i][j] = this.uresCella;
            }
        }
    }
    
    public boolean uresOszlop(int oszlop) {
       int i = 0;
       int hossz = this.T[0].length;
       
       while (i < hossz && this.T[i][oszlop] == this.uresCella) {
           i++;
       }
       
       return i == hossz;
    }
    
    public boolean uresSor(int sor) {
       int i = 0;
       int hossz = this.T.length;
       
       while (i < hossz && this.T[sor][i] == this.uresCella) {
           i++;
       }
       
       return i == hossz;
    }
}
