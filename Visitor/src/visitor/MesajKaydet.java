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
public class MesajKaydet implements Visitorr{
    @Override
    public void visit(NormKullanici normal) {
        System.out.println( "NormKullanici icin mesaj kaydedilemiyor. yetki yok");
    }

    @Override
    public void visit(GoldKullanici gold) {
        System.out.println( "gold  icin mesaj kaydediliyor");
    }

    @Override
    public void visit(PremKullanici prem) {
        System.out.println( "prem icin mesaj kaydediliyor");
    }
    
}
