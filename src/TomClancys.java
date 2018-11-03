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
    
    private String tipe ;
    private int harga ;
    private int pegiAge ;

    public TomClancys() {
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
        setHarga() ;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga() {
        if(this.tipe.equalsIgnoreCase("Tom Clancy's The Division")){
            this.harga = 600000;
        } else if(this.tipe.equalsIgnoreCase("Tom Clancy's Rainbow Six Siege")){
            this.harga = 595000;
        } else if(this.tipe.equalsIgnoreCase("Tom Clancy's Splinter Cell")){
            this.harga = 120000;
        } else {
            this.harga = 0;
        }
    }

    public int getPegiAge() {
        return pegiAge;
    }

    public void setPegiAge(int pegiAge) {
        this.pegiAge = pegiAge;
    }
    
    
}
