/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rabia
 */

public class App {
    public static void main(String[] args) {
        Database firstInstanceRequest = Database.getInstance();
        Database secondInstanceRequest = Database.getInstance();

        Boolean isEquals = firstInstanceRequest == secondInstanceRequest;

        System.out.printf("Database referansı eşit mi: %b", isEquals); //output: database referansı eşit  mi?: true
    }
}
