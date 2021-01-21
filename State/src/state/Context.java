/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author Rabia
 */
public class Context {
    public State kapaliDurum;
    public State yerdeDurum;
    public State havadaDurumu;
    
    State simdiki;

    public Context() {
        kapaliDurum = new KapaliDurum(this);
        yerdeDurum = new YerdeDurum(this);
        havadaDurumu = new HavadaDurumu(this);
        simdiki = kapaliDurum;
    }
    
    public State durumGetir(){
        return simdiki;
    }
    
    public void durumSetle( State state){
        simdiki = state;
    }
    
    public void durdurulsun(){
        simdiki.durdur();
    }
    
    public void yerdeCalissin(){
        simdiki.yerdeCalis();
    }
    
    public void yukselsin(){
        simdiki.yuksel();
    }

    
}
