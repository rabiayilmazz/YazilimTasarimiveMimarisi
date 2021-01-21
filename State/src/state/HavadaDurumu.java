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
public class HavadaDurumu implements State{
    Context context;

    public HavadaDurumu(Context context) {
        context = context;
    }
    
    @Override
    public void durdur() {
        System.out.println("Drone yere inmeden durdurulamaz. Öncelikle yere indirilmeli.");
    }

    @Override
    public void yerdeCalis() {
        System.out.println("Drone yere iniyor");
        context.durumSetle(context.yerdeDurum);
    }

    @Override
    public void yuksel() {
        System.out.println("Drone zaten havada");
    }
    
}
