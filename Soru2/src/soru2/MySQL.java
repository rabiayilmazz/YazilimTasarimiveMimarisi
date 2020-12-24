/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru2;

import java.util.ArrayList;

/**
 *
 * @author Rabia
 */
public class MySQL extends Database{
    private ArrayList<Materyal> materyaller;  
    private ArrayList<Kullanici> kullaniciler;
    
    public MySQL(){
        materyaller = new ArrayList<Materyal>();
        kullaniciler = new ArrayList<Kullanici>();
    }
    
}
