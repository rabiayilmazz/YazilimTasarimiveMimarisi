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
public class PremKullanici implements IMesajIslemleri{
     @Override
    public void kisiBul(String kisi) {
        System.out.println("prem kullanıcı için" + kisi + "bulundu.");
    }

    @Override
    public void mesajAl() {
       System.out.println("prem kullanıcı için " + "mesaj alındi.");
    }

    @Override
    public void mesajGonder(String mesaj) {
        System.out.println( "prem kullanıcı için " +mesaj + "mesajı gönderiliyor");
    }

    @Override
    public void accept(Visitorr v) {
        v.visit(this);
    }
    
}
