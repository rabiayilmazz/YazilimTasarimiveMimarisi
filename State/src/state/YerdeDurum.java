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
public class YerdeDurum implements State{

    Context context;
    public YerdeDurum(Context context) {
        context = context;
    }

    
    @Override
    public void durdur() {
        System.out.println("Drobe durduruldu");
        context.durumSetle(context.kapaliDurum);
    }

    @Override
    public void yerdeCalis() {
        System.out.println("Drone zaten yerde çalışır duurmda");
    }

    @Override
    public void yuksel() {
        System.out.println("Drone yükseliyor");
        context.durumSetle(context.havadaDurumu);
    }
    
}
