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
// visitiple accept sınıfı burada olacak
public interface IMesajIslemleri {
    public void kisiBul(String kisi);
    public void mesajAl();
    public void mesajGonder(String mesaj);  
    public void accept(Visitorr visitor);
}
