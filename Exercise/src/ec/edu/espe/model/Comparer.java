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
public class Comparer
{
            private int  analystClassification;
            private String analystRank;
            private Analyst analystsMinor;
    
    public Comparer(int analystClassification, String analystRank, Analyst analystsMinor) 
    {
        this.analystClassification = analystClassification;
        this.analystRank = analystRank;
        this.analystsMinor = analystsMinor;
    }
    public static void main(String[] args) {
        Analyst analist=new Analyst ("Kevin","Gk",10);
    }
    public int getAnalystClassification() {
        return analystClassification;
    }

    public void setAnalystClassification(int analystClassification) {
        this.analystClassification = analystClassification;
    }

    public String getAnalystRank() {
        return analystRank;
    }

    public void setAnalystRank(String analystRank) {
        this.analystRank = analystRank;
    }

    public Analyst getAnalystsMinor() {
        return analystsMinor;
    }

    public void setAnalystsMinor(Analyst analystsMinor) {
        this.analystsMinor = analystsMinor;
    }
    

}
