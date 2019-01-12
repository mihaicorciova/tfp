/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Date;

/**
 *
 * @author sips
 */
public class DateBuletin {
    
   String ser;
   String nr;
   String cnp;
   String pol;
   Date delib;

    public DateBuletin(String ser, String nr, String cnp, String pol, Date delib) {
        this.ser = ser;
        this.nr = nr;
        this.cnp = cnp;
        this.pol = pol;
        this.delib = delib;
    }

    @Override
    public String toString() {
        return "DateBuletin{" +
                "ser='" + ser + '\'' +
                ", nr='" + nr + '\'' +
                ", cnp='" + cnp + '\'' +
                ", pol='" + pol + '\'' +
                ", delib=" + delib +
                '}';
    }
}
