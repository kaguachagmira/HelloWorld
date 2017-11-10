/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arreglos.tipos;

import ec.edu.espe.arreglos.modelo.Mountain;

/**
 *
 * @author Kevin111
 */
public class TestingMountains 
{
    public static void main(String[] args) {
        
        Mountain mountains[]= new Mountain [10];
        for (int i=0; i<mountains.length; i++)
        {
            mountains[i] = new Mountain();
            mountains[i].setName("Nevado");
            mountains[i].setHeight(8000);
            if(i%2==0)
            {
                mountains[i].setCountry("NEPAL");
            }
            else
            {
                mountains[i].setCountry("TIBET");
            }
        }
        
        for (Mountain montaña:mountains)
        {
            System.out.print("Mountain: " + montaña.getName() + " Height: " + montaña.getHeight() + " Contry: " +montaña.getCountry());
            System.out.println();
        }
        
    }
    
}
