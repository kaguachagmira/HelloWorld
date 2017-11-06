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
public class Analyst 
   {
        private String aName ;
        private String aRank;
        private Record aRecord;

    public Analyst(String aName, String aRank, int investorsNumber)
        {
            this.aName = aName;
            this.aRank = aRank;
            this.investorsNumber = investorsNumber;
        }
    

        int investorsNumber;

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaRank() {
        return aRank;
    }

    public void setaRank(String aRank) {
        this.aRank = aRank;
    }

    public int getInvestorsNumber() {
        return investorsNumber;
    }

    public void setInvestorsNumber(int investorsNumber) {
        this.investorsNumber = investorsNumber;
    }
        
}
