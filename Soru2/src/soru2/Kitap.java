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
public class Kitap extends Materyal{
    private int ISBNno;
    private String kod;

    public Kitap(String ad, String tip,  int ISBNno, String kod){
        setAd(ad);
        setTip(tip);
        this.ISBNno = ISBNno;
        this.kod = kod;
    }

}
