package soru2;

/**
 *
 * @author Rabia
 */
public class Soru2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci("ogrenciMehmet", "Mehmet Turgut", "ogrenci","1923" );
        Yonetici yonetici = new Yonetici("yoneticiAhmet", "Ahmet Demir", "yonetici","2345" );
        
        yonetici.ekle();
        ogrenci.ekle();
        System.out.println("----\n");
        
        Ogrenci ogrenci2 = new Ogrenci("Öğrenci2", "Mehmet Turgut", "ogrenci","1920" );
        ogrenci2.ekle();
        System.out.println("----\n");
        
        Ogrenci ogrenci3 = new Ogrenci("Öğrenci3", "Mehmet Turgut", "ogrenci","1900" );
        ogrenci3.ara();
        System.out.println("----\n");
        
        yonetici.sil();
        ogrenci.sil();
        System.out.println("----\n");
        
        yonetici.ara();
        ogrenci.ara();
        System.out.println("----\n");
        
        Kitap kitap = new Kitap("Seker Portakali" , "kitap" , 123456 , "TA-24");
        kitap.ekle();
        kitap.ara();
        kitap.sil();
        System.out.println("----\n");
        
        Ekitap ekitap = new Ekitap("Suc ve Ceza","e-kitap","www.ekitapadresi.com/sucveceza.pdf");
        ekitap.ekle();
        ekitap.ara();
        ekitap.sil();
           
        
        
        
    }
    
}
