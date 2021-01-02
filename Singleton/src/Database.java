/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rabia
 */


public class Database {
    private static Database database;

    private Database() {
        // construct metodu erişime kapatıldı.
    }

    public static Database getInstance() {
        if (database == null) {
            Object synchronizedObject = new Object(); // nesne henüz oluşturulmadıysa oluştur.

            synchronized (synchronizedObject) {
                if (database == null) {
                    database = new Database();
                }
            }
        }
        return database; // oluşan nesneyi döndür.
    }
}

