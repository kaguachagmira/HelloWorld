/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arreglos.modelo;

/**
 *
 * @author LABS-DECC
 */
public class Animal 
{
    private int id;
    private String ojos;
    private String name;

    public Animal(int id, String ojos, String name)
    {
        this.id = id;
        this.ojos = ojos;
        this.name = name;
    }
    public Animal()
    {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOjos() {
        return ojos;
    }

    public void setOjos(String ojos) {
        this.ojos = ojos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  
}
