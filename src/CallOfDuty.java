/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI Notebook
 */
public class CallOfDuty {
    
    private String judul ;
    private int harga ;
    private int pegiAge ;

    public CallOfDuty() {
    }

    public String getJudul() {
        return judul ;
    }

    public void setJudul(String judul) {
        this.judul = judul ;
        setHarga () ;
    }

    public int getHarga() {
        return harga ;
    }

    public void setHarga() {
        if(this.judul.equalsIgnoreCase("Call Of Duty Black Ops 4")){
            this.harga = 680000 ;
        } else if(this.judul.equalsIgnoreCase("Call Of Duty Advanced Warfare")){
            this.harga = 455000 ;
        } else if(this.judul.equalsIgnoreCase("Call Of Duty Ghost")){
            this.harga = 180000 ;
        } else {
            this.harga = 0 ;
        }
    }

    public int getPegiAge() {
        return pegiAge;
    }

    public void setPegiAge(int pegiAge) {
        this.pegiAge = pegiAge;
    }
    
    public String info () {
        String info = "" ;
        
    }
}
