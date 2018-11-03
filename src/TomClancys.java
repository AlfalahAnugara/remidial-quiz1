/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI Notebook
 */
public class TomClancys {
    
    private String judul ;
    private int harga ;
    private int pegiAge ;

    public TomClancys() {
        
    }

    public String getJudul() {
        return judul ;
    }

    public void setJudul(String judul) {
        this.judul= judul ;
        setHarga() ;
    }

    public int getHarga() {
        return harga ;
    }

    public void setHarga() {
        if(this.judul.equalsIgnoreCase("Tom Clancy's The Division")){
            this.harga = 600000 ;
        } else if(this.judul.equalsIgnoreCase("Tom Clancy's Rainbow Six Siege")){
            this.harga = 595000 ;
        } else if(this.judul.equalsIgnoreCase("Tom Clancy's Splinter Cell")){
            this.harga = 120000 ;
        } else {
            this.harga = 0 ;
        }
    }

    public int getPegiAge() {
        return pegiAge ;
    }

    public void setPegiAge(int pegiAge) {
        this.pegiAge = pegiAge ;
    }
    
    public String info () {
        String info = "" ;
        info += "Judul Tom Clancy's = "  + getJudul() +"\n" ;
        info += "PG Age pada game = "  + getPegiAge() +"\n" ;
        info += "Harganya = "  + getHarga() +"\n" ;
        
        return info ;
    }
    
}
