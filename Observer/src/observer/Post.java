/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.awt.Image;

/**
 *
 * @author Rabia
 */
public class Post {
    private String baslık;
    private String icerik;
    private Image image;

    /**
     * @return the baslık
     */
    public String getBaslık() {
        return baslık;
    }

    /**
     * @param baslık the baslık to set
     */
    public void setBaslık(String baslık) {
        this.baslık = baslık;
    }

    /**
     * @return the icerik
     */
    public String getIcerik() {
        return icerik;
    }

    /**
     * @param icerik the icerik to set
     */
    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    /**
     * @return the image
     */
    public Image getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Image image) {
        this.image = image;
    }
    
    
}
