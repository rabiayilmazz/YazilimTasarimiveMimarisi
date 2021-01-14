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
public interface Visitorr {
   public  void visit(NormKullanici normal);
   public void visit(GoldKullanici gold);
   public void visit(PremKullanici prem);

    
}
