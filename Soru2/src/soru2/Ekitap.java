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
public class Ekitap extends Materyal{
    private String site;
    
    public Ekitap(String ad, String tip, String site){
        setAd(ad);
        setTip(tip);
        this.site = site;
    }
}
