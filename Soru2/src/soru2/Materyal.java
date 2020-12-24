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
public abstract class Materyal implements Duzenle{ 
    private String ad;
    private String tip;
    
    MySQL veritabani = new MySQL();

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
    @Override
    public void ekle() {
        veritabani.materyalEkle(this);
    }

    @Override
    public void sil() {
        veritabani.materyalSil(this);
    }

    @Override
    public void ara() {
        veritabani.materyalAra(this);
    }
}
