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
public class Bilgisayar {
    private MuzikCalar muzikCalar;
    private Hoparlor hoparlor;

    public Bilgisayar() {
        muzikCalar = new MuzikCalar();
        hoparlor = new Hoparlor();
    }
    
    public void muzikCal(Muzik muzik){
        String ses = muzikCalar.muzikCal(muzik);
        hoparlor.sesCal(ses);
    }

    public MuzikCalar getMuzikCalar() {
        return muzikCalar;
    }

    public void setMuzikCalar(MuzikCalar muzikCalar) {
        this.muzikCalar = muzikCalar;
    }

    public Hoparlor getHoparlor() {
        return hoparlor;
    }

    public void setHoparlor(Hoparlor hoparlor) {
        this.hoparlor = hoparlor;
    }
    
    
}
