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
public class Dateins {
     Date dins;
     Date discre;
     Date sot;

    public Dateins(Date dins, Date discre, Date sot) {
        this.dins = dins;
        this.discre = discre;
        this.sot = sot;
    }

    @Override
    public String toString() {
        return "Dateins{" +
                "dins=" + dins +
                ", discre=" + discre +
                ", sot=" + sot +
                '}';
    }
}
