/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru2;

/**
 *
 * @author Rabia
 */
public abstract class Kullanici implements Duzenle{
    private String ad;
    private String soyad;
    private String tur;
    private String numara;
    
    private MySQL veritabani = new MySQL();
    
    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getSoyad() {
        return soyad;
    }
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    public String getNumara() {
        return numara;
    }
    public void setNumara(String numara) {
        this.numara = numara;
    }
    public String getTur() {
        return tur;
    }
    public void setTur(String tur) {
        this.tur = tur;
    }
    @Override
    public void ekle() {
        veritabani.kullaniciEkle(this);
    }
    @Override
    public void sil() {
        veritabani.kullaniciSil(this);
    }

    @Override
    public void ara() {
        veritabani.kullaniciAra(this);
    }
    
   
}
