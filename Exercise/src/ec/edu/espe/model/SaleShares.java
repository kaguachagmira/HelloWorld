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
public class SaleShares {

    public SaleShares(int salePrice, int salesShares, int brokerComission, int quanty) {
        this.salePrice = salePrice;
        this.salesShares = salesShares;
        this.brokerComission = brokerComission;
        this.quanty = quanty;
    }
    
    int salePrice;
    int salesShares;
    int brokerComission;
    int quanty;

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public int getSalesShares() {
        return salesShares;
    }

    public void setSalesShares(int salesShares) {
        this.salesShares = salesShares;
    }

    public int getBrokerComission() {
        return brokerComission;
    }

    public void setBrokerComission(int brokerComission) {
        this.brokerComission = brokerComission;
    }

    public int getQuanty() {
        return quanty;
    }

    public void setQuanty(int quanty) {
        this.quanty = quanty;
    }
    
}
