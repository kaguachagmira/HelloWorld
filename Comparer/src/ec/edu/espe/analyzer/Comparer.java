/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.analyzer;

import ec.edu.espe.model.Analyzer;
import ec.edu.espe.model.History;

/**
 *
 * @author Labs-DECC
 */
public class Comparer {
    public static void main(String[] args) {
        Analyzer analista = new Analyzer ("Kevin","KE",new History());
        System.out.println(analista.getName());
    }
}
