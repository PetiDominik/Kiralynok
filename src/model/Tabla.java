
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
}
