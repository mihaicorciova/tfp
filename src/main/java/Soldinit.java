/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sips
 */
public class Soldinit {
   Double soldi;
   Double coti;
   Double depbi;

    public Soldinit(Double soldi, Double coti, Double depbi) {
        this.soldi = soldi;
        this.coti = coti;
        this.depbi = depbi;
    }


    @Override
    public String toString() {
        return "Soldinit{" +
                "soldi=" + soldi +
                ", coti=" + coti +
                ", depbi=" + depbi +
                '}';
    }
}
