/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Rabia
 */
public class Kitap {
    public String isim;
    private String yazar;
    protected String editör; //alt sınıflar hariç diğer paketlere izin yoktur.    
    
    
    public void ismiGöster(){
        System.out.println("Kitap ismi gösteriliyor");
    }
    
}
