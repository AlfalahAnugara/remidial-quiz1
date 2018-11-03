/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI Notebook
 */
public class Games {
    
    private TomClancys tomclancys ;
    private CallOfDuty callofduty ;

    public Games() {
    }

    public void setTomclancys(TomClancys tomclancys) {
        this.tomclancys = tomclancys;
    }

    public void setCallofduty(CallOfDuty callofduty) {
        this.callofduty = callofduty;
    }
    
    public int TotalHarga() {
        int total = this.tomclancys.getHarga() + this.callofduty.getHarga() ;
        
        return total ;
    }

}
