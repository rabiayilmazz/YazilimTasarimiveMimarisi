/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BridgeIlk;

/**
 *
 * @author Rabia
 */
public class Bridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Muzik muzik = new Muzik("Sezen aksu hadi gülümse", "gülümse hadi gülümse");
        Hoparlor hoparlor = new Hoparlor();
        Bilgisayar bilgisayar = new Bilgisayar();
        bilgisayar.muzikCal(muzik);
    }
    
}
