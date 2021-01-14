package visitor;

import com.sun.corba.se.impl.orb.NormalDataCollector;

/**
 *
 * @author Rabia YILMAZ
 */
public class Visitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Visitorr hikaye = new HikayeGosterici();
        NormKullanici nk = new NormKullanici();
        nk.accept(hikaye);
        
        hikaye = new MesajKaydet();
        nk.accept(hikaye);
            
    }
    
}
