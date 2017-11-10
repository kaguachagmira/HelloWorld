/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arreglos.modelo;

/**
 *
 * @author Kevin111
 */
public class Mountain 
{
        private String name;
        private double  height;
        private String country;

    public Mountain(String name, double height, String country) {
        this.name = name;
        this.height = height;
        this.country = country;
    }
    public Mountain()
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
}
