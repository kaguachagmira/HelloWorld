/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author Kevin111
 */
public class Record {

    public Record(int purchaseAverageSalePrice, int purchaseAverageSaleShares) {
        this.purchaseAverageSalePrice = purchaseAverageSalePrice;
        this.purchaseAverageSaleShares = purchaseAverageSaleShares;
    }
    
    int  purchaseAverageSalePrice;
    int purchaseAverageSaleShares;

    public int getPurchaseAverageSalePrice() {
        return purchaseAverageSalePrice;
    }

    public void setPurchaseAverageSalePrice(int purchaseAverageSalePrice) {
        this.purchaseAverageSalePrice = purchaseAverageSalePrice;
    }

    public int getPurchaseAverageSaleShares() {
        return purchaseAverageSaleShares;
    }

    public void setPurchaseAverageSaleShares(int purchaseAverageSaleShares) {
        this.purchaseAverageSaleShares = purchaseAverageSaleShares;
    }
    
}
