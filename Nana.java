/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nana;

/**
 *
 * @author Víctor
 */
public class Nana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String[][] tabla = new String[10][10];
     int conta =0;
     
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) { 
                if(conta<10){
                    tabla[i][j] = "0" + conta++;
                }else{
                    tabla[i][j] = "" + conta++;
                }
                
            }
            
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {                
                System.out.print(tabla[i][j] + "  | ");
            }
            System.out.println("");
        }
    }
    
}
