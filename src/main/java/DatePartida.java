/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sips
 */
public class DatePartida {
   String par;
   String nume;
    Adresa adr;
    DateBuletin dateb;
    Pensie pen; 
    Dateins dins;
   Soldinit soldi;
   List<String> list = new ArrayList<>();

    public DatePartida(String par, String nume, Adresa adr, DateBuletin dateb, Pensie pen, Dateins dins, Soldinit soldi) {
        this.par = par;
        this.nume = nume;
        this.adr = adr;
        this.dateb = dateb;
        this.pen = pen;
        this.dins = dins;
        this.soldi = soldi;
    }

    public List<String> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "DatePartida{" +
                "par='" + par + '\'' +
                ", nume='" + nume + '\'' +
                ", adr=" + adr.toString() +
                ", dateb=" + dateb.toString() +
                ", pen=" + pen.toString() +
                ", dins=" + dins.toString() +
                ", soldi=" + soldi.toString() +
                '}';
    }
}
