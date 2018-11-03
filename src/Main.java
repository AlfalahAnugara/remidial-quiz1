/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI Notebook
 */
import java.util.Scanner ;
public class Main {
    
    static Scanner gc = new Scanner (System.in) ;
    public static void main (String [] args) {
        
        TomClancys tc = new TomClancys() ;
        tc.setPegiAge(18) ;
            System.out.println("1.) Tom Clancy's The Division") ;
            System.out.println("2.) Tom Clancy's Rainbow Six Siege") ;
            System.out.println("3.) Tom Clancy's Splinter Cell") ;
            System.out.print("Pilihan") ;
            int aaa = gc.nextInt() ;
            if (aaa == 1) {
                tc.setJudul ("Tom Clancy's The Division") ;
            } else if (aaa == 2) {
                tc.setJudul ("Tom Clancy's Rainbow Six Siege") ;
            } else if (aaa == 3) {
                tc.setJudul ("Tom Clancy's Splinter Cell") ;
            } else {
                tc.setJudul (" ") ;  
            }
            
        CallOfDuty cod = new CallOfDuty() ;
        cod.setPegiAge(12) ;
            System.out.println("1.) Call Of Duty Black Ops 4") ;
            System.out.println("2.) Call Of Duty Advanced Warfare") ;
            System.out.println("3.) Call Of Duty Ghost") ;
            System.out.print("Pilihan : ") ;
            int bbb = gc.nextInt() ;
            if (bbb == 1) {
                cod.setJudul ("Call Of Duty Black Ops4") ;
            } else if (bbb == 2) {
                cod.setJudul ("Call Of Duty Advanced Warfare") ;
            } else if (bbb == 3) {
                cod.setJudul ("Call Of Duty Ghost") ;
            }else {
                cod.setJudul(" ") ;
            }
            
            Games G = new Games () ;
            G.setTomclancys(tc) ;
            G.setCallofduty(cod) ;
            
            G.info () ;
            
    }
    
}
