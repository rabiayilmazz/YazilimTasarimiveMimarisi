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
public class KapaliDurum implements State{

    Context context = null;
    public KapaliDurum(Context context) {
        context = context;
    }

    @Override
    public void durdur() {
        System.out.println("Drone zaten kapalı");
    }

    @Override
    public void yerdeCalis() {
        System.out.println("Drone yerde çalışmaya başladı");
        //context.durumSetle(context.yerdeDurum);
    }

    @Override
    public void yuksel() {
        System.out.println("Drone çalışmadan yükselemez. öncelikle yerde çalışması lazım");
    }
    
}
