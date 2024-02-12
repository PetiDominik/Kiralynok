
package model;

import java.util.Random;


public class Tabla {
    private static final Random RND = new Random();
    
    private char[][] T;
    private char uresCella;
    
    
    public Tabla(char uresCella) {
        this.uresCella = uresCella;
        this.T = new char[8][8];
        
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                this.T[i][j] = this.uresCella;
            }
        }
       
    }
}
