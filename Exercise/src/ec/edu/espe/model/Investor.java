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
public class Investor {

    public Investor(int sharesNumber, int sharesPriceSale, int money, String rankInvestor) {
        this.sharesNumber = sharesNumber;
        this.sharesPriceSale = sharesPriceSale;
        this.money = money;
        this.rankInvestor = rankInvestor;
    }
    
    int sharesNumber;
    int sharesPriceSale;
    int money ;
    String rankInvestor;

    public int getSharesNumber() {
        return sharesNumber;
    }

    public void setSharesNumber(int sharesNumber) {
        this.sharesNumber = sharesNumber;
    }

    public int getSharesPriceSale() {
        return sharesPriceSale;
    }

    public void setSharesPriceSale(int sharesPriceSale) {
        this.sharesPriceSale = sharesPriceSale;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getRankInvestor() {
        return rankInvestor;
    }

    public void setRankInvestor(String rankInvestor) {
        this.rankInvestor = rankInvestor;
    }
    
}
