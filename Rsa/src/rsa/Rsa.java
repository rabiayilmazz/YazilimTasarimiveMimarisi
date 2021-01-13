/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Rabia
 */
public class Rsa {
   
    public static void main(String[] args) {
    int p = 11;
    int q = 17;
    int n = p*q;
    int fonk = (p-1)*(q-1);
    Random rand = new Random();
    int e = rand.nextInt(fonk);
        int[] values = new int[3];
        values[0] = 111;
        values[1] = 112;
        values[2] = 303;
        System.out.println(" e: " + e + " n: " + n);
        for(int i = 0 ; i<3 ; i++){
            values[i] = values[i]%n;
            double k = (double) Math.pow(values[i],e);
            k = values[i]%n;
            System.out.println("deger: " + k);
        }
        
    }
     public void sifreli(int[] list, int e) {
        for(int i = 0 ; i<=list.length ; i++ ){
            e = 3;
            int dizi[] = null;
            int a = list[i];
            dizi[i] = (int) Math.pow(a,e);
            
            System.out.println("çalıştı" + dizi[i]);
        }
    }
}
