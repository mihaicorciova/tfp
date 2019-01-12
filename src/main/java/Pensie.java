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
public class Pensie {
    String decp;
    Double pen;

    public Pensie(String decp, Double pen) {
        this.decp = decp;
        this.pen = pen;
    }

    @Override
    public String toString() {
        return "Pensie{" +
                "decp='" + decp + '\'' +
                ", pen=" + pen +
                '}';
    }
}
