/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sips
 */
public class Adresa {
    
    String loca;
    String adr;

    public Adresa(String loca, String adr) {
        this.loca = loca;
        this.adr = adr;
    }

    @Override
    public String toString() {
        return "Adresa{" +
                "loca='" + loca + '\'' +
                ", adr='" + adr + '\'' +
                '}';
    }
}
