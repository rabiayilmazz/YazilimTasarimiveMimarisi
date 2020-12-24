/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru2;

import java.util.ArrayList;

/**
 *
 * @author Rabia
 */
public abstract class Database {
    private ArrayList<Materyal> materyaller;  
    private ArrayList<Kullanici> kullaniciler;
    
    public Database(){
        materyaller = new ArrayList<Materyal>();
        kullaniciler = new ArrayList<Kullanici>();
    }
    public void materyalEkle(Materyal materyal){
        materyaller.add(materyal);
        System.out.println(materyal.getTip() + " tipindeki " + materyal.getAd() + " veritabanına eklendi");
    }
    public void materyalSil(Materyal materyal){
        materyaller.remove(materyal);
        System.out.println(materyal.getTip() + " tipindeki " + materyal.getAd() + " veritabanından silindi");
    }
    public void materyalAra(Materyal materyal){
        System.out.println(materyal.getTip() + " tipindeki " + materyal.getAd() + " veritabanında aranıyor...");
    }
    
    public void kullaniciEkle(Kullanici kullanici){
        kullaniciler.add(kullanici);
        System.out.println(kullanici.getAd() + " isimli kullanıcı veritabanına eklendi");
    }
    public void kullaniciSil(Kullanici kullanici){
        System.out.println(kullanici.getTur() + " tipindeki " + kullanici.getAd() + " isimli kullanıcı veritabanından silindi");
        materyaller.remove(kullanici);
    }
    public void kullaniciAra(Kullanici kullanici){
        System.out.println(kullanici.getAd() + " isimli kullanıcı veritabanında aranıyor...");
    }
}
