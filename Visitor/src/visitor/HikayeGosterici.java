/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author Rabia
 */
// concrete sınıfı
public class HikayeGosterici implements Visitorr{

    @Override
    public void visit(NormKullanici normal) {
        System.out.println( "NormKullanici icin hikaye gosteriliyor");
    }

    @Override
    public void visit(GoldKullanici gold) {
        System.out.println( "gold  icin hikaye gosterilmiyor. yetki yok");
    }

    @Override
    public void visit(PremKullanici prem) {
        System.out.println( "prem icin hikaye gosteriliyor");
    }
    
}
